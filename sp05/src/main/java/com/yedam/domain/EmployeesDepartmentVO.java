package com.yedam.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class EmployeesDepartmentVO {
	private String employeeId;
	private String firstName;
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm")
	private Date hireDate;
	private Department department;
}
