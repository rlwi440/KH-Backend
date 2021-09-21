<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- CSS체크  -->
    <link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/Member_View.css">
<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<link
	href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap"
	rel="stylesheet">
<!--Alert 문구 디자인 추가 -->
<script src="//cdn.jsdelivr.net/npm/sweetalert2@10"></script>
</head>
<%@ include file="/WEB-INF/views/common/header.jsp"%>
<%
	String memberId = loginMember.getMemberId();
	String memberPw=loginMember.getMemberPw();
	String memberName= loginMember.getMemberName();
	String memberNickname= loginMember.getMemberNickname();
	String memberEmail=loginMember.getMemberEmail();
	String memberPhone =loginMember.getMemberPhone();
	String memberTeam=loginMember.getMemberTeam();
	String memberPicture=loginMember.getMemberPicture();
	String memberRole=loginMember.getMemberRole();
%>
        <div class="Container-bar">
            <ul>
                <li class="Container-bar-li-left" style="font-size: 30px;"><a href="#"><span
                            class="title">로그인</span></a>
                </li>
            </ul>
        </div>
        <div class="enroll-container-div">
        </div>
        <section id=enroll-container>
	<h2>회원 정보</h2>
	<form id="memberUpdateFrm" method="post"><table class= "memberUpdateFrm-table"><tr><th>아이디</th><td><input class="td" type="text" name="memberId" id="memberId_" value="<%= memberId %>" readonly></td></tr><tr><th>패스워드</th><td><input class="td" type="password" name="memberPw" id="memberPw" value="<%= memberPw %>"></td></tr><tr><th>이름</th><td>	<input class="td" type="text"  name="memberName" id="memberName" value="<%= memberName %>"><br></td></tr><tr><th>닉네임</th><td>	<input  class="td" type="text"  name="memberNickname" id="memberNickname" value="<%= memberNickname %>"  required><br></td></tr><tr><th>이메일</th><td>	<input  class="td" type="text"  name="memberEmail" id="memberEmail" value="<%= memberEmail %>" ><br></td></tr><tr><th>휴대폰</th><td>	<input class="td" type="tel" placeholder="(-없이)01012345678" name="memberPhone" id="memberPhone" maxlength="11" value="<%= memberPhone%>" required><br></td></tr></table><input  class="btn"type="button" onclick="updateMember();" value="정보수정"/>
	</form>
	<script>
	function updateMember(){8
		$("#memberUpdateFrm")
			.attr("action","<%=request.getContextPath() %>/member/memberUpdate")
			.submit();
	}
	 /**
     * 유효성 검사
     */
     $("#memberUpdateFrm").submit(function(){
    	 //이름
    	 var $memberName = $("#memberName");
    		if(/^[가-힣]{2,}$/.test($memberName.val()) == false){
    			alert("이름은 한글 2글자 이상이어야 합니다.");
    			$memberName.select();
    			return false;
    		}  	 
    	 //아이디 
    	var $memberId =$("#memberId");
    	//아이디는 영문자/숫자  4글자이상만 허용 
    	if(/^[a-zA-Z0-9]{4,}$/.test($memberId.val()) == false){
    		alert("아이디는 최소 4자리이상이어야 합니다.");
    		$memberId.select();
    		return false;
    	}
    	//비밀번호
    	var $p1 = $("#memberPw");
    	if(/^[a-zA-Z0-9!@#$$%^&*()]{4,}/.test($p1.val()) == false){
    		alert("유효한 패스워드를 입력하세요.");
    		$p1.select();
    		return false;
    	}
    	//닉네임
    	var $memberNickname =$("#memberNickname"); 
    if(/^[가-힣]{1,}$/.test($memberNickname.val()) == false){
    		alert("닉네임은 최소 1자리이상이어야 합니다.");
    		$memberNickname.select();
    		return false;
    }
  //phone
	var $memberPhone = $("#memberPhone");
	//-제거하기
	$memberPhone.val($memberPhone.val().replace(/[^0-9]/g, ""));//숫자아닌 문자(복수개)제거하기
	
	if(/^010[0-9]{8}$/.test($memberPhone.val()) == false){
		alert("유효한 전화번호가 아닙니다.");
		$memberPhone.select();
		return false;
	}
    	return true;
     });
	</script>