package com.yedam.board.service;

import java.util.List;

public interface BoardService {
	public List<BoardVO> getList();
	
	List<BoardVO> findAll(BoardVO boardVO);

	BoardVO findById(int bno);

	int insert(BoardVO boardVO);

	int update(BoardVO boardVO);

	int delete(int bno);	
}
	