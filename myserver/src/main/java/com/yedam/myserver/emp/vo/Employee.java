package com.yedam.myserver.emp.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//NULL이 아닐경우 NULL인경우 제외.
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data	//getter, setter 등등 만들어주는 친구
@Builder//생성자 만들어주는 친구
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private Integer department_id;
	private Integer manager_id;
	private Integer commission_pct;
	private Integer salary;
	private String job_id;
	//날짜 포맷을 연-월-일 ex) 1998-00-00으로 변경
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date hire_date;
	//해당 @ 아래의 글자들은 제외
	@JsonIgnore
	private String phone_number;
	private String email;
	private String last_name;
	//필드의 이름을 "" 와 같이 변경
	@JsonProperty("fname")
	private String first_name;
	private Integer employee_id;
	private String department_name;
	private String location_id;
	
	private Departments department;
	
	
}
