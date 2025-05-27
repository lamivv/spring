package com.yedam.web;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.web.mapper.EmpMapper;
import com.yedam.web.model.Employees;
import com.yedam.web.model.SearchVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/datasource-context.xml",
					   "classpath:/spring/mybatis-context.xml"})
public class EmpMapperTest {
	@Autowired EmpMapper empMapper;
	
	@Test
	public void findEmployeeDepartment() {
		List<Employees> list = empMapper.findEmployeeDepartment();
		//log.info(list.toString());
		list.forEach(emp -> log.info(emp.getFirstName() + ":" + emp.getDepartment().getDepartmentName()));
	}
	
	//@Test
	public void 전체조회() {
		SearchVO searchVO = new SearchVO();
		searchVO.setDepartmentId("30");
		searchVO.setSalary("2600");
		//searchVO.setIds(Arrays.asList(100,101,102));
		
		empMapper.findAll(searchVO).forEach(emp->System.out.println( emp.getEmployeeId() + ":" + emp.getDepartmentId() ));
	}
	
	//@Test
	public void findeAlltoMap() {
		empMapper.findAlltoMap().forEach(emp-> System.out.println( emp.get("first_name") ));
	}
	
	//@Test
	public void getCount() {
		int result = empMapper.getCount();
		System.out.println(result);
	}
	
	//@Test
	public void getCount2() {
		empMapper.getCount2().forEach(count-> System.out.println( count ));
	}
	
	//@Test
	public void getCount3() {
		empMapper.getCount3().forEach(emp-> System.out.println(emp.getDepartmentId()+':'+ emp.getCnt()));
	}
	
//	@Test
//	public void insert() {
//		Employees employee = new Employees();
//		employee.setEmployeeId("300");
//		employee.setLastName("김");
//		employee.setEmail("a@a.a");
//		employee.setHireDate("2020/01/01");
//		employee.setJobId("IT_PROG");
//		
//		int result = empMapper.insert(employee);
//		System.out.println(result);
//	}
	
	// 롬복 기능 활용한 insert
	// Employees.java에서 @Builder @NoArgsConstructor	@AllArgsConstructor 추가후 사용
	//@Test
	public void insert() {
		Employees employee = Employees.builder()
				.employeeId("301")
				.lastName("박")
				.email("c@c.c")
				.jobId("IT_PROG")
				.hireDate("2020/01/01")
				.build();
		
		int result = empMapper.insert(employee);
		System.out.println(result);
	}
	
	//@Test
	public void update() {
		Employees employee = new Employees();
		employee.setEmployeeId("300");
		employee.setFirstName("길동");
		
		int result = empMapper.updateFirstName(employee);
		System.out.println(result);
	}
	
	//@Test
	public void delete() {
		int result = empMapper.delete(300);
		System.out.println(result);
	}
}
