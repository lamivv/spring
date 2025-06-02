package com.company.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.company.sample.service.SampleService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

//@AllArgsConstructor
@RequiredArgsConstructor
@Controller // view리졸브... return이 view파일 명을 말함
public class SampleController {
	
	private final SampleService sampleService;
	
	@GetMapping("/")
	public String main() {
		sampleService.sample("");
		return "home"; // WEB-INF/views/home.jsp
	}
	
	@GetMapping({"/all", "/member", "/admin", "/accessError", "/login"})
	public void all(HttpServletRequest request) {
		System.out.println(request.getRequestURI());
	}
	
	
}
