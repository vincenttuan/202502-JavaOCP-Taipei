package day19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadAccountTxLog {

	public static void main(String[] args) {
		// 查詢每一個帳戶的交易紀錄
		String sql = "select a.id, a.`name`, t.tx_type, t.amount "
					 + "from account a "
					 + "left join tx_log t on a.id = t.account_id";
		try(Connection conn = MySQLConnection.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)) {
			
			// 標題列
			ResultSetMetaData md = rs.getMetaData();
			System.out.println("+----------+----------+----------+----------+");
			System.out.printf("|%-10s|%-10s|%-10s|%10s|%n", 
					md.getColumnName(1), md.getColumnName(2), md.getColumnName(3), md.getColumnName(4));
			System.out.println("+----------+----------+----------+----------+");
			// 內容
			while(rs.next()) {
				Integer id = rs.getInt("id");
				String name = rs.getString("name");
				String txType = rs.getString("tx_type");
				Integer amount = rs.getInt("amount");
				System.out.printf("|%-10d|%-10s|%-10s|%,10d|%n", id, name, txType, amount);
			}
			System.out.println("+----------+----------+----------+----------+");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
