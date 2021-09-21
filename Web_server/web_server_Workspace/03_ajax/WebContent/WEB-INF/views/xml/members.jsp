<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/xml; charset=UTF-8" 
	pageEncoding="utf-8" %>
	<%@page import="com.kh.member.model.vo.Member"%>
<%@page import="java.util.List"%>
<% List<Member> list =(List<Member>) request.getAttribute("list");%>
<%for(Member member : list){%>
<members>
	<member>
		<id><%=member.getId() %></id>
		<name><%=member.getName() %></name>
		<profile><%=member.getProfile() %></profile>
	</member>	
	<%} %>
</members>
