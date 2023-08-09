import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class employeeClass {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		Employee emp1 = new Employee(6, 28, "Darsh", 20000, "dar@gmail.com", null);
		Employee emp2 = new Employee(2, 25, "Rohan", 15000, "ro@gmail.com", null);
		Employee emp3 = new Employee(3, 38, "Rushi", 300000, "ru@gmail.com", null);
		Employee emp4 = new Employee(4, 40, "Shubham", 400000, "shu@gmail.com", null);
		Employee emp5 = new Employee(5, 21, "Amit", 10000, "ami@gmail.com", null);
		Employee emp6 = new Employee(1, 22, "Saurabh", 12000, "sau@gmail.com", null);

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp6);

		System.out.println("Original Salary :" + employees);

		// Logic to increment salary whose age is greater than 25 by 1.10 and 2.20 if
		// the age is greater than 35
		List<Employee> incrementedlist = employees.stream().map(e -> {
			if (e.getAge() > 25) {
				e.setSalary(e.getSalary() * 1.10);
			} else if (e.getAge() > 35) {
				e.setSalary(e.getSalary() * 2.20);
			}
			return e;
		}).collect(Collectors.toList());

		System.out.println("Incremented salary :" + incrementedlist);

		// Logic to find list of top 3 employees based on salaries
		List<Employee> topThree = employees.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary()))
				.limit(3).collect(Collectors.toList());

		System.out.println("Employee list having top three salaries are :" + topThree);

		// Logic to find employee record with 4th lowest age
		List<Employee> emp = employees.stream().distinct().sorted((e1, e2) -> e1.getAge() - e2.getAge()).skip(3)
				.collect(Collectors.toList());

		System.out.println("Employee having 4th lowest age is: " + emp);

	}
}
