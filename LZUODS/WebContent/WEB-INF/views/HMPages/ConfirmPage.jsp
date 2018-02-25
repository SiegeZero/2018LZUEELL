<%@page import="com.sun.java.swing.plaf.windows.resources.windows"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>搜索确认</title>
<script>
	
</script>
</head>
<%@ page
	import="java.util.List,
		java.util.ArrayList,
		com.gsb.BasicObject.MBGPOJO.Sociaty,
		java.util.Map,
		java.util.HashMap"%>
<%
int quit_office_type_size=2,conscription_situation_conditions_size=0;

String[] quit_office_types = request.getParameterValues("quit_office_type");
String name_str = request.getParameter("name_condition");
String func_str = request.getParameter("func_condition");
String title_lv_str = request.getParameter("title_lv_condition");
String[] age_range = request.getParameterValues("age");
String[] sociaties = request.getParameterValues("sociaty");
String[] nations = request.getParameterValues("nations");
String[] cs_str = request.getParameterValues("conscription_situation");
String[] political_str = request.getParameterValues("political_status");
String physical_str = request.getParameter("physical_situation");
String[] edu_bg = request.getParameterValues("edu_bg");
Map<Integer, String> sociaties_map = new HashMap<>();
List<Sociaty> sociaties_list = (List<Sociaty>) request.getAttribute("sociaties_list");
for( Sociaty s:sociaties_list) {
	sociaties_map.put( s.getSociatyNo(),s.getSociatyName());
}
%>

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
				<%
				if( name_str != null && !name_str.equals("")) {
				%>
				<div class="container-fluid">
					<strong>选择的姓名包含：</strong> <input type="text" class="form-control"
						name="name_condition" value="<%=name_str %>" readonly />
				</div>
				<%
				}
				if( func_str != null && !func_str.equals("")) {
				%>
				<div class="container-fluid">
					<strong>选择的职务包含：</strong> <input type="text" class="form-control"
						name="func_condition" value="<%=func_str %>" readonly />
				</div>
				<%
				}
				if( title_lv_str != null && !title_lv_str.equals("")) {
				%>
				<div class="container-fluid">
					<strong>选择的职级包含：</strong> <input type="text" class="form-control"
						name="title_lv_condition" value="<%=title_lv_str %>" readonly />
				</div>
				<%
				}
				if( quit_office_types!=null && quit_office_types.length!=0) {
				%>
				<div class="container-fluid">
					<strong>选择的离退休情况包含：</strong>
					<%for(int index=0;index< quit_office_types.length;index++){ %>
					<input type="text" class="form-control" name="quit_office_type"
						value="<%=quit_office_types[index]%>" readonly />
					<%} %>
				</div>
				<%
				}

				if(age_range!=null && age_range.length == 2 
						&& !age_range[0].equals("") && !age_range[1].equals("")) {
				%>
				<div class="container-fluid">
					<strong>选择的年龄范围是：</strong> <input name="age_range" type="text"
						class="form-control" value="<%=age_range[0]+"-"+age_range[1]%>" readonly /> <input
						name="deadline" type="text" class="form-control"
						placeholder="输入一个具体的截止日期，日期输入格式为yyyymmdd">
				</div>
				<%
				}
				if(sociaties!=null&&sociaties.length!=0) {
				%>
				<div class="container-fluid">
					<strong>选择的分会包含：</strong>
					<%
					for( int i=0;i<sociaties.length;i++){
					%>
					<input name="sociaty" id="sociaty<%=i %>" type="hidden"
						class="form-control"
						value="<%=sociaties[i] %>"
						readonly />
					<input type="text" class="form-control" 
						value="<%=sociaties_map.get( Integer.parseInt(sociaties[i]))%>" 
						readonly />
					<%
					}
					%>
				</div>
				<%
				}
				if(physical_str!=null && !physical_str.equals("")) {
				%>
				<div class="container-fluid">
					<strong>选择的在世情况包含：</strong>
					<input name="physical_situation" type="text"
						class="form-control"
						value="<%=physical_str %>"
						readonly />
				</div>
				<%
				}
				if(edu_bg!=null&&edu_bg.length!=0) {
				%>
				<div class="container-fluid">
					<strong>选择的学历包含：</strong>
					<%
					for( int i=0;i<edu_bg.length;i++){
					%>
					<input type="text" class="form-control" 
						name="edu_bg" id="edu_bg<%=i %>"
						value="<%=edu_bg[i]%>" 
						readonly />
					<%
					}
					%>
				</div>
				<%
				}
				if(cs_str!=null&&cs_str.length!=0) {
				%>
				<div class="container-fluid">
					<strong>选择的兵役情况包含：</strong>
					<%
					for( int i=0;i<cs_str.length;i++){
					%>
					<input type="text" class="form-control" 
						name="conscription_situation" id="conscription_situation<%=i %>"
						value="<%=cs_str[i].equals("无数据")?"":cs_str[i]%>"
						readonly />
					<%
					}
					%>
				</div>
				<%
				}
				if(political_str!=null&&political_str.length!=0) {
				%>
				<div class="container-fluid">
					<strong>选择的政治面貌包含：</strong>
					<%
					for( int i=0;i<political_str.length;i++){
					%>
					<input type="text" class="form-control"
						name="political_status" id="political_status<%=i %>"
						value="<%=political_str[i].equals("无数据")?"":political_str[i]%>"
						readonly />
					<%
					}
					%>
				</div>
				<%
				}
				if(nations!=null&&nations.length!=0) {
				%>
				<div class="container-fluid">
					<strong>选择的民族包含：</strong>
					<%
					for( int i=0;i<nations.length;i++){
					%>
					<input name="nations" id="nation<%=i %>" type="text"
						class="form-control" value="<%=nations[i]%>" readonly />
					<%
					}
					%>
				</div>
				<%
				}
				
				%>
				<div class="container-fluid" style="margin-top: 10px">
					<button class="btn btn-warning" type="submit">确认查询</button>
					<button class="btn btn-info" type="button"
						onclick="javascript:history.back(-1);">返回修改</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>