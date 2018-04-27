<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>工作管理</title>

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

<%@page import="java.util.List,com.gsb.BasicObject.MBGPOJO.WorkPlan,
java.util.List,com.gsb.BasicObject.MBGPOJO.Notification" %>
<%
	List<WorkPlan> workplan_list = (List<WorkPlan>) request.getAttribute("workplan_list");
	List<Notification> notify_list = (List<Notification>)request.getAttribute("notify_list");
%>

<body>
	<div id="wapper">
		<jsp:include page="../public/NavigationBar.jsp"></jsp:include>
		<div id="page-wapper" style="width: 100%; position: absolute; margin-top: 80px;">
			<div id="page-inner">
						<div class="card">
							<div class="card-content">
								<ul class="tabs tab-demo tabs-fixed-width z-depth-1">
						        	<li class="tab" style="background:#f8f8f8"><a href="#WorkPlansTab"><strong>工作计划</strong></a></li>
						        	<li class="tab" style="background:#f8f8f8"><a href="#NotificationsTab"><strong>通知列表</strong></a></li>
						    	</ul>
						    	<%-- <div id="WorkPlansTab">
						    	<%
								if(workplan_list != null && !workplan_list.isEmpty()) {
									for(WorkPlan p : workplan_list) { 
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
									</ul>
						    	</div> --%>
						    	<div id="Notifications" class="card">
						    		<ul class="collapsible" data-collapsible="expandable">
								    <%
									if( notify_list != null && !notify_list.isEmpty()) {
										for( Notification n: notify_list) { 
									%>
									    <li>
									      <div class="card-title collapsible-header" style="font-size: 18px"><strong><%=n.getTitle()%></strong></div>
									      <div class="collapsible-body">
										  <p><span style="color:green">计划人Id：<%=n.getPublisherNo() %></br>计划ID：<%=n.getNotificationNo() %></span></p>
										  <hr></hr>
										  <p><%=new String(n.getNotificationContent()) %></p>
										  <hr></hr>
										  <p><span class="card-title activator grey-text text-darken-5" style="font-size: 14px">创建时间:<%=n.getPublishTime() %></span></p>
									      </div>
									    </li>
								    <%
										}
									}
									%>
									</ul>
						    	</div>
						    	<div class="fixed-action-btn vertical">
								    <a class="btn-floating btn-large red">
								      <i class="large material-icons">add</i>
								    </a>
								    <ul>
								      <li><a class="btn-floating green tooltipped" href="../WKM/WorkPlalnAdd" data-position="left" data-delay="50" data-tooltip="添加计划"><i class="material-icons">subject</i></a></li>
								      <li><a class="btn-floating red tooltipped" href="../WKM/NotificationAdd" data-position="left" data-delay="50" data-tooltip="发布通知"><i class="material-icons">chat_bubble_outline</i></a></li>
								    </ul>
							  	</div>
							</div>
						</div>
						<!--  end  Context Classes  -->
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
			$(document).ready(function(){
				$('.collapsible').collapsible();
			});
			
			document.getElementById("WorkPlans").className = "active";
			//tab
			$(document).ready(function(){
			    $('ul.tabs').tabs();
			});
			
			$(document).ready(function() {
				$('.carousel').carousel();
			})
			//tippop
			$(document).ready(function(){
			    $('.tooltipped').tooltip({delay: 50});
			});
		</script>
</body>

</html>