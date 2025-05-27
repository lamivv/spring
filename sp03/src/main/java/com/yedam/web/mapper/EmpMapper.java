package com.yedam.web.mapper;

import java.util.List;
import java.util.Map;

import com.yedam.web.model.Employees;
import com.yedam.web.model.SearchVO;

public interface EmpMapper {
	List<Employees> findEmployeeDepartment();
	
	List<Employees> findAll(SearchVO search);
	
	List<Map<String, Object>> findAlltoMap(); 
	
	int getCount();
	
	// List안에는 클래스타입인 Integer로 들어감
	List<Integer> getCount2();
	
	List<Employees> getCount3();
	
	int insert(Employees employee);
	
	int updateFirstName(Employees employee);
	
	int delete(int employeeId);
}
