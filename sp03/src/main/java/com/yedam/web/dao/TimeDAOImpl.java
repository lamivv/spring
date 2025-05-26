package com.yedam.web.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository // 스프링 컨테이너에 빈등록해줌 = @Component
public class TimeDAOImpl implements TimeDAO{

	@Autowired SqlSessionFactory sqlSessionFactory;
	@Override
	public String getTime() {
		return sqlSessionFactory.openSession().selectOne("com.yedam.web.mapper.TimeMapper.getTime2");
	}

}
