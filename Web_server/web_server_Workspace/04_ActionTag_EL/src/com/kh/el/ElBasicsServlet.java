package com.kh.el;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.person.model.vo.Person;

/**
 * Servlet implementation class ElBasicsServlet
 */
@WebServlet("/el/elBasics.do")
public class ElBasicsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("coffe", "안티구아");
		request.setAttribute("serverTime", System.currentTimeMillis());
		request.setAttribute("honngd", new Person("honngd", "혼길동",'남', 35,true));
		List<Object> list =Arrays.asList("abc",1234, new Date());
		request.setAttribute("list", list);
		Map<String, Object> map =new HashMap<>();
		map.put("language","java");
		map.put("Dr.zang", new Person("zangys", "장영실", '남', 45, false));
		request.setAttribute("map", map);
		
		HttpSession session = request.getSession();
		session.setAttribute("book", "디지털 미니멀리즘");
		
		ServletContext application = request.getServletContext();
		application.setAttribute("movie","귀멸의 칼날");
		
		request.getRequestDispatcher("/el/elBasics.jsp")
		   .forward(request, response);
	}

}
