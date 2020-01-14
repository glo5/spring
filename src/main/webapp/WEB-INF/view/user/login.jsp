<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 페이지</h1>
	<form method="POST">
		<input type="text" name="userid" value="${email}" />
		<input type="text" name="password" />
		<input type="checkbox" name="remember" />이메일 기억<br/>
		<input type="submit" value="로그인"/>
	</form>
</body>
</html>