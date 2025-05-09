package day19;

public interface SQL {
	String ACCOUNT_BALANCE = "select a.id, a.`name`, coalesce(sum(case when t.tx_type = 'deposit' then t.amount "
			+ "when t.tx_type = 'withdraw' then -t.amount "
			+ "else 0 end), 0) as balance "
			+ "from account a "
			+ "left join tx_log t on a.id = t.account_id "
			+ "group by a.id, a.name "; 
	
	String ACCOUNT_TXLOG = "select a.id, a.`name`, t.tx_type, t.amount "
			 + "from account a "
			 + "left join tx_log t on a.id = t.account_id";
}
