package day19;

import java.util.Date;

public class AccountTxLog {
	private Integer id;
	private String name;
	private String txType;
	private Integer amount;
	private Date txDate;
	
	public AccountTxLog() {
		
	}
	
	public AccountTxLog(Integer id, String name, String txType, Integer amount, Date txDate) {
		this.id = id;
		this.name = name;
		this.txType = txType;
		this.amount = amount;
		this.txDate = txDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTxType() {
		return txType;
	}

	public void setTxType(String txType) {
		this.txType = txType;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Date getTxDate() {
		return txDate;
	}

	public void setTxDate(Date txDate) {
		this.txDate = txDate;
	}
	
	
}
