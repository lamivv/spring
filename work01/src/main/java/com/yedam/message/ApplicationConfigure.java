package com.yedam.message;

import org.springframework.context.annotation.Bean;

public class ApplicationConfigure {
	@Bean
	public MessageService MessageService() {
		return new TwitterMessageServiceImpl();
	}
	
	// 세터방식
	@Bean
//	public MyController myApplication() {
//		MyController mc = new MyController();
//		mc.setService(MessageService());
//		return mc;
//	}
	// 생성자방식          
	public MyController myApplication() {
		return new MyController(MessageService());
	}	
}
