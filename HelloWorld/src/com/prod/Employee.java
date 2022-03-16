package com.prod;

public class Employee {
	//field.
	private int employeeId; //
	private int salary; //
	private String employeeName; //
	private String department; //
	private String job;
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public int getEmployeeId() {
		return this.employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmployeeName() {
	     return this.employeeName;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getJob() {
		return this.job;
	}
	
	
	public void setSalary(int salary) {
		if(salary < 0) {
			this.salary = 100000;	
		}else {
			this.salary = salary;
		}
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public String getEmpInfo() {
		String result = this.employeeName+" 님 의 부서는 " //
	+ this.department + "입니다. 직무는 " + this.job+ "이며" //
	+ " 현 급여지급 현황은 "+ this.salary + " 원 입니다.";
		return result;
	}

}
