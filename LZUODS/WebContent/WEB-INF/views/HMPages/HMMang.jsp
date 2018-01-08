<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="height: 100%">
<head style="height: 100%">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!--IE浏览器渲染方式-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--移动设备响应-->
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<title>人员管理</title>
</head>
<%@page import="java.util.List,com.gsb.BasicObject.MBG.Person" %>

<body style="height: 100%">

	<jsp:include page="NavigationBar.jsp"></jsp:include>
	<div class="container-fluid" style="height: 100%">
		<div class="row" style="height: 100%">
			<div class="col-md-2 col-sm-2 col-xs-2 navbar-inverse navbar-collapse" style="height: 100%">
				<ul class="nav">
					<li>
						<a href="#">人员管理&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="caret"></span></a>
					</li>
					<ul class="nav">
						<li><a href="#"><span class="glyphicon glyphicon-user"></span>&nbsp;人员信息</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-yen"></span>&nbsp;工资管理</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-signal"></span>&nbsp;统计分析</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-tags"></span>&nbsp;其他功能</a></li>
					</ul>
				</ul>
			</div>
			<div class="col-md-10 col-sm-8 col-xs-8">
				<form action="" method="post" class="navbar-form">
					<div>
						<center>
							<input type="text" placeholder="输入姓名或者工资号" class="form-control" />
							<button type="submit" action="#" method="post">
                        <span class="glyphicon glyphicon-search"></span>
                        </button>
						</center>
						<table class="table">
						<% List<Person> person_list=(List<Person>)request.getAttribute("person_list");  %>
						<% List<String> nations_list=(List<String>)request.getAttribute("nations_list");  %>
						<% List<String> sociaties_list=(List<String>)request.getAttribute("sociaties_list");  %>
							<tr>
								<th>基本：</th>
								<td>离休情况</td>
								<td>兵役情况</td>
								<td>政治面貌</td>
								<td>在世情况</td>
								<td>贫困状况</td>
								<td>慰问情况</td>
								<td>学历</td>
								<td>更多条件 ↓</td>
							</tr>
							<!--<tr style="height: 30px"></tr>-->
							<tr>
								<th>年龄：</th>
								<td><input type="checkbox" onClick="select_attribute" /> 60 - 70</td>
								<td><input type="checkbox" onClick="select_attribute" /> 70 - 80</td>
								<td><input type="checkbox" onClick="select_attribute" /> 80 - 90</td>
								<td><input type="checkbox" onClick="select_attribute" /> 90 - 100</td>
								<td><input type="checkbox" onClick="select_attribute" /> 100 +</td>
							</tr>
							<tr>
								<th>职级：</th>
								<td><input type="checkbox" onClick="select_attribute" /> 副科
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 正科
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 科长
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 副地级
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 地级
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 副厅级
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 正厅级
								</td>
								<td>更多+</td>
							</tr>
							<tr>
								<th>职称：</th>
								<td><input type="checkbox" onClick="select_attribute" /> 工人
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 技师
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 中级
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 高级
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 副高
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 正高
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 实验师
								</td>
								<td>更多+</td>
							</tr>
							<tr>
							<th>分会：</th>
							<% for(int row_index=0;sociaties_list!=null&&row_index<sociaties_list.size();row_index++){%>
							
								<td><%=sociaties_list.get(row_index)%></td>
							
							<%}%>
							</tr>
							<th>民族：</th>
							<% for(int row_index=0;nations_list!=null&&row_index<nations_list.size();row_index++){%>
								
								<td><%=nations_list.get(row_index)%></td>
								
							<%}%>
							</tr>
						</table>
					</div>
				</form>
				<div class="table-resopnsive">
					<table class="table table-striped table-bordered table-hover" id="personitem">
						<tr>
							<th class="info">序号</th>
							<th class="info">姓名</th>
							<th class="info">工资编码</th>
							<th class="info">所在分会</th>
							<th class="info">单位名称</th>
							<th class="info">工资库</th>
							<th class="info">离/退</th>
							<th class="info">性别</th>
							<th class="info">民族</th>
							<th class="info">籍贯</th>
							<th class="info">学历</th>
							<th class="info">政治面貌</th>
						</tr>
						<% 
							for(int cow_index=0;cow_index<person_list.size()&&cow_index<5;cow_index++){
						%>
							<tr>
								<td><input type="checkbox" /><%= person_list.get(cow_index).getSysNo() %></td>
								<td><%= person_list.get(cow_index).getName() %></td>
								<td><%= person_list.get(cow_index).getSalaryNo() %></td>
								<td></td>
								<td></td>
								<td><%= person_list.get(cow_index).getSalaryLibNo() %></td>
							</tr>
							<%} %>
					</table>
				</div>
			</div>
			<div class="col-md-10">
				<div class="pull-left tool-btn">
					<input type="checkbox"><strong>&nbsp;全选</strong>
				</div>
				<div class="pull-right">
					<a href="HMAdd.html"><button type="button" class="btn btn-info" >新增人员</button></a>
					<button type="button" class="btn btn-warning">导出PDF</button>
					<button type="button" class="btn btn-warning" onclick="printtable(personitem)">导出Excel</button>
					<button type="button" class="btn btn-info">下载模板</button>
				</div>
			</div>
		</div>
	</div>
	
	<script src="js/functions.js"></script>

</body>

</html>
