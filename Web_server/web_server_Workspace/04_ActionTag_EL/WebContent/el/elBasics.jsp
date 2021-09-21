<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String life = "life is very short!";
	String movie ="노인을 위한  나라는 없다";
	pageContext.setAttribute("life", life);
	pageContext.setAttribute("movie",movie);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>El Basics</title>
</head>
<body>
	<h1>El Basics</h1>
	<%--scope 생략시, pageScope - requestScope- sessionScope -applicationScope --%>
	<p>${life}</p>
	<p>${coffee}</p>
	<p>${serverTime}</p>
	<p>${honngd}</p>
	<p>${honngd.id}</p>
	<%--
	<p>${honngd.nickname}</p>
	javax.el.PropertyNotFoundException: Property [nickname] not found on type [com.kh.person.model.vo.Person]
	 --%>
	<p>${honngd.name}</p>
	<p>${honngd.gender}</p>
	<p>${honngd.age}</p>
	<p>${honngd.married}</p>
	<p>${sbook}</p>
	<p>${movie}</p>
	<%--이름이같은경우 명시해줘야 한다. --%>
	<p>${applicationScope.movie}</p>
	<%--
	EL은 NullPointerException 을 유발하지않는다.
	null인 경우에는 "출력" 
	--%>
	<p>[${cow.run}]</p>
	
	<h2>list</h2>
	<p>${list}</p>
	<p>${list[0]}</p>
	<p>${list[1]}</p>
	<p>${list[2]}</p>
	<p>[${list[3]}]</p>
	
	<h2>map</h2>
	<p>${map}</p>
	<p>${map.language}</p>
	<p>[${map.Dr.zang}]</p>
	<p>${map['Dr.zang'].name}</p>
	<%--자바스크립트 객체 방식  --%>
	<p>${map['Dr.zang'] ["name"]}</p>
	<h1>Param</h1>
	<p>${param.pname}</p>
	<p>${param.pcount}</p>
	<p>${paramValues.option[0]}</p>
	<p>${paramValues.option[1]}</p>
	
	<h1>cookie</h1>
	<p>${cookie.JSESSIONID}</p>
	<p>${cookie.JSESSIONID.value}</p>
	
	<h1>header</h1>
	<p>${header.Accept}</p>
	<p>${header['user-agent']}</p>
	<p>${header['sec-ch-ua']}</p>
	<p>${header['Host']}</p>
	<p>${header['Referer']}</p>	
	<h1>pageContext</h1>
	<!--
		getPage() 
		getRequest()
		getMethod() :GET|POST
			getContextPath() :/action
		getSession()
		getServletContext()
		getErrorDate()
		 -->
	 <p>${pageContext.request.method}</p>
	 <p>${pageContext.request.contextPath}</p>
</body>
</html>