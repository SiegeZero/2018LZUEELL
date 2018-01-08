<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>测试JavaBean的初始化</title>
</head>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<body>
	<form:form modelAttribute="atv_info" action="save-bean" method="post">
		<fieldset>
			<p>
				<label for="atvTopic" >atvTopic:</label>
				<form:input id="atvTopic" path="atvTopic"/>
			</p>
			<p>
				<label for="atvPlace" >atvPlace:</label>
				<form:input id="atvPlace" path="atvPlace"/>
			</p>
			<p>
				<input type="submit" value="submit" />
			</p>
		</fieldset>
	</form:form>
</body>
</html>