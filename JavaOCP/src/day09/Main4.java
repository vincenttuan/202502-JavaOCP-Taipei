package day09;

public class Main4 {

	public static void main(String[] args) {
		Employee employee1 = new Employee(4_0000);
		Employee employee2 = new Manager(6_0000, 3_0000);
		Employee employee3 = new Supervistor(12_0000, 10_0000, 200_0000);
		
		Employee[] employees = {employee1, employee2, employee3};
		// 請問薪資總和 = ?
		int totalSalary = 0;
		for(Employee employee : employees) {
			totalSalary += employee.getSalary();
		}
		System.out.printf("薪資總和: %,d%n", totalSalary);
		// 請問預算總合 = ?
		
	}

}
