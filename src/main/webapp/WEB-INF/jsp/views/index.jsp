<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Football Manager</title>
<style>
	.msg {
		text-align:center;
		background:pink;
		padding: 5px;
	}
</style>
</head>
<body style="margin:0 auto; width:1024px">
	
	<h1>Football Manager</h1>
	<p><a href="${pageContext.request.contextPath}/football/add" title="Add">Add</a></p>
	<p>${msg}</p>
	<c:choose>
		<c:when test="${not empty footballList}">
			<table width="80%" border="1" cellpadding="1" cellspacing="1">
				<tr>
					<th width="10%">ID</th>
					<th width="50%">Tên đội</th>
					<th width="20%">Ngày thành lập</th>
					<th>Chức năng</th>
				</tr>
				<c:forEach items="${footballList}" var="football">
					<fmt:formatDate value="${football.createdDate}" pattern="yyyy-MM-dd" var="fmtDate" />
					<tr>
						<td>${football.id}</td>
						<td> ${football.name}</td>
						<td>${fmtDate}</td>
						<td>
							<a href="${pageContext.request.contextPath}/football/edit/${football.id}" title="Update">Update</a> ||
							<a href="${pageContext.request.contextPath}/football/detail/${football.id}" title="View">Detail</a> ||
							<a href="${pageContext.request.contextPath}/football/delete/${football.id}" title="Delete">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<p class="msg">No data</p>
		</c:otherwise>
	</c:choose>
</body>
</html>