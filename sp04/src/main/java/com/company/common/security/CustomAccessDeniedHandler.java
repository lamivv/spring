package com.company.common.security;

import java.io.IOException;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("deniedHandler")
public class CustomAccessDeniedHandler implements AccessDeniedHandler{

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		
		// 에러 처리
		System.out.println("403 에러 처리");
		// 뷰페이지로 이동
		// response.sendRedirect("/sp04/accessError");
		String contextPath = request.getContextPath();
		response.sendRedirect(contextPath + "/accessError");
	}

}
