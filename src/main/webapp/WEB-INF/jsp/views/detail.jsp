<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Detail football</title>
<style>
	.detail {
		padding: 30px;
		background:#zzz;
		margin: 50px auto;
	}
</style>
</head>
<body>
	<c:choose>
		<c:when test="${not empty football}">
			<div class="detail">
				<h1>${football.name}</h1>
				<c:if test="${not empty football.picture}">
					<img src="${pageContext.request.contextPath}/${PATH_PROJECT}/${football.picture}">
				</c:if>
				<p>
					${football.description}
				</p>		
			</div>
		</c:when>
		<c:otherwise>
			<p>No data!</p>
		</c:otherwise>
	</c:choose>
</body>
</html>