package com.yedam;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class EmpListServ
 */
//@WebServlet("/emp")
public class EmpListServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpListServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html; charset=UTF-8");
		String name = "김땅콩";
		String dept = "20";
		// 서비스 호출 DB 처리
		request.setAttribute("name", name);
		request.setAttribute("dept", dept);
		request.getRequestDispatcher("emp.jsp").forward(request, response);
//		PrintWriter out = response.getWriter();
//		out.print("<table border='1'>");
//		out.print("<tr>");
//		out.print("<td>"+ dept +"</td>");
//		out.print("<td>"+ name +"</td>");
//		out.print("</tr>");
//		out.print("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
