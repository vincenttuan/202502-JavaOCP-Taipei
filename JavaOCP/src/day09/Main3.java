package day09;

public class Main3 {

	public static void main(String[] args) {
		Employee employee = new Employee(4_0000);
		Employee manager = new Manager(6_0000, 3_0000);
		Employee supervistor = new Supervistor(12_0000, 10_0000, 200_0000);
		
		System.out.println(employee.getSalary());
		System.out.println(manager.getSalary());
		System.out.println(supervistor.getSalary());
		
	}

}
