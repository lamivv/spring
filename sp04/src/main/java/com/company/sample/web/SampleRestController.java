package com.company.sample.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController // 리턴 값 그대로를 보냄. 스트링이면 스트링 , vo면 vo
public class SampleRestController {
	@GetMapping("/api")
	public String main() {
		return "home";
	}
	
}
