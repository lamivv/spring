package com.scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("board")
public class BoardController {
	@Autowired
	BoardService service;
	
	public void insert () {
		service.insert();
	}
}
