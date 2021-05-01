package Odev2_3Gun;

public class Instructor extends User{
	private int instructorId;
	private String phoneNumber;
	public Instructor()
	{
		
	}
	public Instructor(int instructorId, String phoneNumber) {
		super();
		this.instructorId = instructorId;
		this.phoneNumber = phoneNumber;
	}
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
