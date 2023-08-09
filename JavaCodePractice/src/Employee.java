import java.util.Comparator;

//Employee Entity class
public class Employee implements Comparable<Employee> {

	private int id;

	private int age;

	private String name;

	private double salary;

	private String mail;

	private Address address;

	public Employee(int id, int age, String name, double salary, String mail, Address address) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.mail = mail;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + ", mail=" + mail
				+ ", address=" + address + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.id = o.id;
	}

	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};

}
