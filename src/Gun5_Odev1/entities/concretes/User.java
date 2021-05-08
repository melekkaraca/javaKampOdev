package Gun5_Odev1.entities.concretes;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int statusId;
	private Boolean active;
	private User() {
		
	}
	public User(int id, String firstName, String lastName, String email, String password, int statusId, Boolean active) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.statusId = statusId;
		this.active = active;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatusId() {
		return id;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	 
}
