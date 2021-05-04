package Odev3_4Gun.Entitites;
import java.time.LocalDate;

public class Customer extends Person{
	private int customerId;
	private String firstName;
	private String lastName;
	private Long nationalityId;
	private LocalDate dateOfBrith;
	private String email;
	public Customer() {
		
	}

	public Customer(int customerId, String firstName, String lastName, Long nationalityId, LocalDate dateOfBrith, String email) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBrith = dateOfBrith;
		this.email = email;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	public Long getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(Long nationalityId) {
		this.nationalityId = nationalityId;
	}

	public LocalDate getDateOfBrith() {
		return dateOfBrith;
	}

	public void setDateOfBrith(LocalDate dateOfBrith) {
		this.dateOfBrith = dateOfBrith;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
