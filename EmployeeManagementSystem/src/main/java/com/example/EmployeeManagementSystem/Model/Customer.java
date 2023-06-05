package com.example.EmployeeManagementSystem.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "EmployeeList")
public class Customer {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String salutation;
    private String dob;

    private static final String[] SALUTATION_OPTIONS = {"Mr", "Mrs", "Ms"};
    public Customer() {
    }

    // Getters and setters

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
    public String[] getSalutationOptions() {
        return SALUTATION_OPTIONS;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salutation=" + salutation
                + ", dob=" + dob + "]";
    }

    public Customer(String firstName, String lastName, String salutation, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salutation = salutation;
        this.dob = dob;
    }
}





