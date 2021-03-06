<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/header.jsp" %>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/Ranking.css" />
<script src="<%=request.getContextPath()%>/js/jquery-3.6.0.js"></script>
	
<div class="wrapper_1">
	<div class="wrapper_2">
		<div class="ranker">
		<div id="trophy">
			<img src="image/랭킹/trophy.png"/>
		</div>
			<p id="intro_ranker">랭커 3위를 소개합니다</p>
			<div class="ranker_container second">
				<p class="rank">2nd</p>
				<img src="image/랭킹/prize2.png" alt="" />
				<p class="ranker_id">kimhaejun</p>
			</div>
			<div class="ranker_container first">
				<p class="rank">1st</p>
				<img src="image/랭킹/prize1.png" alt="" />
				<p class="ranker_id">kimhaejun</p>
			</div>
			<div class="ranker_container third">
				<p class="rank">3rd</p>
				<img src="image/랭킹/prize3.png" alt="" />
				<p class="ranker_id">kimhaejun</p>
			</div>
		</div>
	</div>
	<div class="wrapper_2">
		<div class="type" id="personal_wrapper">개인랭킹</div>
		<div class="rr">
		<div class="column c1_1">랭킹</div>
		<div class="column c1_2">아이디</div>
		<div class="column c1_3">이번달 포인트</div>
		<div class="column c1_4">총 포인트</div>
		</div>
		<div class="rr r1">
			<div class="row rn_1">1</div>
			<div class="row rn_2">honggd</div>
			<div class="row rn_3">150</div>
			<div class="row rn_4">150</div>
		</div>
		<div class="rr r2">
			<div class="row rn_1">2</div>
			<div class="row rn_2">honggd</div>
			<div class="row rn_3">150</div>
			<div class="row rn_4">150</div>
		</div>
		<div class="rr r3">
			<div class="row rn_1">3</div>
			<div class="row rn_2">honggd</div>
			<div class="row rn_3">150</div>
			<div class="row rn_4">150</div>
		</div>
		<div class="rr r3">
			<div class="row rn_1">4</div>
			<div class="row rn_2">honggd</div>
			<div class="row rn_3">150</div>
			<div class="row rn_4">150</div>
		</div>
		<div class="rr r3">
			<div class="row rn_1">5</div>
			<div class="row rn_2">honggd</div>
			<div class="row rn_3">150</div>
			<div class="row rn_4">150</div>
		</div>
		<div class="rr my">
			<div class="row rn_1">8</div>
			<div class="row rn_2">kimhaejun</div>
			<div class="row rn_3">130</div>
			<div class="row rn_4">130</div>
		</div>
	</div>
	<div class="type2">
		<div class="type2-1" onclick="teamRanking()">팀별랭킹</div>
	<div class="type2-1" onclick="teamMemberRanking()">팀원별랭킹</div>	
	</div>
</div>
</body>
<footer>
</footer>
</html>
<script>
function teamRanking() {
	location.href="<%=request.getContextPath() %>/ranking/TeamRanking";
}
function teamMemberRanking(){
	location.href="<%=request.getContextPath() %>/ranking/TeamMemberRanking";	
}
</script>