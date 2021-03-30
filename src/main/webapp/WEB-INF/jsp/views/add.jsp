<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quản lý Bóng đá | Thêm</title>
</head>
<body style="margin:0 auto; width:1024px">
	<h1>Quản lý Bóng đá</h1>
	
	<form:errors path="fb.*" cssStyle="color:red" cssClass="error" />
	
	<form action="${pageContext.request.contextPath}/football/add" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<th>
					Tên đội:
				</th>
				<td><input name="name" value="" type="text" /></td>
			</tr>
			<tr>
				<th>
					Ngày thành lập:
				</th>
				<td> <input name="createdDate" value="" type="text" /></td>
			</tr>
			<tr>
				<th>
					Hình ảnh:
				</th>
				<td> <input type="file" value="Upload file" name="file" /></td>
			</tr>
			<tr>
				<th>
					<label>Mô tả:</label>
				</th>
				<td><textarea rows="4" cols="30" name="description"></textarea></td>
			</tr>
			<tr>
				<th></th>
				<td><input name="submit" value="Gửi" type="submit" /></td>
			</tr>
		</table>
	</form>
</body>	
</html>