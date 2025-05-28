package com.yedam.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.service.BoardService;
import com.yedam.board.service.BoardVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	final BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getList() {
		return boardMapper.getList();
	}

	@Override
	public List<BoardVO> findAll(BoardVO boardVO) {
		return null;
	}

	@Override
	public BoardVO findById(int bno) {
		BoardVO result = boardMapper.findById(bno);
		return result;
	}

	@Override
	public int insert(BoardVO boardVO) {
		int result = boardMapper.insert(boardVO);
		return result;
	}

	@Override
	public int update(BoardVO boardVO) {
		return boardMapper.update(boardVO);
	}

	@Override
	public int delete(int bno) {
		return boardMapper.delete(bno);
	}

}
