package com.company.exam.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.exam.mapper.BookMapper;
import com.company.exam.service.BookService;
import com.company.exam.service.BookVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
	
	final BookMapper bookMapper;
	
	@Override
	public int insert(BookVO bookVO) {
		return bookMapper.insert(bookVO);
	}

	@Override
	public int getNo() {
		return bookMapper.getNo();
	}

	@Override
	public List<BookVO> list() {
		return bookMapper.list();
	}

	@Override
	public List<BookVO> rentList() {
		return bookMapper.rentList();
	}
	
	
//	@Override
//	public List<BoardVO> getList(Criteria cri) {
//		return boardMapper.getList(cri);
//	}
//
//	@Override
//	public List<BoardVO> findAll(BoardVO boardVO) {
//		return null;
//	}
//
//	@Override
//	public BoardVO findById(int bno) {
//		BoardVO result = boardMapper.findById(bno);
//		return result;
//	}
//
//
//	@Override
//	public int update(BoardVO boardVO) {
//		return boardMapper.update(boardVO);
//	}
//
//	@Override
//	public int delete(int bno) {
//		return boardMapper.delete(bno);
//	}
//
//	@Override
//	public Long getTotal(Criteria cri) {
//		return boardMapper.getTotal(cri);
//	}


}
