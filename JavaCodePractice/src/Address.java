
public class Address implements Comparable<Address> {

	private int pincode;
	private String streetname;

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", streetname=" + streetname + "]";
	}

	@Override
	public int compareTo(Address o) {
		return this.pincode = o.pincode;
	}

}
