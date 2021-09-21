package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberviewServlet
 */
@WebServlet("/login/memberView")
public class MemberviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//2. jsp 위임처리
			request.getRequestDispatcher("/WEB-INF/views/login/memberView.jsp")
				   .forward(request, response);
		}

	}
