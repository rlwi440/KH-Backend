 <%--page는 지시어 directive    --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import=" java.util.*,java.io.*"%>
    <%
    	//jsp 스크립팅 요소 : scriptlet
    	int sum=0;
    	for(int i=1; i<=10; i++)
    		sum +=i;
		Date today =new Date();
    	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP-basic</title>
<script>
window.onload = function(){
	var sum = 0;
	for(var i = 1; i <= 10; i++)
		sum += i;
	document.querySelector("#sum").innerText = sum;
	let now=new Date().getTime();
	document.querySelector("#now").innerText = now;
	
};
</script>
</head>
<body>
<h1>Basic</h1>
<%-- hsp주석은 변환이 안된다. --%>
<!-- html 주석 은 client까지 전달된다 -->
<p> server-side: java로 계산된결과 :<%= sum %></p> <%-- jsp 스크립팅요소 : 출력식 --%>
<p>server-side: java로 계산된결과 :<% out.print(sum);%></p>
<p>client: JS 로계산된결과 : <span id="sum"> </span></p>
<hr />
<p> server-side : 현재시간:<%=today %><%=today.getTime() %> </p>
<p>server: JS 로 현재시간 : <span id="now"> </span></p>
</body>
</html>