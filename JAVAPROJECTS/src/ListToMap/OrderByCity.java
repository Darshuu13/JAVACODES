package ListToMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderByCity {

	public static void main(String args[]) {
		List<Employee> empList = new ArrayList<>();

		createEmpList(empList);

		Map<String, List<Employee>> eMap = empList.stream().collect(Collectors.groupingBy(Employee::getCity));

		eMap.forEach((key, value) -> System.out.println("City: " + key + "Employee: " + value));
	}

	private static void createEmpList(List<Employee> empList) {
		
		Employee e1=new Employee();
		e1.setName("Andrew");
		e1.setCity("Chennai");
		e1.setPhone(5454);
		
		Employee e2 = new Employee();
		e2.setName("Virat");
		e2.setCity("Banglore");
		e2.setPhone(545484);
		
		Employee e3 = new Employee();
		e3.setName("Shreyas");
		e3.setCity("Mumbai");
		e3.setPhone(6554154);
		
		Employee e4 = new Employee();
        e4.setName("Shawn");
        e4.setCity("Mumbai");
        e4.setPhone(55567);

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);


	}

}
