package com.yedam.app.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yedam.app.mapper.TimeMapper;
import com.yedam.app.service.TimeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TimeServiceImpl implements TimeService {

	private final TimeMapper timeMapper;
	@Override
	public String getTime() {
		return timeMapper.getTime();
	}
	
	@Transactional
	@Override
	public String getTime2() {
		return timeMapper.getTime2();
	}

}
