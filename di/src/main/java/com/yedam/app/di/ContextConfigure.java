package com.yedam.app.di;

import org.springframework.context.annotation.Bean;

public class ContextConfigure {
	@Bean
	public Speaker speaker() {
		return new AppleSpeaker();
	}
	
	// 생성자방식
//	@Bean
//	public TV tv() {
//		return new LgTV(speaker());
//	}
	
	// 세터방식
//	@Bean
//	public TV tv() {
//		LgTV tv = new LgTV();
//		tv.setSpeaker(speaker());
//		return tv;
//	}
	
	@Bean
	public TV tv() {
		SamsungTV tv = new SamsungTV();
		tv.setSpeaker(speaker());
		return tv;
	}
}
