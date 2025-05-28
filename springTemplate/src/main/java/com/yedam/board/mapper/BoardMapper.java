package com.yedam.board.mapper;

import java.util.List;

import com.yedam.board.service.BoardVO;
public interface BoardMapper {
	public List<BoardVO> getList();
	
	List<BoardVO> findAll(BoardVO boardVO);

	BoardVO findById(int bno);

	int insert(BoardVO boardVO);

	int update(BoardVO boardVO);

	int delete(int bno);	
}
	