package com.kh.ajax.text;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Servlet implementation class AjaxTextServlet
 */
@WebServlet("/text")
public class AjaxTextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.사용자입력값 처리 
		String name =request.getParameter("name");
		System.out.println("name@Servlet"+name);
		//2.업무로직
		//3.응답처리:출력 스트림을 이용해서 응답메세지 직접작성
		//Ajax는 내부적으로 통신이  활동한다.
		response.setContentType("text/plain; charset=utf-8") ;
		PrintWriter out =response.getWriter();
		out.println("안녕");
		out.println("12345");
		out.println("<h1>Ajax</h1>");
		out.println("<h1>"+name+"</h1>");
		out.println("안녕");
		out.println("하십니까");
		out.println(new Date());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.사용자입력값 처리 
		String name =request.getParameter("name");
		System.out.println("name@Servlet"+name);
		//2.업무로직
		//3.응답처리:출력 스트림을 이용해서 응답메세지 직접작성
		//Ajax는 내부적으로 통신이  활동한다.
		response.setContentType("text/plain; charset=utf-8") ;
		PrintWriter out =response.getWriter();
		out.println("POST 로 요청하셨습니다");
		out.println("이름["+name+"]입니다.");
		out.println("요청시각은"+new Date()+"입니다.");
	}

}
