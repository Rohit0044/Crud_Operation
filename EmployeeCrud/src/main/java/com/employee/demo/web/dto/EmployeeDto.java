package com.employee.demo.web.dto;

public class EmployeeDto {

	public Long id;
	public String firstName;
	public String lastName;
	public String email;

	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getEmailId() {
		return email;
	}

	public void setEmailId(String email) {
		this.email = email;
	}

	
}
