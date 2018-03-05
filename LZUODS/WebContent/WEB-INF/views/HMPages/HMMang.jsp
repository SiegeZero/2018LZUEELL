<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<! doctype html>
<html>

<head>
<title>人员管理</title>
<script>
	window.onload = function(){
		flag = quit_office_types;
	}
	var flag;
	function show_func() {
		if (func.style.display == "none") {
			func.style.display = "block";
		} else if (func.style.display == "block") {
			func.style.display = "none";
		}
	}
	function show_title_lv() {
		if (title_lv.style.display == "none") {
			title_lv.style.display = "block";
		} else if (title_lv.style.display == "block") {
			title_lv.style.display = "none";
		}
	}
	function show_quit_office_types() {
		if (quit_office_types.style.display == "none") {
			flag.style.display = "none";
			quit_office_types.style.display = "block";
		}
		flag = quit_office_types;
	}
	function show_conscription_situations() {
		if (conscription_situations.style.display == "none") {
			flag.style.display = "none";
			conscription_situations.style.display = "block";
		}
		flag = conscription_situations;
	}
	function show_political_status() {
		if (political_status.style.display == "none") {
			flag.style.display = "none";
			political_status.style.display = "block";
		}
		flag = political_status;
	}
	function show_physical_situation() {
		if (physical_situation.style.display == "none") {
			flag.style.display = "none";
			physical_situation.style.display = "block";
		}
		flag = physical_situation;
	}
	function show_is_help_needed() {
		if (is_help_needed.style.display == "none") {
			flag.style.display = "none";
			is_help_needed.style.display = "block";
		}
		flag = is_help_needed;
	}
	function show_latest_sympathy_year() {
		if (latest_sympathy_year.style.display == "none") {
			flag.style.display = "none";
			latest_sympathy_year.style.display = "block";
		}
		flag = latest_sympathy_year;
	}
	function show_edu_bg() {
		if (edu_bg.style.display == "none") {
			flag.style.display = "none";
			edu_bg.style.display = "block";
		}
		flag = edu_bg;
	}
	
</script>
</head>

<%@page import="java.util.List
	,com.gsb.BasicObject.Beans.SourcePerson
	,com.gsb.BasicObject.MBGPOJO.Society
	,java.util.Calendar
	,java.util.Date"%>
<%
	int Age = 0;
	List<SourcePerson> person_list = (List<SourcePerson>) request.getAttribute("person_list");
	List<String> nations_list = (List<String>) request.getAttribute("nations_list");
	List<Society> sociaties_list = (List<Society>) request.getAttribute("sociaties_list");
	List<String> func_list = (List<String>) request.getAttribute("func_list");
	List<String> title_lv_list = (List<String>) request.getAttribute("title_lv_list");
	List<String> conscription_situation_list = (List<String>) request.getAttribute("conscription_situation_list");
	List<String> political_status_list = (List<String>) request.getAttribute("political_status_list");
	List<String> edu_bg_list = (List<String>) request.getAttribute("edu_bg_list");
	
%>

