<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>人员管理</title>

	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link rel="stylesheet" href="../assets/materialize/css/materialize.min.css" media="screen,projection" />
	<!-- Bootstrap Styles-->
	<link href="../assets/css/bootstrap.css" rel="stylesheet" />
	<!-- FontAwesome Styles-->
	<link href="../assets/css/font-awesome.css" rel="stylesheet" />
	<!-- Morris Chart Styles-->
	<link href="../assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
	<!-- Custom Styles-->
	<link href="../assets/css/custom-styles.css" rel="stylesheet" />
	<!-- Google Fonts-->
	<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
	<link rel="stylesheet" href="../assets/js/Lightweight-Chart/cssCharts.css">
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
	List<Society> societies_list = (List<Society>) request.getAttribute("societies_list");
	List<String> func_list = (List<String>) request.getAttribute("func_list");
	List<String> title_lv_list = (List<String>) request.getAttribute("title_lv_list");
	List<String> conscription_situation_list = (List<String>) request.getAttribute("conscription_situation_list");
	List<String> political_status_list = (List<String>) request.getAttribute("political_status_list");
	List<String> edu_bg_list = (List<String>) request.getAttribute("edu_bg_list");
	
%>

<body>
	<div id="wrapper">
		<jsp:include page="../public/NavigationBarHuman.jsp"></jsp:include>
		<jsp:include page="../public/SideBarHuman.jsp"></jsp:include>
		<div id="page-wrapper">
			<div class="header">
				<h2 class="page-header">
					<strong>离退休人员基本信息表</strong>
				</h2>
			</div>

			<div id="page-inner">

				<div class="row">
					<div class="col-md-12">
						<!-- Advanced Tables -->
						<div class="card">
							<div class="card-content">
								<div class="table-responsive">
								<form action="ConfirmPage" method="post" class="navbar-form">
									<ul class="collapsible" data-collapsible="accordion">
										<li>
									    	<div class="collapsible-header"><i class="material-icons">games</i>高级查询</div>
									      	<div class="collapsible-body">
												<table class="table">
													<tr>
														<th>基本：</th>
														<td><a class="flow-text" onclick="show_gender()">性别</a></td>
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
															
															<ul style="display:block" class="nav navbar-nav" id="gender">
																<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																	<input type="radio" value="男" name="gender" id="gender0" onClick="select_attribute" />
																	<label for="gender0">男</label>
																</li>
																<li>
																	<input type="radio" value="女" name="gender" id="gender1" onClick="select_attribute" />
																	<label for="gender1">女</label>
																</li>
																<li>
																	<input type="radio" value="全选" name="gender" id="gender2" onClick="select_attribute" />
																	<label for="gender2">全选</label>
																</li>
															</ul>
															<ul style="display:none" class="nav navbar-nav" id="quit_office_types">
															<%
																List<String> quit_office_type_str = (List<String>)request.getAttribute("quit_office_type_str");
															%>
																<li>
																	<input type="checkbox" class="filled-in" value="离休" name="quit_office_type" id="quit_office_type0" onClick="select_attribute" 
																		<%= quit_office_type_str!=null&&quit_office_type_str.contains("离休")?"checked":"" %>
																		/>
																		<label for="quit_office_type0">离休</label>
																</li>
																<li>
																	<input type="checkbox" class="filled-in" value="退休"
																		name="quit_office_type" id="quit_office_type1" onClick="select_attribute" 
																			<%= quit_office_type_str!=null&&quit_office_type_str.contains("退休")?"checked":"" %>
																		/>
																		<label for="quit_office_type1">退休</label>
																</li>
															</ul>
															<ul style="display:none" class="nav navbar-nav" id="conscription_situations">
															<%
															List<String> cs_str = (List<String>) request.getAttribute("cs_str");
															for(int li_index=0;conscription_situation_list!=null && li_index<conscription_situation_list.size();li_index++){
																%>
																<li>
																	<input type="checkbox" class="filled-in" 
																		id="conscription_situation<%=li_index %>" name="conscription_situation"
																		onClick="select_attribute"
																		value="<%=conscription_situation_list.get(li_index).equals("")?"无数据":conscription_situation_list.get(li_index) %>" 
																		<%=cs_str!=null&&cs_str.contains( conscription_situation_list.get(li_index))?"checked":"" %>
																		/>
																		<lable for="conscription_situation<%=li_index %>"><%=conscription_situation_list.get(li_index).equals("")?"无数据":conscription_situation_list.get(li_index) %> </lable>
																</li>
																<%} %>
															</ul>
															<ul style="display:none" class="nav navbar-nav" id="political_status">
															<%
															List<String> political_status_str = (List<String>) request.getAttribute("political_status_str");
															for(int li_index=0;political_status_list!=null && li_index<political_status_list.size();li_index++){
																%>
																<li>
																	<input type="checkbox" class="filled-in"
																		id="political_status<%=li_index %>" name="political_status"
																		onClick="select_attribute"
																		value="<%=political_status_list.get(li_index).equals("")?"无数据":political_status_list.get(li_index) %>"
																		<%=political_status_str!=null&&political_status_str.contains( political_status_list.get(li_index))?"checked":"" %>
																		/>
																		<label for="political_status<%=li_index %>"><%=political_status_list.get(li_index).equals("")?"无数据":political_status_list.get(li_index) %></label>
																</li>
																<%} %>
															</ul>
															<ul style="display:none" class="nav navbar-nav" id="physical_situation">
																<li>
																	<input type="radio" value="在世" name="physical_situation" id="physical_situation0" onClick="select_attribute" />
																	<label for="physical_situation0">在世</label>
																</li>
																<li>
																	<input type="radio" value="离世" name="physical_situation" id="physical_situation1" onClick="select_attribute" />
																	<label for="physical_situation1">离世</label>
																</li>
																<li>
																	<input type="radio" value="全选" name="physical_situation" id="physical_situation2" onClick="select_attribute" />
																	<label for="physical_situation2">全选</label>
																</li>
															</ul>
															<ul style="display:none" class="nav navbar-nav" id="is_help_needed">
																<li>
																	<input type="radio" value="是" name="is_help_needed" id="is_help_needed0" onClick="select_attribute" />
																	<label for="is_needed_help0"|>是</label>
																</li>
																<li>
																	<input type="radio" value="否" name="is_help_needed" id="is_help_needed1" onClick="select_attribute" />
																	<label for="is_needed_help1">否</label>
																</li>
																<li>
																	<input type="radio" value="全选" name="is_help_needed" id="is_help_needed2" onClick="select_attribute" />
																	<label for="is_needed_help2">全选</label>
																</li>
															</ul>
															<ul style="display:none" class="nav navbar-nav" id="latest_sympathy_year">
																<li>
																	<input type="radio" value="本年已慰问" name="latest_sympathy_year" id="latest_sympathy_year0" onClick="select_attribute" />
																	<label for="latest_sympathy_year0">本年已慰问</label>
																</li>
																<li>
																	<input type="radio" value="本年未慰问" name="latest_sympathy_year" id="latest_sympathy_year1" onClick="select_attribute" />
																	<label for="latest_sympathy_year1">本年已本年未慰问</label>
																</li>
																<li>
																	<input type="radio" value="全选" name="latest_sympathy_year" id="latest_sympathy_year2" onClick="select_attribute" />
																	<label for="latest_sympathy_year2">全选</label>
																</li>
															</ul>
															<ul style="display:none" class="nav navbar-nav" id="edu_bg">
															<%
															List<String> edu_bg_str = (List<String>) request.getAttribute("edu_bg_str");
															for(int li_index=0;edu_bg_list!=null && li_index<edu_bg_list.size();li_index++){
																%>
																<li>
																	<input type="checkbox" class="filled-in"
																		name="edu_bg" id="edu_bg<%=li_index %>"
																		value="<%=edu_bg_list.get(li_index).equals("")?"无数据":edu_bg_list.get(li_index) %>"
																		onClick="select_attribute" 
																		<%=edu_bg_str!=null&&edu_bg_str.contains( edu_bg_list.get(li_index))?"checked":"" %>
																		/>
																		<label for="edu_bg<%=li_index %>"><%=edu_bg_list.get(li_index).equals("")?"无数据":edu_bg_list.get(li_index) %></label>
																</li>
																<%} %>
															</ul>
														</td>
													</tr>
													<tr>
														<th style="vertical-align:middle">年龄：</th>
										                <td colspan="2">
										                	<div class="input-field">
										                		<input id="min_age" type="number" class="validate" name="age" />
										                		<label for="min_age">最小年龄</label>
										                	</div>
										                </td>
										                <td colspan="2">
										                	<div class="input-field">
										                		<input id="max_age" type="number" class="validate" name="age"/>
										                		<label for="max_age">最大年龄</label>
										                	</div>
										                </td>
													</tr>
													<tr>
														<%
															List<Integer> societies_str = (List<Integer>)request.getAttribute("societies_str");
															for (int row_index = 0; societies_list != null && row_index < societies_list.size() ; row_index++) {
																Society s = societies_list.get(row_index);
																if(row_index % 8 == 0){
														%>
													</tr>
													<tr>
														<th>分会：</th>
															<%
																} 
															%>
														<td><input 
																type="checkbox" class="filled-in" name="society" id="society<%=row_index %>)"
																value="<%=s.getSocietyNo() %>" 
																onClick="select_attribute"
																<%=societies_str!=null&&societies_str.contains(s.getSocietyNo())?"checked":"" %>
															/>
															<label for=society<%=row_index %>)><%=s.getSocietyName().equals("")?"无分会":s.getSocietyName()%></label></td>	
														
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
															class="filled-in"
															name="nations" 
															id="nation<%=row_index %>)" 
															value="<%=nations_list.get(row_index) %>" 
															onClick="select_attribute" 
															<%=nations_str!=null&&nations_str.contains(nations_list.get( row_index))?"checked":"" %>
														/> 
														<label for="nation<%=row_index %>)"><%=nations_list.get(row_index)%></label></td>
							
													<%
														}
													%>
													</tr>
												</table>
											</div>
									    </li>
									 </ul>
									 </form>
									<table class="table table-striped table-bordered table-hover" id="dataTables-example">
										<thead>
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
										</thead>
										<tbody>
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
												<td><span><%=cow_index + 1%></span></td>
												<td>
													<a href="HMDtal?id=<%=person_list.get(cow_index).getSysNo()%>">
														<%=person_list.get(cow_index).getName()%>
													</a>
												</td>
												<td>
													<%=person_list.get(cow_index).getTitleLv()%>
												</td>
												<td>
													<%=person_list.get(cow_index).getFunc()%>
												</td>
												<td>
													<%=person_list.get(cow_index).getSociety().getSocietyName()%>
												</td>
												<td>
													<%=person_list.get(cow_index).getDept().getDeptName()%>
												</td>
												<td>
													<%=person_list.get(cow_index).getQuitOfficeType()%>
												</td>
												<td>
													<%=person_list.get(cow_index).getGender()%>
												</td>
												<td>
													<%=Age%>
												</td>
												<td>
													<%=person_list.get(cow_index).getNation()%>
												</td>
												<td>
													<%=person_list.get(cow_index).getNativePlace()%>
												</td>
												<td>
													<%=person_list.get(cow_index).getPoliticalStatus()%>
												</td>
												<td>
													<%=person_list.get(cow_index).getTelephoneNum()%>
												</td>
											</tr>
											<%
												}
											%>
										</tbody>
									</table>
								</div>

							</div>
						</div>
						<!--End Advanced Tables -->
					</div>
				</div>
				
				<!-- /. ROW  -->

				<footer>
					<center>
						<p>Copyright: <a href="#!">&nbsp;LZUODS&nbsp;</a></p>
					</center>
				</footer>
			</div>
			<!-- /. PAGE INNER  -->
		</div>
		<!-- /. PAGE WRAPPER  -->
		<!-- /. WRAPPER  -->
		<!-- JS Scripts-->


		<!-- jQuery Js -->
		<script src="../assets/js/jquery-1.10.2.js"></script>

		<!-- Bootstrap Js -->
		<script src="../assets/js/bootstrap.min.js"></script>

		<script src="../assets/materialize/js/materialize.min.js"></script>

		<!-- Metis Menu Js -->
		<script src="../assets/js/jquery.metisMenu.js"></script>
		<!-- Morris Chart Js -->
		<script src="../assets/js/morris/raphael-2.1.0.min.js"></script>
		<script src="../assets/js/morris/morris.js"></script>


		<script src="../assets/js/easypiechart.js"></script>
		<script src="../assets/js/easypiechart-data.js"></script>

		<script src="../assets/js/Lightweight-Chart/jquery.chart.js"></script>
		<!-- DATA TABLE SCRIPTS -->
		<script src="../assets/js/dataTables/jquery.dataTables.js"></script>
		<script src="../assets/js/dataTables/dataTables.bootstrap.js"></script>
		<script>
			$(document).ready(function() {
				$('#dataTables-example').dataTable();
			});

		</script>
		<!-- Custom Js -->
		<script src="../assets/js/custom-scripts.js"></script>
		
		<script>
			window.onload = function(){
				flag =  gender;
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
			function show_gender() {
				if (gender.style.display == "none") {
					flag.style.display = "none";
					gender.style.display = "block";
				}
				flag = gender;
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


</body>

</html>
