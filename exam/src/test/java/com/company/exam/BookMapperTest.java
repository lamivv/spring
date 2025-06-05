package com.company.exam;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.company.exam.mapper.BookMapper;
import com.company.exam.service.BookVO;

import lombok.Setter;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class BookMapperTest {

	@Setter(onMethod_ = @Autowired)
	private BookMapper bookMapper;

	@Test
	public void insert() {
		BookVO vo = new BookVO();

		vo.setBook_name("테스트메퍼");
		vo.setBook_coverimg("111");
		vo.setBook_date(new Date());
		vo.setBook_price(500);
		vo.setBook_publisher("테스트출판사");
		vo.setBook_info("테스트정보 책정보");

		System.out.println(bookMapper.insert(vo));
	}

	// @Test
	public void getNo() {
		System.out.println(bookMapper.getNo());
	}

	//@Test
	public void list() {
		System.out.println(bookMapper.list());
	}
	
	//@Test
	public void rentList() {
		System.out.println(bookMapper.rentList());
	}
}
