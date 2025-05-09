package day19;

public class AccountBalance {
	private Integer id;
	private String name;
	private Integer balance;
	
	public AccountBalance(Integer id, String name, Integer balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
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

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	
	
}
