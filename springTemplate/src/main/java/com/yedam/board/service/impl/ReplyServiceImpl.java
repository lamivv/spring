package com.yedam.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yedam.board.mapper.ReplyMapper;
import com.yedam.board.service.Criteria;
import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {
	
	final ReplyMapper mapper;

	@Override
	public int register(ReplyVO vo) {
		
		return mapper.insert(vo);
	}

	@Override
	public ReplyVO get(Long rno) {
		
		return mapper.read(rno);
	}

	@Override
	public int modify(ReplyVO vo) {
		
		return mapper.update(vo);
	}

	@Override
	public int remove(Long rno) {
		
		return mapper.delete(rno);
	}

	@Override
	public List<ReplyVO> getList(Criteria cri, Long bno) {
		
		return mapper.getList(cri, bno);
	}


}
