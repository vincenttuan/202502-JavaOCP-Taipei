package day19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReadAccountTxLog2 {

	public static void main(String[] args) {
		
	}
	
	public static List<AccountTxLog> findAccountTxLogs() {
		List<AccountTxLog> list = new ArrayList<>();
		
		// 查詢每一個帳戶的交易紀錄
		String sql = "select a.id, a.`name`, t.tx_type, t.amount, t.tx_date "
					 + "from account a "
					 + "left join tx_log t on a.id = t.account_id";
		
		try(Connection conn = MySQLConnection.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)) {
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
