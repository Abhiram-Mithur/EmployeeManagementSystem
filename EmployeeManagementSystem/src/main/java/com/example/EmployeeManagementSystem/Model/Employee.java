package com.example.EmployeeManagementSystem.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "users")
public class Employee {
    @Id
    private String id;
    private int employeeid;
    private String employeename;
    private String email;
    private String password;

    public Employee(int employeeid, String employeename, String email, String password) {
        this.id = UUID.randomUUID().toString();
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.email = email;
        this.password = password;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
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

    @Override
    public String toString() {
        return "Employee [id=" + id + ", employeeid=" + employeeid + ", employeename=" + employeename + ", email=" + email
                + ", password=" + password + "]";
    }
}
