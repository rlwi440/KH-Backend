/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-03-29 11:07:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Arrays;
import java.util.List;
import java.sql.Date;
import member.model.vo.Member;

public final class memberView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


	//메소드 선언문
	public String hobbyChecked(List<String> hobbyList, String hobby){
		return hobbyList != null && hobbyList.contains(hobby) ? 
				"checked" : 
					"";
	}


  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1617007993742L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1616656744264L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Arrays");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("java.sql.Date");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String msg = (String)session.getAttribute("msg");
	if(msg != null) session.removeAttribute("msg");
	
	String loc = (String)request.getAttribute("loc");
	Member loginMember = (Member)session.getAttribute("loginMember");
	
	//사용자 쿠키처리
	String saveId = null;
	Cookie[] cookies = request.getCookies();
	if(cookies != null){
		for(Cookie c : cookies){
			String name = c.getName();
			String value = c.getValue();
			//System.out.println(name + " : " + value);
			if("saveId".equals(name))
				saveId = value;
		}
	}
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Hello MVC</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/css/style.css\" />\r\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/jquery-3.6.0.js\"></script>\r\n");
      out.write("<script>\r\n");
 if(msg != null) { 
      out.write(" \r\n");
      out.write("\talert(\"");
      out.print( msg );
      out.write("\"); \r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
 if(loc != null) { 
      out.write("\r\n");
      out.write("\tlocation.href = \"");
      out.print( loc );
      out.write("\";\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\t/**\r\n");
      out.write("\t* 로그인 폼 유효성 검사 \r\n");
      out.write("\t*/\r\n");
      out.write("\t$(\"#loginFrm\").submit(function(){\r\n");
      out.write("\t\tvar $memberId = $(memberId);\r\n");
      out.write("\t\tvar $password = $(password);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(/^.{4,}$/.test($memberId.val()) == false){\r\n");
      out.write("\t\t\talert(\"유효한 아이디를 입력하세요.\");\r\n");
      out.write("\t\t\t$memberId.select();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(/^.{4,}$/.test($password.val()) == false){\r\n");
      out.write("\t\t\talert(\"유효한 비밀번호를 입력하세요.\");\r\n");
      out.write("\t\t\t$password.select();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<h1>Hello MVC</h1>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"login-container\">\r\n");
      out.write("\t\t\t");
 if(loginMember == null) { 
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 로그인폼 시작 -->\r\n");
      out.write("\t\t\t\t<form id=\"loginFrm\" action=\"");
      out.print( request.getContextPath() );
      out.write("/member/login\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input \r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"text\" name=\"memberId\" id=\"memberId\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"아이디\" tabindex=\"1\" value=\"");
      out.print( saveId != null ? saveId : "" );
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"submit\" value=\"로그인\" tabindex=\"3\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"password\" name=\"password\" id=\"password\" placeholder=\"비밀번호\" tabindex=\"2\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"saveId\" id=\"saveId\" ");
      out.print( saveId != null ? "checked" : "");
      out.write("/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"saveId\">아이디저장</label>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"button\" value=\"회원가입\" onclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/member/memberEnroll';\">\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<!-- 로그인폼 끝-->\r\n");
      out.write("\t\t\t");
 } else { 
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t<table id=\"login\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print( loginMember.getMemberName() );
      out.write("님, 안녕하세요.</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td> \r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"내정보보기\" \r\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/member/memberView';\" />\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"로그아웃\" \r\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"location.href='");
      out.print( request.getContextPath() );
      out.write("/member/logout';\" />\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t");
 } 
      out.write("\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- 메인메뉴 시작 -->\r\n");
      out.write("\t\t\t<nav>\r\n");
      out.write("\t\t\t\t<ul class=\"main-nav\">\r\n");
      out.write("\t\t\t\t\t<li class=\"home\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"notice\"><a href=\"#\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"board\"><a href=\"#\">게시판</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t<!-- 메인메뉴 끝-->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<section id=\"content\">");
      out.write('\r');
      out.write('\n');

	String memberId = loginMember.getMemberId();
	String password = loginMember.getPassword();
	String memberName = loginMember.getMemberName();
	Date birthday = loginMember.getBirthday();
	String email = loginMember.getEmail() != null ? loginMember.getEmail() : "";
	String phone = loginMember.getPhone();
	String address = loginMember.getAddress() != null ? loginMember.getAddress() : "";
	String gender = loginMember.getGender() != null ? loginMember.getGender() : "";
	String hobby = loginMember.getHobby(); // 등산,게임
	
	List<String> hobbyList = null;
	if(hobby != null){
		String[] arr = hobby.split(",");
		hobbyList = Arrays.asList(arr); // String[] -> List<String>
	}



      out.write("\r\n");
      out.write("<section id=enroll-container>\r\n");
      out.write("\t<h2>회원 정보</h2>\r\n");
      out.write("\t<form id=\"memberUpdateFrm\" method=\"post\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>아이디</th>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"memberId\" id=\"memberId_\" value=\"");
      out.print( memberId );
      out.write("\" readonly>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>패스워드</th>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"password\" id=\"password_\" value=\"");
      out.print( password );
      out.write("\" required>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>패스워드확인</th>\r\n");
      out.write("\t\t\t\t<td>\t\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" id=\"password2\" value=\"");
      out.print( password );
      out.write("\" required><br>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr> \r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>이름</th>\r\n");
      out.write("\t\t\t\t<td>\t\r\n");
      out.write("\t\t\t\t<input type=\"text\"  name=\"memberName\" id=\"memberName\" value=\"");
      out.print( memberName );
      out.write("\"  required><br>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>생년월일</th>\r\n");
      out.write("\t\t\t\t<td>\t\r\n");
      out.write("\t\t\t\t<input type=\"date\" name=\"birthday\" id=\"birthday\" value=\"");
      out.print( birthday );
      out.write("\"><br>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr> \r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>이메일</th>\r\n");
      out.write("\t\t\t\t<td>\t\r\n");
      out.write("\t\t\t\t\t<input type=\"email\" placeholder=\"abc@xyz.com\" name=\"email\" id=\"email\" value=\"");
      out.print( email );
      out.write("\"><br>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>휴대폰</th>\r\n");
      out.write("\t\t\t\t<td>\t\r\n");
      out.write("\t\t\t\t\t<input type=\"tel\" placeholder=\"(-없이)01012345678\" name=\"phone\" id=\"phone\" maxlength=\"11\" value=\"");
      out.print( phone );
      out.write("\" required><br>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>주소</th>\r\n");
      out.write("\t\t\t\t<td>\t\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" placeholder=\"\" name=\"address\" id=\"address\" value=\"");
      out.print( address );
      out.write("\"><br>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>성별 </th>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t       \t\t <input type=\"radio\" name=\"gender\" id=\"gender0\" value=\"M\" ");
      out.print( "M".equals(gender) ? "checked" : "" );
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t <label for=\"gender0\">남</label>\r\n");
      out.write("\t\t\t\t\t\t <input type=\"radio\" name=\"gender\" id=\"gender1\" value=\"F\" ");
      out.print( "F".equals(gender) ? "checked" : "" );
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t <label for=\"gender1\">여</label>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>취미 </th>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"hobby\" id=\"hobby0\" value=\"운동\" ");
      out.print( hobbyChecked(hobbyList, "운동") );
      out.write("><label for=\"hobby0\">운동</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"hobby\" id=\"hobby1\" value=\"등산\" ");
      out.print( hobbyChecked(hobbyList, "등산") );
      out.write("><label for=\"hobby1\">등산</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"hobby\" id=\"hobby2\" value=\"독서\" ");
      out.print( hobbyChecked(hobbyList, "독서") );
      out.write("><label for=\"hobby2\">독서</label><br />\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"hobby\" id=\"hobby3\" value=\"게임\" ");
      out.print( hobbyChecked(hobbyList, "게임") );
      out.write("><label for=\"hobby3\">게임</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"hobby\" id=\"hobby4\" value=\"여행\" ");
      out.print( hobbyChecked(hobbyList, "여행") );
      out.write("><label for=\"hobby4\">여행</label><br />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("        <input type=\"button\" onclick=\"updateMember();\" value=\"정보수정\"/>\r\n");
      out.write("        <input type=\"button\" onclick=\"deleteMember();\" value=\"탈퇴\"/>\r\n");
      out.write("\t</form>\r\n");
      out.write("</section>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t\t<p>&lt;Copyright 1998-2021 <strong>KH정보교육원</strong>. All rights reserved.&gt;</p>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
