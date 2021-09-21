<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax - xml</title>
<script src="<%= request.getContextPath() %>/js/jquery-3.6.0.js"></script>
</head>
<body>
	<h1>XML</h1>
	<button type="button" id="btn">실행</button>
<script>
$(btn).click(function(){
	
	$.ajax({
		url: "<%= request.getContextPath() %>/xml",
		//dataType: "xml",
		success: function(data){
			console.log(data);
			var $root = $(data).find(":root");
			//console.log($root);
			var $members = $root.find("member");
			var $table = $("<table></table>");
			$members.each(function(index, member){
				console.log(index, member);
				var $tr = $("<tr></tr>");
				
				
			});
			
		},
		error: function(xhr, status, err){
			console.log(xhr, status, err);
		}
		
	});
	
});
</script>	
</body>
</html>