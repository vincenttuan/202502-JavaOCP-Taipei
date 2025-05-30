package day19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReadAccountBalance {

	public static void main(String[] args) {
		// 查詢每一個帳戶的餘額
		// 並建立 AccountBalance 物件來存放
		// 1.印出每一個人的帳戶餘額
		// 2.印出帳戶總餘額
		List<AccountBalance> list = finAccountBalances();
		list.forEach(ab -> {
			System.out.printf("%s 餘額:$%,d%n", ab.getName(), ab.getBalance());
		});
		
		int totalBalance = list.stream().mapToInt(ab -> ab.getBalance()).sum();
		System.out.printf("總餘額:$%,d%n", totalBalance);
		
	}
	
	
	public static List<AccountBalance> finAccountBalances() {
		List<AccountBalance> list = new ArrayList<>();
		try(Connection conn = MySQLConnection.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(SQL.ACCOUNT_BALANCE)) {
			
			while(rs.next()) {
				Integer id = rs.getInt("id");
				String name = rs.getString("name");
				Integer balance = rs.getInt("balance");
				AccountBalance accountBalance = new AccountBalance(id, name, balance);
				list.add(accountBalance);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
