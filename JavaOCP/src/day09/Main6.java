package day09;

import java.util.stream.Stream;

public class Main6 {

	public static void main(String[] args) {
		Employee employee1 = new Employee(4_0000);
		Employee employee2 = new Manager(6_0000, 3_0000);
		Employee employee3 = new Supervistor(12_0000, 10_0000, 200_0000);
		
		Employee[] employees = {employee1, employee2, employee3};
		// 請問薪資總和 = ? 使用 Stream 串流
		int totalSalary = Stream.of(employees) // [物件:employee1]->[物件:employee2]->[物件:employee3]
								.mapToInt(emp -> emp.getSalary()) // [int:40000] -> [int:60000] -> [int:120000]
								.sum();
		
		System.out.printf("薪資總和: %,d%n", totalSalary);
		
		// 請問預算總合 = ? 使用 Stream 串流
		int totalBudget = Stream.of(employees)
								.filter(emp -> emp instanceof Manager)
								.map(emp -> (Manager)emp)
								.mapToInt(mgr -> mgr.getBudget())
								.sum();
		
		System.out.printf("預算總和: %,d%n", totalBudget);
		
		// 請問股票總合 = ? 使用 Stream 串流
		
	}

}
