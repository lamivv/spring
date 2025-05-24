package com.yedam.ex02;

import org.springframework.context.annotation.Bean;

//자바기반 설정
public class Ex02Configure {
	@Bean
	public Chef chef() {
		return new Chef();
	}
	
	@Bean
	public Restaurant restaurant() {
		return new Restaurant(chef());
	}
}
