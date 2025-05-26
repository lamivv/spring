package com.yedam.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class MapTest {

	@Test
	public void test1() {
		Map map = new HashMap();
		map.put("first_name", "scott");
		map.put("last_name", "king");
		
		String name = (String)map.get("first_name");

		
		List<Map<String, String>> list = new ArrayList<>();
		// 제네릭타입 표현 ( 처음부터 어떤 타입을 담을지 정의 ) 
		// 캐스팅 필요없음
		Map<String, String> map2 = new HashMap();
		map2.put("first_name", "scott");
		map2.put("last_name", "king");
		
		list.add(map2);
		
		map2 = new HashMap<>();
		map2.put("first_name", "길동");
		map2.put("last_name", "홍");
		
		list.add(map2);
		
		// forEach문 사용 -> first_name만 출력
		list.forEach(emp -> System.out.println( emp.get("first_name")));
		
		list.forEach(System.out::println);
		// 아래와 동일한 코드임
		// list.forEach(emp -> System.out.println( emp ));
	}
}
