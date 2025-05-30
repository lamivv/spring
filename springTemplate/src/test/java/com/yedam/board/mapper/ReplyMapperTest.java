package com.yedam.board.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.yedam.board.service.ReplyVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class ReplyMapperTest {
	
	@Autowired
	ReplyMapper ReplyMapper;
	
	//@Test
	public void testCreate2() {
		ReplyVO vo = new ReplyVO();
		
		// 게시물의 번호
		vo.setBno(20L);
		vo.setReply("댓글 테스트");
		vo.setReplyer("replyer");
		
		ReplyMapper.insert(vo);
	}
	
	//@Test
	public void read() {
		Long targetRno = 1L;
		ReplyVO vo = ReplyMapper.read(targetRno);
		log.info(vo);
	}
	
	@Test
	public void getList() {
		List<ReplyVO> replies = ReplyMapper.getList(null, 20L);
		replies.forEach(re -> log.info(re));
	}
}
