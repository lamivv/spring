package com.yedam.app.sample;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Component
public class Restaurant {
	private final Chef chef;
}
