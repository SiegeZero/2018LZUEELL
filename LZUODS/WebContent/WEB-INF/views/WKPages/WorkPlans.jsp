<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>工作计划</title>

<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet"
	href="../assets/materialize/css/materialize.min.css"
	media="screen,projection" />
<!-- Bootstrap Styles-->
<link href="../assets/css/bootstrap.css" rel="stylesheet" />
<!-- FontAwesome Styles-->
<link href="../assets/css/font-awesome.css" rel="stylesheet" />
<!-- Morris Chart Styles-->
<link href="../assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
<!-- Custom Styles-->
<link href="../assets/css/custom-styles.css" rel="stylesheet" />
<!-- Google Fonts-->
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link rel="stylesheet"
	href="../assets/js/Lightweight-Chart/cssCharts.css">
</head>

<%@page import="java.util.List,com.gsb.BasicObject.MBGPOJO.WorkPlan"%>
<%
	List<WorkPlan> workplan_list = (List<WorkPlan>) request.getAttribute("workplan_list");
%>

<body>
	<div id="wapper">
		<jsp:include page="../public/NavigationBar.jsp"></jsp:include>
		<div id="page-wapper" style="width: 100%; position: absolute; margin-top: 80px;">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<!--    Context Classes  -->
						<div class="card">
							<div class="card-action">
								<span style="font-size: 32px"><strong>工作计划清单</strong></span> <span
									style="float: right; margin-right: 20px;" title="添加工作计划"><a
									class="btn-floating waves-effect waves-light red"
									href="../WKM/WorkPlanAdd"><i class="material-icons">mode_edit</i></a></span>
							</div>
							<div class="container-fluid">
								<%
									if (workplan_list != null && !workplan_list.isEmpty()) {
										for (WorkPlan p : workplan_list) {
								%>
								<div class="col-md-4 col-sm-4">
									<div class="card">
										<div class="card-image waves-effect waves-block waves-light">
											<img class="activator" src="../assets/img/workspace.jpg">
										</div>
										<div class="card-content">
											<span class="card-title activator grey-text text-darken-4"><%=p.getTitle()%><i
												class="material-icons right">more_vert</i></span>
											</p>
											<span class="card-title activator grey-text text-darken-5" style="font-size: 14px">创建时间:<%=p.getHappenDate()%></span>
										</div>
										<div class="card-reveal">
											<span class="card-title grey-text text-darken-4"><%=p.getTitle()%><i class="material-icons right">close</i> </span>
											<hr></hr>
											<p style="color:green"><span>计划人Id：<%=p.getSysNo() %></span><span style="float:right">计划状态：<%=p.getStatus() %></span></p>
											<hr></hr>
											<p><%=new String(p.getRemark())%></p>
											<hr></hr>
											<span class="card-title activator grey-text text-darken-5" style="font-size: 14px">创建时间:<%=p.getHappenDate()%></span>
										</div>
									</div>
								</div>
								<%
									}
								}
								%>
							</div>
							<!--  end  Context Classes  -->
						</div>
					</div>
				</div>
			</div>
		</div>


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
		<!-- Custom Js -->
		<script src="../assets/js/custom-scripts.js"></script>
		<!-- Carousel -->
		<script>
			$(document).ready(function() {
				$('.carousel').carousel();
			})
		</script>
		<script>
			document.getElementById("WorkPlans").className = "active";
		</script>
</body>

</html>
		
		
		