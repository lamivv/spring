package com.yedam.app.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//2. 생성자 주입
// @Setter // => 모든필드 세터
// @AllArgsConstructor
// @RequiredArgsConstructor
@Component("tv")
public class SamsungTV implements TV {
	
	//1. 필드 주입 방법
	//@Autowired
	//3. setter방식
	// @Setter(onMethod_ = {@Autowired}) // => 여기만 세터
	private Speaker speaker; //NullPointerError
	


	public void powerOn() {
		System.out.println("SamsungTV powerOn");
	}

	public void powerOff() {
		System.out.println("SamsungTV powerOff");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
