package com.yedam.app.di;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 캡슐화
//@Data
@Setter
@Getter
@ToString
//@AllArgsConstructor // 모든생성자
//@NoArgsConstructor // 기본생성자
@RequiredArgsConstructor // final을 활용해 생성자 생성
public class Employee {
	
	private final String fname; // final 상수 값 변경 불가
	private final String lname;
	private final int salary;
	
}
