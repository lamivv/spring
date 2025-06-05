package com.yedam.app.service;

import org.apache.ibatis.annotations.Select;

public interface TimeService {

	@Select("SELECT sysdate FROM dual")
	public String getTime();

	public String getTime2();

}
