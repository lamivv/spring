package com.company.exam.service;

import java.util.List;

public interface BookService {
	
	// 등록
	public int insert(BookVO bookVO);
	
	// 등록번호조회
	public int getNo();
	
	// 리스트 조회
	public List<BookVO> list();
	
	// 도서별 대여매출현황
	public List<BookVO> rentList();
	
}
	