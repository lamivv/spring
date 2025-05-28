package com.yedam.board;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.service.BoardVO;

import lombok.extern.log4j.Log4j2;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({ "classpath:/spring/datasource-context.xml", "classpath:/spring/mybatis-context.xml" })
@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class BoardMapperTest {
	
	@Autowired
	BoardMapper boardMapper;
	
	@Test
	public void getList() {
		boardMapper.getList().forEach(board -> System.out.println(board));
	}

	//@Test
	public void findAll() {
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle(null);
		boardVO.setWriter(null);
		boardVO.setContent(null);

		boardMapper.findAll(boardVO).forEach(board -> System.out.println(board));
	}

	// @Test
	public void findById() {
		System.out.println(boardMapper.findById(2));
	}

	// @Test
	public void insert() {
		BoardVO boardVO = BoardVO.builder().bno((long) 6).title("test").content("내용 test").writer("김땅콩").build();

		int result = boardMapper.insert(boardVO);
		System.out.println(result);
	}

	// @Test
	public void update() {
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("제목변경테스트");
		boardVO.setBno((long) 6);

		int result = boardMapper.update(boardVO);
		System.out.println(result);
	}

	// @Test
	public void delete() {
		int result = boardMapper.delete((int) 6);
		System.out.println(result);
	}
}
