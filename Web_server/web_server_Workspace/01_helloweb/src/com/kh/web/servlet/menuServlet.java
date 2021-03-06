package com.kh.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class menuServlet extends HttpServlet{

	public menuServlet() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		//0. encoding 선언
		request.setCharacterEncoding("utf-8");
		//1. 사용자 입력값 처리 
		String mainmenu=request.getParameter("main_menu");
		String sidemenu=request.getParameter("side_menu");
		String drinkmenu=request.getParameter("drink_menu");
		 //출력식으로 확인 
		System.out.println("main_menu" +mainmenu);
		System.out.println("side_menu" +sidemenu);
		System.out.println("drink_menu" +drinkmenu);
		//2. 업무로직 
		int sum =0;
		switch (mainmenu) {
		case  "한우버거":
			sum += 5000;
			break;
		case  "밥버거":
			sum += 4500;
			break;

		case  "치즈버거":
			sum += 4000;
			break;
		}

			switch (sidemenu) {
			case  "감자튀김":
				sum += 1500;
				break;
			case  "어니언링":
				sum += 1700;
				break;
			}
				
				switch (drinkmenu) {
				case  "콜라":
					sum += 1000;
					break;
				case  "사이다":
					sum += 1000;
					break;
				case  "커피":
					sum += 1500;
					break;

				case  "밀크쉐이크":
					sum += 2500;
					break;
		}
		//jsp에 새로 생성된 data를 전달하기 위해 request에 속성으로 저장한다.
			request.setAttribute("sum",sum);
			//3. html작성을 jsp에 위임.
			RequestDispatcher reqDispatcher
		      = request.getRequestDispatcher("/menu/menuEnd.jsp");
		      reqDispatcher.forward(request, response);
		
	}
}

