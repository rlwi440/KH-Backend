<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Arrays"%>
<%--JSP주석연습 
    	jsp:jav+html
    	jsp의 모든 자바코드 <%..%>는 모두 서버단에서 처리되고, 그 결과만 html에 반영된다
    	--%>
<%
	// jsp scriptlet 자바공간
System.out.println(123);
//사용자입력값, 가져오기
//request, response에 선언없이 접근가능
String name = request.getParameter("name");
String color = request.getParameter("color");
String animal = request.getParameter("animal");
String[] foodArr = request.getParameterValues("food");
//console.log 
System.out.println("name@jsp = " + name);
System.out.println("color@jsp = " + color);
System.out.println("animal@jsp = " + animal);
System.out.println("foodArr@jsp = " + Arrays.toString(foodArr));
//저장된  속성 가져오기
//다운캐스팅,업캐스팅 공부
String recommendation = (String) request.getAttribute("recommendation");
String colorName = (String) request.getAttribute("colorName");
System.out.println("recommendation@jsp = " + recommendation);
System.out.println("colorName@jsp = " + colorName);
%>
<!DOCTYPE html>
<html>
<head>
<title>개취 검사 결과</title>
<style>
.recommendation {
	font-size: 2em;
	text-decoration: underline;
	color:<%=colorName%>;
}
.color{
	color:deeppink;
		}

</style>
</head>
<body>
	<h1 class ="color">개인 취향 검사 결과 jsp</h1>
	<p>
		<%=name%>짱짱맨님의 개인취향 검사 결과는
	</p>
	<p><%=color%>색을 좋아합니다.
	</p>
	<p>
		좋아하는 동물은
		<%=color%>입니다.
	</p>
	<p>
		좋아하는 음식은
		<%=Arrays.toString(foodArr)%>입니다.
	</p>
	<hr>
	<p class='recommendation'>
		오늘은
		<%=recommendation%>
		어떠세요?
	</p>
</body>
</html>
