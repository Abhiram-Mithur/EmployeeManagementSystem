package com.example.EmployeeManagementSystem.Dto;

public class CustomerUpdateDTO {

	private String id;
    private String firstName;
    private String lastName;
    private String salutation;
    private String dob;
	public CustomerUpdateDTO(String id, String firstName, String lastName, String salutation, String dob) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salutation = salutation;
		this.dob = dob;
	}
	public CustomerUpdateDTO() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salutation="
				+ salutation + ", dob=" + dob + "]";
	}
}
