package com.yedam.ex03;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Component
@Data
@AllArgsConstructor
public class Restaurant {
	
	private Chef chef;

}
