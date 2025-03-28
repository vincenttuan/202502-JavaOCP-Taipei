package day09;

public class Supervistor extends Manager {
	private int stockOptions;
	
	public Supervistor(int salary, int budget, int stockOptions) {
		super(salary, budget);
		this.stockOptions = stockOptions;
	}

	public int getStockOptions() {
		return stockOptions;
	}

	public void setStockOptions(int stockOptions) {
		this.stockOptions = stockOptions;
	}
	
	
}
