<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	
</script>
</head>

<%int size=0;
Set<String>
for(int index=0;index<size;index++){
	String str = (String)request.getParameter("conscription_situation"+index);
	if(str!=null&&!str.equals("")){
		
	}
}%>

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
					<strong>选择的姓名包含：</strong>
					<input type="text" class="form-control" name="name_condition" value="<%=request.getParameter("name_condition")%>" readonly/>
				</div>
				<div class="container-fluid">
					<strong>选择的职务包含：</strong>
					<input type="text" class="form-control" name="func_condition" value="<%=request.getParameter("func_condition")%>" readonly/>
				</div>
				<div class="container-fluid">
					<strong>选择的职级包含：</strong>
					<input type="text" class="form-control" name="title_lv_condition" value="<%=request.getParameter("title_lv_condition")%>" readonly/>
				</div>
				<div class="container-fluid">
					<strong>选择的离退休情况包含：</strong>
					<%for(int index=0;index<2;index++){ %>
					<input type="text" class="form-control" name="title_lv_condition" value="<%=request.getParameter("quit_office_type"+index)%>" readonly/>
					<%} %>
				</div>
				<div class="container-fluid">
					<strong>选择的兵役情况包含：</strong>
					<%for(int index=0;index<2;index++){ %>
					<input type="text" class="form-control" name="#" value="<%=request.getParameter("#")%>" readonly/>
					<%} %>
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