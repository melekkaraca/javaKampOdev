package Odev2_4Gun.Entities;

import java.time.LocalDate;

import Odev2_4Gun.Abcstract.Entity;

public class Customer implements Entity{
	private int id;
	

	private String firstName;
	private String lastName;
	private LocalDate DateOfBrith;
	private Long NationalityId;
	public Customer() {}
	
	public Customer(int id, String firstName, String lastName, LocalDate dateOfBrith, Long nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		DateOfBrith = dateOfBrith;
		NationalityId = nationalityId;
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

	public LocalDate getDateOfBrith() {
		return DateOfBrith;
	}

	public void setDateOfBrith(LocalDate dateOfBrith) {
		DateOfBrith = dateOfBrith;
	}

	public Long getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(Long nationalityId) {
		NationalityId = nationalityId;
	}
}
