package com.example.web;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpController {
	@GetMapping("/empList")
	public String empList (Model model) {
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id","100");
		map.put("name", "홍길동");
		list.add(map);
		
		map.put("id","101");
		map.put("name", "김기자");
		list.add(map);
		
		model.addAttribute("list", list);
		return "empList";
	}

}
