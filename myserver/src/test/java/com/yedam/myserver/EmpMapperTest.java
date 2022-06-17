package com.yedam.myserver;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.myserver.emp.mapper.EmployeeMapper;
import com.yedam.myserver.emp.vo.Employee;
import com.yedam.myserver.emp.vo.Jobs;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/*-context.xml")
//↑ 스프링 설정파일을 불러와서 스프링 구성 (Junit 이용)
public class EmpMapperTest {
	@ Autowired EmployeeMapper mapper;
	
	
	
	@Test
	public void test() {
		List<Employee> list = mapper.findEmployees();
		for(Employee emp : list ) {
			System.out.println(emp.getFirst_name() + ":"+ 
		emp.getDepartment().getDepartment_name());
		}
	}
	
	@Test
	public void colleTest() {
		List<Jobs> list = mapper.findJobs();
		for(Jobs job: list) {	
		System.out.println(job.getJob_id()+ " :: " + job.getJob_title());
			for(Employee emp : job.getEmployees()) {
				System.out.println(emp.getEmployee_id()+ "::" + emp.getFirst_name());
			}
		}
	}

}
