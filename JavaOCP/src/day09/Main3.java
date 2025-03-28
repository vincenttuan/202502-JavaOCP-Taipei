package day09;

public class Main3 {

	public static void main(String[] args) {
		Employee employee1 = new Employee(4_0000);
		Employee employee2 = new Manager(6_0000, 3_0000);
		Employee employee3 = new Supervistor(12_0000, 10_0000, 200_0000);
		
		System.out.println(employee1.getSalary());
		System.out.println(employee2.getSalary());
		System.out.println(employee3.getSalary());
		
		System.out.println(((Manager)employee2).getBudget()); // 利用轉型
		System.out.println(((Manager)employee3).getBudget());
		
		System.out.println(((Supervistor)employee3).getStockOptions());
		
	}

}
