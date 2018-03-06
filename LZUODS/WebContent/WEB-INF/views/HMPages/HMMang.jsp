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
	,com.gsb.BasicObject.MBGPOJO.SourcePerson
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
						<p>Copyright: <a href="#!">&nbspLZUODS&nbsp</a></p>
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


</body>

</html>
