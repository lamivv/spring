package com.yedam.board.mapper;

import java.util.List;

import com.yedam.board.service.BoardVO;
import com.yedam.board.service.Criteria;
public interface BoardMapper {
	
	public List<BoardVO> getList(Criteria cri);

	public Long getTotal(Criteria cri);
	
	public List<BoardVO> findAll(BoardVO boardVO);

	public BoardVO findById(int bno);

	public int insert(BoardVO boardVO);

	public int update(BoardVO boardVO);

	public int delete(int bno);	
	
}
	