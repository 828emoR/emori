package com.yedam.myserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.myserver.emp.vo.Employee;

@RestController

public class AjaxController {
	
	@GetMapping("req")
	public String regGet() {
		return"Get";
	}
	
	@PostMapping("req")
	@ResponseBody //자바객체를 json String 변환
	//requestBody => json String 을 파싱해서 VO 객체 변화
	public String regPost(@RequestBody Employee vo) throws InterruptedException {
		//Thread.sleep(3000);
		System.out.println(vo.getFirst_name());
		return"Post";
	}

}
