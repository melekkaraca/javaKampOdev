package Odev1_2Gun;

public class Teacher {
	public Teacher() {
		
	}
	public Teacher(int id, String firstName, String lastName, String phoneNumber, String email, Boolean active) {
		this();
		this.id=id;
		this.firstName = firstName;
		this.lastName=lastName;
		this.phoneNumber = phoneNumber;
		this.email=email;
		this.active=active;
	}
	public int id;
	public String firstName;
	public String lastName;
	public String phoneNumber;
	public String email;
	public Boolean active;
}
