<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html;charset=UTF-8"%>
<%@ include file="../includes/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Mango-Index</title>
<meta name="menu" content="home" />
<script type="text/javascript"
	src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#jsdelete").click(function() {
			//$(this).hide();
			var saveData = {
				"id" : "1"
			};
			/* $.ajax({
				type : "DELETE",
				url : "user/",
				data : JSON.stringify(saveData),
				contentType : "application/json",
				dataType : "json",
				success : function(data) {
					alert(data);
				}
			});  */
			$.ajax({
				type : "post",
				url : "user/2",
				data : {
					id : "1",
					_method : "delete"
				},
				contentType : "application/x-www-form-urlencoded",
				//contentType : "application/json",
				dataType : "json",
				success : function(data) {
					alert(data);
				}
			});
		});
	});
</script>
</head>
<body>

	<h1>USER</h1>

	<div style="text-align: center">
		<img src="<c:url value='/resources/images/team.jpg'/>" />
	</div>
	<div>
		<label>保存新增</label>
		<form name="saveAddForm" method="post" action="user/">
			<table>
				<tr>
					<td>用户名:<input type="text" name="name" id="addName"></td>
				</tr>
				<tr>
					<td>密码:<input type="password" name="password" id="addPassword"></td>
				</tr>
				<tr>
					<td><input type="submit" value="登录"
						style="background-color: pink"> <input type="reset"
						value="重置" style="background-color: red"></td>
				</tr>

				<c:forEach var="fuwa" items="${list}">
					<c:out value="${name}" /> -- 
					<c:out value="${password}" />
					<br>
				</c:forEach>
			</table>
		</form>
	</div>
	<div>
		<button id="jsdelete">JS删除00</button>
	</div>
</body>
</html>
