package com.yedam.myserver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.yedam.myserver.emp.vo.Employee;

public class LamdaTest {
	public static void main(String[]args) {
		List<Employee> list = new ArrayList<>();
		
		list.add(Employee.builder().email("a@a.c").salary(1000).build());
		list.add(Employee.builder().email("s@a.c").salary(1500).build());
		list.add(Employee.builder().email("d@a.c").salary(3000).build());
		list.add(Employee.builder().email("f@a.c").salary(10000).build());
		
		
		
		//람다식 변환 이전의 코드.
		Collections.sort(list, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmail().compareTo(o2.getEmail());
		}} );
		
		//람다식의 조건 : 부모 인터베이스의 오버라이딩 메소드가 1개 인 경우 *중요함*
		//해당 메소드의 헤드 부분(부분 생략가능)을 가져온다
		Collections.sort(list, (Employee o1, Employee o2) -> o1.getSalary()-o2.getSalary());
		
		for(Employee emp : list) {
			System.out.println(emp.getEmail()+ ":"+ emp.getSalary());
		}
	}

}


class EmpComp implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmail().compareTo(o2.getEmail());
	}
}
