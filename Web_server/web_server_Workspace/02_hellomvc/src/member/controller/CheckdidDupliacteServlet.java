package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class CheckdidDupliacteServlet
 */
@WebServlet("/member/checkIdDuplicate")
public class CheckdidDupliacteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.사용자 입력값 처리
		String memberId= request.getParameter("memberId");
		System.out.println("memberId@servlet = " +memberId) ;
		
		//2.업무로직:해당 id를 db에서 조회
		Member member = new MemberService().selectOne(memberId);
		//유효한 
		boolean available = member == null ;
		request.setAttribute("available", available);
		
		//3.응답처리:사용가능여부를 jsp에서 html로 작성
		RequestDispatcher reqDispatcher =
				//경로지정
				request.getRequestDispatcher("/WEB-INF/views/member/checkIdDuplicate.jsp");
		reqDispatcher.forward(request, response);
	}
}
