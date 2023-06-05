package com.example.EmployeeManagementSystem.Dto;

public class CustomerDTO {

	
	private String id;
    private String firstName;
    private String lastName;
    private String salutation;
    private String dob;
	public CustomerDTO(String id, String firstName, String lastName, String salutation, String string) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salutation = salutation;
		this.dob = string;
	}
	public CustomerDTO() {
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
