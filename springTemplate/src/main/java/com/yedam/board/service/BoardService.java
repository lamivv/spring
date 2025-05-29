package com.yedam.board.service;

import java.util.List;

public interface BoardService {
	public List<BoardVO> getList(Criteria cri);
	
	public Long getTotal(Criteria cri);

	public List<BoardVO> findAll(BoardVO boardVO);

	public BoardVO findById(int bno);

	public int insert(BoardVO boardVO);

	public int update(BoardVO boardVO);

	public int delete(int bno);	
		
}
	