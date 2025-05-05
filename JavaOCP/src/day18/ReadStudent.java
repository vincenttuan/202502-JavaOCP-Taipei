package day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadStudent {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/web?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true&useSSL=false";
		String username = "root";
		String password = "12345678";
		//----------------------------
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 建立 jdbc driver 物件
			Class.forName("com.mysql.cj.jdbc.Driver"); // jdbc 4.0 可以省略不寫
			// 2. 建立 Connection 連線
			conn = DriverManager.getConnection(jdbcUrl, username, password);
			// 3. 編寫 sql 語句
			//String sql = "select id, name, chinese, english, math from student";
			String sql = "select id, name, chinese, english, math, " +
					     "(chinese + english + math) as total, (chinese + english + math)/3 as avg " +
					     "from student";
			// 4. 建立 Statement 用來放置 sql 語句
			stmt = conn.createStatement();
			// 5. 將 sql 語句透過 stmt 執行查詢送出並得到結果集合
			rs = stmt.executeQuery(sql);
			// 6.分析結果集合
			while (rs.next()) {
				// 取資料
				int id = rs.getInt("id"); // 將 id 的欄位內容放到 id 變數中
				String name = rs.getString("name");
				int chinese = rs.getInt("chinese");
				int english = rs.getInt("english");
				int math = rs.getInt("math");
				//int total = chinese + english + math;
				//double avg = total / 3.0;	
				int total = rs.getInt("total");
				double avg = rs.getDouble("avg");
				// 資料印出
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f%n", 
						id, name, chinese, english, math, total, avg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		

	}

}
