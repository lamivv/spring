package com.company.exam.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.exam.service.BookService;
import com.company.exam.service.BookVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/book/*")
public class BookController {
	
	private final BookService bookService;
	
	@GetMapping("/")
	public String home() {
		return "book/home";
	}

	// 등록페이지로 이동
	@GetMapping("/register")
	public void register(Model model) {
		model.addAttribute("bookNo", bookService.getNo());
	}
	
	//등록 처리하고 목록으로 이동 
	@PostMapping("/register")
	public String register(BookVO vo, RedirectAttributes rttr) {
		bookService.insert(vo);
		//rttr.addFlashAttribute("result", vo.getBook_name());
		return "redirect:list";
	}

	//목록페이지 이동
	@GetMapping("/list")
	public void list(Model model) {

		model.addAttribute("list", bookService.list());
	}
	
	// 렌트 목록페이지 이동
	@GetMapping("/rent")
	public void rentList(Model model) {

		model.addAttribute("list", bookService.rentList());
	}

//	// 상세보기 페이지로 이동(단건조회)
//	@GetMapping("get")
//	public String get(@RequestParam("bno") int bno, Model model) {
//		model.addAttribute("board", boardService.findById(bno));
//		return "board/get";
//	}
//
//	// 수정페이지로 이동
//	@GetMapping("modify")
//	public String modify(@RequestParam("bno") int bno, Model model) {
//		model.addAttribute("board", boardService.findById(bno));
//		return "board/modify";
//	}
//
//	// 수정처리
//	@PostMapping("modify")
//	public String modify(BoardVO board, RedirectAttributes rttr) {
//		boardService.update(board);
//		rttr.addAttribute("bno", board.getBno());
//		// return "redirect:get?bno=" + board.getBno() ;
//		return "redirect:get";
//	}
//
//	// 삭제처리
//	@PostMapping("remove")
//	public String remove(@RequestParam("bno") int bno) {
//		boardService.delete(bno);
//		return "redirect:list"; // 상대경로
//	}
}
