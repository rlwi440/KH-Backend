package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.*;
import member.model.vo.Member;
import common.onedayecoUtils;
@WebServlet("/member/memberUpdate")

public class MemberUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberService memberService = new MemberService();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	//아이디 
	String memberId=request.getParameter("memberId");
	//비밀번호 
	String memberPw=onedayecoUtils.getSha512(request.getParameter("memberPw"));
	//이름
	String memberName = request.getParameter("memberName");
	//닉네임(변경불가
	String memberNickname= request.getParameter("memberNickname");
	//이메일
	String memberEmail =request.getParameter("memberEmail");
	//전화번호
	String memberPhone =request.getParameter("memberPhone");
	Member member =new Member(memberId,memberPw,memberName,memberNickname,memberEmail,memberPhone,null,null,null);
	System.out.println("하루에코 정보수정:  "+member);
	//3.업무로직
	int result = memberService.updateMember(member);  
	//4. 사용자피드백 및 리다이렉트 처리
	HttpSession session = request.getSession();
	String msg = "";

	if(result > 0){
		msg = "성공적으로 회원정보를 수정했습니다.";
		//세션의 정보도 갱신
		session.setAttribute("loginMember", memberService.selectMemberOne(memberId));
		System.out.println("session.setAttribute@Servlet =" +session);
	}
	else 
		msg = "회원정보수정에 실패했습니다.";	
	
	session.setAttribute("loginMember",member);
	response.sendRedirect(request.getContextPath() + "/login/memberView");
}
}