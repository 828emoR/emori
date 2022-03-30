package com.prod.emp;

public class Employee {
	//employees 테이블의 칼럼에 해당되는 필드를 설정함.
	private int employeeId;   //emplpoyees.employee_id
	private String firstname; //emplpoyees.firstname
	private String lastName;  //emplpoyees.lastName
	private String email;     //emplpoyees.email
	private int salary;       //emplpoyees.salary
	private String hireDate;  //emplpoyees.hireDate
	private String jobId;     //emplpoyees.jobId
	private String phoneNumber;
	
	
	
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstname=" + firstname + ", lastName=" + lastName + ", email="
				+ email + ", salary=" + salary + ", hireDate=" + hireDate + ", jobId=" + jobId + "]";
	}
	
	
}
