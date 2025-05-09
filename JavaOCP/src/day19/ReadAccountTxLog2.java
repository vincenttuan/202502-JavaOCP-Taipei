package day19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadAccountTxLog2 {

	public static void main(String[] args) {
		List<AccountTxLog> list = findAccountTxLogs();
		print(list);
	}
	
	public static void print(List<AccountTxLog> list) {
		list.forEach(aTxLog -> {
			System.out.printf("|%-10d|%-10s|%-10s|%,10d|%10s|%n", 
					aTxLog.getId(), aTxLog.getName(), aTxLog.getTxType(), aTxLog.getAmount(), aTxLog.getTxDate());
		});
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
			
			while(rs.next()) {
				Integer id = rs.getInt("id");
				String name = rs.getString("name");
				String txType = rs.getString("tx_type");
				Integer amount = rs.getInt("amount");
				Date txDate = rs.getDate("tx_date");
				// 建立 AccountTxLog 物件
				AccountTxLog aTxLog = new AccountTxLog(id, name, txType, amount, txDate);
				// 注入到 list 集合中保存
				list.add(aTxLog);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
