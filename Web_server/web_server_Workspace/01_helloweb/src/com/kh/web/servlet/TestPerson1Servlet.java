package com.kh.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet
 * webservice를 위한 java class
 * HttpServlet을 상속
 * SerVlet 생명주기 
 * -was 구동내내 딱 하나만의 객체만 만들어져서 처리된다. (singletone방식)  
 * 1.SerVlet 객체생성(기본생성자 호출) -최초 Client 호출시 1회 
 * 2.init 메소드 호출  -최초 Client 호출시 1회 
 * 3.HttpServlet의 service메소드 호출  -Client 매요청마다
 * 4.전통방식에  따라 doGet| doPost 호출 -Client 매요청마다 
 * 5.destory 호출 ( tomcat종료시  객체반환.) -마지막 1회
 *
 *
 *멱등 
 * -서비스 전후로  DB 의 상태가 바뀌지 않는경우 
 * -select ->GET
 * - insert update delete -> POST 
 * login  id/password url 노출을막기위->POST 
 */

public class TestPerson1Servlet extends HttpServlet {

	/**
	 * 기본생성자
	 */
	public TestPerson1Servlet() {
		super();
		System.out.println("기본생성자 TestPerson1Servlet() 호출!");
	}
	
	@Override
	public void init(ServletConfig config) {
		System.out.println("init(ServletConfig) 호출!");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() 호출!");
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException {
		//매 요청시 사용되는 servlet객체는 동일하다.
		System.out.println(this.hashCode());
		
		//1. 사용자입력값 가져오기
		String name = request.getParameter("name");
		String color = request.getParameter("color");
		String animal = request.getParameter("animal");
		String[] foodArr = request.getParameterValues("food");
		
		System.out.println("name = " + name);
		System.out.println("color = " + color);
		System.out.println("animal = " + animal);
		System.out.println("foodArr = " + Arrays.toString(foodArr));
		
		//2. 응답메세지 작성 : html
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<title>개취 검사 결과</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h1>개인 취향 검사 결과 POST</h1>");
				out.println("<p>" + name + "님의 개인취향 검사 결과는 </p>");
				out.println("<p>" + color + "색을 좋아합니다. </p>");
				out.println("<p>좋아하는 동물은 " + animal + "입니다.</p>");
				out.println("<p>좋아하는 음식은 " + Arrays.toString(foodArr)+ "입니다. </p>");
				out.println("</body>");
				out.println("</html>");
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws IOException,ServletException{
					//post는  인코딩을 설정 해줘야한다.
					//0.인코딩선언
					//http mesage body부분 인코딩이 유효하도록 한다.
					request.setCharacterEncoding("utf-8");
					//1. 사용자입력값 가져오기
					String name = request.getParameter("name");
					String color = request.getParameter("color");
					String animal = request.getParameter("animal");
					String[] foodArr = request.getParameterValues("food");
					
					System.out.println("name = " + name);
					System.out.println("color = " + color);
					System.out.println("animal = " + animal);
					System.out.println("foodArr = " + Arrays.toString(foodArr));
					
				//2. 응답메세지 작성 : html
						response.setContentType("text/html; charset=utf-8");
						PrintWriter out = response.getWriter();
						out.println("<!DOCTYPE html>");
						out.println("<html>");
						out.println("<head>");
						out.println("<title>개취 검사 결과</title>");
						out.println("</head>");
						out.println("<body>");
						out.println("<h1>개인 취향 검사 결과 POST</h1>");
						out.println("<p>" + name + "님의 개인취향 검사 결과는 </p>");
						out.println("<p>" + color + "색을 좋아합니다. </p>");
						out.println("<p>좋아하는 동물은 " + animal + "입니다.</p>");
						out.println("<p>좋아하는 음식은 " + Arrays.toString(foodArr)+ "입니다. </p>");
						out.println("</body>");
						out.println("</html>");
				
		}
	}
	
	