<body style="height: 100%">

	<jsp:include page="../public/NavigationBar.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 navbar-inverse sidebar" style="height: 100%">
				<ul class="nav nav-sidebar">
					<li><a href="#">人员管理&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span
							class="caret"></span></a></li>
					<ul class="nav">
						<li><a href="HMMang"><span class="glyphicon glyphicon-user"></span>&nbsp;人员信息</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-yen"></span>&nbsp;工资管理</a></li>
						<li><a href="HMAnls"><span class="glyphicon glyphicon-signal"></span>&nbsp;统计分析</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-tags"></span>&nbsp;其他功能</a></li>
					</ul>
				</ul>
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<form action="ConfirmPage" method="post" class="navbar-form">
						<div>
							<table class="table">
								<tr>
									<th>基本：</th>
									<td><a onclick="show_quit_office_types()">离退情况</a></td>
									<td><a onclick="show_conscription_situations()">兵役情况</a></td>
									<td><a onclick="show_political_status()">政治面貌</td>
									<td><a onclick="show_physical_situation()">在世情况</td>
									<td><a onclick="show_is_help_needed()">贫困状况</td>
									<td><a onclick="show_latest_sympathy_year()">慰问情况</td>
									<td><a onclick="show_edu_bg()">学历</td>
								</tr>
								<tr>
									<td colspan="9">
										<ul style="display:block" class="nav navbar-nav" id="quit_office_types">
										<%
											List<String> quit_office_type_str = (List<String>)request.getAttribute("quit_office_type_str");
										%>
											<li>
												<input type="checkbox" value="离休"
													name="quit_office_type" id="quit_office_type0" onClick="select_attribute" 
													<%= quit_office_type_str!=null&&quit_office_type_str.contains("离休")?"checked":"" %>
													/>离休
											</li>
											<li>
												<input type="checkbox" value="退休"
													name="quit_office_type" id="quit_office_type1" onClick="select_attribute" 
														<%= quit_office_type_str!=null&&quit_office_type_str.contains("退休")?"checked":"" %>
													/>退休
											</li>
										</ul>
										<ul style="display:none" class="nav navbar-nav" id="conscription_situations">
										<%
										List<String> cs_str = (List<String>) request.getAttribute("cs_str");
										for(int li_index=0;conscription_situation_list!=null && li_index<conscription_situation_list.size();li_index++){
											%>
											<li>
												<input type="checkbox" 
													id="conscription_situation<%=li_index %>" name="conscription_situation"
													onClick="select_attribute"
													value="<%=conscription_situation_list.get(li_index).equals("")?"无数据":conscription_situation_list.get(li_index) %>" 
													<%=cs_str!=null&&cs_str.contains( conscription_situation_list.get(li_index))?"checked":"" %>
													/><%=conscription_situation_list.get(li_index).equals("")?"无数据":conscription_situation_list.get(li_index) %>
											</li>
											<%} %>
										</ul>
										<ul style="display:none" class="nav navbar-nav" id="political_status">
										<%
										List<String> political_status_str = (List<String>) request.getAttribute("political_status_str");
										for(int li_index=0;political_status_list!=null && li_index<political_status_list.size();li_index++){
											%>
											<li>
												<input type="checkbox"
													id="political_status<%=li_index %>" name="political_status"
													onClick="select_attribute"
													value="<%=political_status_list.get(li_index).equals("")?"无数据":political_status_list.get(li_index) %>"
													<%=political_status_str!=null&&political_status_str.contains( political_status_list.get(li_index))?"checked":"" %>
													/><%=political_status_list.get(li_index).equals("")?"无数据":political_status_list.get(li_index) %>
											</li>
											<%} %>
										</ul>
										<ul style="display:none" class="nav navbar-nav" id="physical_situation">
											<li>
												<input type="radio" value="在世" name="physical_situation" id="physical_situation0" onClick="select_attribute" />在世
											</li>
											<li>
												<input type="radio" value="离世" name="physical_situation" id="physical_situation1" onClick="select_attribute" />离世
											</li>
											<li>
												<input type="radio" value="全选" name="physical_situation" id="physical_situation2" onClick="select_attribute" />全选
											</li>
										</ul>
										<ul style="display:none" class="nav navbar-nav" id="is_help_needed">
											<li>
												<input type="radio" value="是" name="is_help_needed" id="is_help_needed0" onClick="select_attribute" />是
											</li>
											<li>
												<input type="radio" value="否" name="is_help_needed" id="is_help_needed1" onClick="select_attribute" />否
											</li>
											<li>
												<input type="radio" value="全选" name="is_help_needed" id="is_help_needed2" onClick="select_attribute" />全选
											</li>
										</ul>
										<ul style="display:none" class="nav navbar-nav" id="latest_sympathy_year">
											<li>
												<input type="radio" value="本年已慰问" name="latest_sympathy_year" id="latest_sympathy_year0" onClick="select_attribute" />本年已慰问
											</li>
											<li>
												<input type="radio" value="本年未慰问" name="latest_sympathy_year" id="latest_sympathy_year1" onClick="select_attribute" />本年未慰问
											</li>
											<li>
												<input type="radio" value="全选" name="latest_sympathy_year" id="latest_sympathy_year2" onClick="select_attribute" />全选
											</li>
										</ul>
										<ul style="display:none" class="nav navbar-nav" id="edu_bg">
										<%
										List<String> edu_bg_str = (List<String>) request.getAttribute("edu_bg_str");
										for(int li_index=0;edu_bg_list!=null && li_index<edu_bg_list.size();li_index++){
											%>
											<li>
												<input type="checkbox"
													name="edu_bg" id="edu_bg<%=li_index %>"
													value="<%=edu_bg_list.get(li_index).equals("")?"无数据":edu_bg_list.get(li_index) %>"
													onClick="select_attribute" 
													<%=edu_bg_str!=null&&edu_bg_str.contains( edu_bg_list.get(li_index))?"checked":"" %>
													/><%=edu_bg_list.get(li_index).equals("")?"无数据":edu_bg_list.get(li_index) %>
											</li>
											<%} %>
										</ul>
									</td>
								</tr>
								<tr>
									<th>年龄：</th>
					                <div>
					                	<td colspan="2"><input type="number" name="age" value="" placeholder="最小年龄" /></td>
					                </div>
					                <div>
					                	<td colspan="2"><input type="number" name="age" value="" placeholder="最大年龄" /></td>
					                </div>
								</tr>
								<tr>
									<th>分会：</th>
									<%
										List<Integer> sociaties_str = (List<Integer>)request.getAttribute("sociaties_str");
										for (int row_index = 0; sociaties_list != null && row_index < sociaties_list.size() ; row_index++) {
											Society s = sociaties_list.get(row_index);
											if(row_index % 9 == 0){
									%>
								</tr>
								<tr>
										<%
											} 
										%>
									<td><input 
											type="checkbox" name="society" id="society<%=row_index %>)"
											value="<%=s.getSocietyNo() %>" 
											onClick="select_attribute"
											<%=sociaties_str!=null&&sociaties_str.contains(s.getSocietyNo())?"checked":"" %>
										/>
										<%=s.getSocietyName().equals("")?"无分会":s.getSocietyName()%></td>	
									
									<%
										}
									%>
								</tr>
								<th>民族：</th>
								<%
								List<String> nations_str = (List<String>)request.getAttribute("nations_str");
								for (int row_index = 0; nations_list != null && row_index < nations_list.size(); row_index++) {
								%>
		
								<td><input 
										type="checkbox" 
										name="nations" 
										id="nation<%=row_index %>)" 
										value="<%=nations_list.get(row_index) %>" 
										onClick="select_attribute" 
										<%=nations_str!=null&&nations_str.contains(nations_list.get( row_index))?"checked":"" %>
									/> 
									<%=nations_list.get(row_index)%></td>
		
								<%
									}
								%>
								</tr>
							</table>
							<div>
								<div style="width:80%;float:left">
									<div stye="width:100%">
										<center>
											<button class="btn btn-info" type="button" title="输入姓名查询">
												<span>基础查询</span>
											</button>
											<input type="text" name="name_condition"
												value="<%=request.getAttribute("name_str") != null ? request.getAttribute("name_str") : ""%>"
												placeholder="输入姓名查询，多个姓名用空格分隔开" class="form-control" />
										</center>
									</div>
									<br />
									<div stye="width:100%">
										<div>
											<center>
												<button class="btn btn-info" type="button" onclick="show_func()" title="点击这里查看可选的职级&#xd再次点击关闭该参考页面">
													<span>职级列表</span>
												</button>
												<input type="text" name="func_condition"
													value="<%=request.getAttribute("func_str") != null ? request.getAttribute("func_str") : ""%>"
													placeholder="输入职级查询" class="form-control" />
											</center>
										</div>
										<div style="display: none" id="func">
											<table class="table table-bordered">
												<tr>
													<%
														for (int row_index = 0; func_list != null && row_index < func_list.size(); row_index++) {
															if (row_index % 6 == 0) {
													%>
												</tr>
												<tr>
													<td style="width: 10%"><%=func_list.get(row_index)%></td>
													<%
														} else {
													%>
													<td style="width: 10%"><%=func_list.get(row_index)%></td>
													<%
														}
													%>
													<%
														}
													%>
												</tr>
											</table>
										</div>
									</div>
									<br />
									<div stye="width:100%">
										<div>
											<center>
												<button class="btn btn-info" type="button" onclick="show_title_lv()" title="点击这里查看可选的职务&#xd再次点击关闭该参考页面">
													<span>职务列表</span>
												</button>
												<input type="text" name="title_lv_condition"
													value="<%=request.getAttribute("title_lv_str") != null ? request.getAttribute("title_lv_str") : ""%>"
													placeholder="输入职级查询" class="form-control" />
											</center>
										</div>
										<div style="display: none" id="title_lv">
											<table class="table table-bordered">
												<tr>
													<%
														List<String> title_lv_str = (List<String>)request.getAttribute("title_lv_str");
														for (int row_index = 0; title_lv_list != null && row_index < title_lv_list.size(); row_index++) {
															if (row_index % 6 == 0) {
													%>
												</tr>
												<tr>
													<%
														} 
													%>
													<td style="width: 10%"><%=title_lv_list.get(row_index)%></td>
													<%
														}
													%>
												</tr>
											</table>
										</div>
									</div>
									<br />
								</div>
								<div>
									<div>
										<button type="submit" title="点击查询">
											<span class="glyphicon glyphicon-search"></span>
										</button>
									</div>
								</div>
							</div>
						</div>
					</form>
				<div class="table">
					<table class="table table-striped table-bordered table-hover"
						id="personitem">
						<tr>
							<th class="info" style="width: 5%">序号</th>
							<th class="info" style="width: 7%">姓名</th>
							<th class="info" style="width: 7%">职称</th>
							<th class="info" style="width: 6%">职务</th>
							<th class="info" style="width: 8%">所在分会</th>
							<th class="info" style="width: 11%">原单位</th>
							<th class="info" style="width: 5%">离/退</th>
							<th class="info" style="width: 5%">性别</th>
							<th class="info" style="width: 5%">年龄</th>
							<th class="info" style="width: 7%">民族</th>
							<th class="info" style="width: 10%">籍贯</th>
							<th class="info" style="width: 8%">政治面貌</th>
							<th class="info" style="width: 16%">联系方式</th>
						</tr>
						<%
							Calendar cal = Calendar.getInstance();
							int thisYear = cal.get( Calendar.YEAR);
							Calendar b = Calendar.getInstance();
							for (int cow_index = 0; cow_index < person_list.size(); cow_index++) {
								Date birth = person_list.get(cow_index).getBirthTime();
								b.setTime( birth);
								cal.set( Calendar.YEAR, b.get(Calendar.YEAR));
								Age = (thisYear - b.get(Calendar.YEAR)) - (birth.before(cal.getTime())?0:1);
						%>
						<tr>
							<td><input type="checkbox" value="<%=person_list.get(cow_index).getSysNo()%>" /></td>
							<td><a href="HMDtal?id=<%=person_list.get(cow_index).getSysNo()%>">
							<%=person_list.get(cow_index).getName()%></a></td>
							<td><%=person_list.get(cow_index).getTitleLv()%></td>
							<td><%=person_list.get(cow_index).getFunc()%></td>
							<td><%=person_list.get(cow_index).getSociety().getSocietyName()%></td>
							<td><%=person_list.get(cow_index).getDept().getDeptName()%></td>
							<td><%=person_list.get(cow_index).getQuitOfficeType()%></td>
							<td><%=person_list.get(cow_index).getGender()%></td>
							<td><%=Age%></td>
							<td><%=person_list.get(cow_index).getNation()%></td>
							<td><%=person_list.get(cow_index).getNativePlace()%></td>
							<td><%=person_list.get(cow_index).getPoliticalStatus()%></td>
							<td><%=person_list.get(cow_index).getTelephoneNum()%></td>
						</tr>
						<%
							}
						%>
					</table>
				</div>
				<div class="container-fluid">
					<center>
						<div id="pagination">
    					</div>
					</center>
				</div>
				<div class="container-fluid">
					<!-- <div class="pull-left">
						<input type="checkbox"><strong>&nbsp;全选</strong>
					</div> -->
					<div class="pull-right">
						<a href="HMAdd"><button type="button" class="btn btn-info">新增人员</button></a>
						<button type="button" class="btn btn-warning">导出PDF</button>
						<button type="button" class="btn btn-warning"
							onclick="printtable(personitem)">导出Excel</button>
						<button type="button" class="btn btn-info">下载模板</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	
	<script src="../js/HMMang.js"></script>
	<script>
	var rows = document.getElementById("personitem").rows.length;
    $.jqPaginator('#pagination', {
        totalPages: rows/20,
        visiblePages: 10,
        currentPage: 1,
        wrapper:'<ul class="pagination"></ul>',
        first: '<li class="first"><a href="javascript:void(0);">First</a></li>',
        prev: '<li class="prev"><a href="javascript:void(0);">Previous</a></li>',
        next: '<li class="next"><a href="javascript:void(0);">Next</a></li>',
        last: '<li class="last"><a href="javascript:void(0);">Last</a></li>',
        page: '<li class="page"><a href="javascript:void(0);">{{page}}</a></li>',
        onPageChange: function (num) {
            $('#p').text(num);
        }
    });
</script>
	
</body>

</html>
