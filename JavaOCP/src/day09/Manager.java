package day09;

public class Manager extends Employee {
	private int budget;
	
	public Manager(int salary, int budget) {
		super(salary);
		this.budget = budget;
	}
	
	public int getBudget() {
		return budget;
	}
	
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
}
