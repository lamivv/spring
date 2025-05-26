package com.yedam.web.mapper;

import java.util.List;

import com.yedam.web.model.BoardVO;

public interface BoardMapper {
	List<BoardVO> findAll(BoardVO boardVO);

	List<BoardVO> findById(int bno);

	int insert(BoardVO boardVO);

	int update(BoardVO boardVO);

	int delete(int bno);
}
