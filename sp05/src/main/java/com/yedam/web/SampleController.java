package com.yedam.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.domain.Employees;
import com.yedam.domain.SampleDTO;

@Controller
public class SampleController {
	@GetMapping("/ex01")
	public String ex01(SampleDTO sample, Model model) {
		System.out.println(sample);
		model.addAttribute("dept", "개발");
		return "main";
	}

	@GetMapping("/ex02")
	public String ex02(@RequestParam(name = "name") String name,
			@RequestParam(name = "age", required = false, defaultValue = "20") int age) {
		System.out.println(name);
		System.out.println(age);
		return "main";
	}

	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("hobby") List<String> param) {
		System.out.println(param);
		return "main";
	}

	@GetMapping("/ex03/{class}/{stdno}")
	public String path3(@PathVariable("class") String class1, @PathVariable("stdno") String stdno) {
		System.out.println("class: " + class1 + ", stdno: " + stdno);
		return "main";
	}
	
	@PostMapping("/ex04")
	public String ex04(@RequestBody SampleDTO sample) {
		System.out.println(sample);
		return "main";
	}
	
	@PostMapping("/ex05")
	public String ex05(@RequestBody Employees entity) {
		System.out.println(entity);
		return "main";
		//{"employeeId":100,"firstName":"땅콩","department":{"departmentName":"개발","departmentId":30}}
		//{"employeeId":100,"firstName":"땅콩","department":[{"departmentName":"개발","departmentId":30},{"departmentName":"개발","departmentId":30}]}
	}
}
