package ListToMap;

public class Employee {

	private String name;
	private String city;
	private int phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

//	public Employee(String name, String city, int phone) {
//		super();
//
//	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", phone=" + phone + "]";
	}

}
