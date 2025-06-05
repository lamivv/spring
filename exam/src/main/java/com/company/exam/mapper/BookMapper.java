package com.company.exam.mapper;

import java.util.List;

import com.company.exam.service.BookVO;
public interface BookMapper {
	
	// 등록
	public int insert(BookVO bookVO);
	
	// 등록번호조회
	public int getNo();
	
	// 리스트 조회
	public List<BookVO> list();
	
	// 도서별 대여매출현황
	public List<BookVO> rentList();

}
	