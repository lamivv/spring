package com.yedam.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.domain.Employees;
import com.yedam.domain.EmployeesDepartmenListVO;
import com.yedam.domain.EmployeesDepartmentVO;
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
	
//	@PostMapping("/ex04")
//	public String ex04(@RequestBody SampleDTO sample) {
//		System.out.println(sample);
//		return "main";
//	}	
	
	@PostMapping("/ex04")
	public String ex04(@RequestBody EmployeesDepartmentVO emp) {
		System.out.println(emp);
		return "main";
	}	
	
	@PostMapping("/ex05")
	public String ex05(@RequestBody EmployeesDepartmenListVO emp) {
		System.out.println(emp);
		return "main";
		//{"employeeId":100,"firstName":"땅콩","department":{"departmentName":"개발","departmentId":30}}
		//{"employeeId":100,"firstName":"땅콩","department":[{"departmentName":"개발","departmentId":30},{"departmentName":"개발","departmentId":30}]}
	}
	
	// 쿼리스트링
//	@GetMapping("/ex06")
//	@ResponseBody
//	public SampleDTO ex06(SampleDTO sample) {
//		return sample;
//	}
	
	// 제이슨
	@PostMapping("/ex06")
	@ResponseBody
	public SampleDTO ex06(@RequestBody SampleDTO sample) {
		return sample;
	}
	
	@GetMapping("/ex07")
	@ResponseBody
	public String ex07() {
		return "main";
	}
	
	@GetMapping("/ex08")
	public String ex08(Model model, RedirectAttributes rttr) {
		rttr.addFlashAttribute("msg", "휘발성파라미터");
		rttr.addAttribute("name", "땅콩"); // 파라미터로 넘김 / 겟방식/ ? name=땅콩
		model.addAttribute("name", "땅콩"); // 이건 안됨
		return "redirect:ex01";
	}
}
