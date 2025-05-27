package com.yedam.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/emp")
@Controller // @Componenet(빈 등록)를 상속받고 만들어서 컨트롤러화
public class EmpController {
	
	@GetMapping("/empList")
	public String empList(Model model) {
		model.addAttribute("servertime",new Date());
		return "empList"; // 아무것도 적지 않아도 기본이 forward
	}

}
