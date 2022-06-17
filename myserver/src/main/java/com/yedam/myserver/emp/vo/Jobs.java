package com.yedam.myserver.emp.vo;

import java.util.List;

import lombok.Data;

@Data
public class Jobs {
	private Integer max_salary;
	private Integer min_salary;
	private String job_title;
	private String job_id;
	private List<Employee> employees;
	
}
