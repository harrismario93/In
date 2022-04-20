
public class Person {
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String email;

	public Person(String string) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;

	}

	public void setPhoneNumber(String Phonenumber) {
		this.phoneNumber = phoneNumber;

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;

	}
	public String toString() {
		 return "Name: " + getName() + " Class: " + this.getClass().getName();
	}

}
