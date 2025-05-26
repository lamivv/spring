package com.yedam.web.mapper;

import org.apache.ibatis.annotations.Select;

// xml 없이 인터페이스에 바로 사용
public interface TimeMapper {
	
	@Select("select sysdate from dual")
	public String getTime();
	
	public String getTime2();
}
