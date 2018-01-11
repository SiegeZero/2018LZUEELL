<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="NavigationBar.jsp"></jsp:include>

	<div class="container-fluid">
		<p class="alert alert-info">
			<strong>您已选择的条件：</strong>
		</p>
	</div>
	<div class="container-fluid">
		<div class="container-fluid">
			<form action="HMMang" method="post">
				<div class="container-fluid">
					<input type="text" class="form-control" name="func_condition" value="<%=request.getParameter("func_condition")%>" readonly/>
				</div>
				<div class="container-fluid" style="margin-top:10px">
					<button class="btn btn-warning" type="submit">确认查询</button>
					<button class="btn btn-info" type="button" onclick="javascript:history.back(-1);">返回修改</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>