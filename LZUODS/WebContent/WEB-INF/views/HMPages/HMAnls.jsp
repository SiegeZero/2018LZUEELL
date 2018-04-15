<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>统计分析</title>
	
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

<%@page import ="java.io.File,java.util.List,java.util.ArrayList" %>
<%
String[] allamount_attrs = (String[])request.getAttribute("allamount_attrs");
String[] party_attrs = (String[])request.getAttribute("party_attrs");
List<String[]> details = new ArrayList<>();
if( allamount_attrs != null)
	details.add( allamount_attrs);
if( party_attrs != null)
	details.add( party_attrs);
%>

<body>
	<div id="wrapper">
		<jsp:include page="../public/NavigationBarHuman.jsp"></jsp:include>
		<jsp:include page="../public/SideBarHuman.jsp"></jsp:include>
		<div id="page-wrapper">
			<div class="header">
				<h2 class="page-header">
					<strong>数据统计图表</strong>
				</h2>
			</div>
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<!-- Advanced Tables -->
						<div class="card">
							<div class="card-content">
								<div class="row">
									<div class="col-xs-12 col-sm-6 col-md-4">
										<div class="card horizontal cardIcon waves-effect waves-dark">
											<div class="card-image orange">
												<i class="fa fa-users fa-fw"></i>
											</div>
											<div class="card-stacked orange">
												<div class="card-content white-text">
													<h4>离退休人员总人数：</h4>
												</div>
												<div class="card-action white-text">
													<strong><%= request.getAttribute(allamount_attrs[0]) %>人</strong>
												</div>
											</div>
										</div>
									</div>
									<div class="col-xs-12 col-sm-6 col-md-4">
										<div class="card horizontal cardIcon waves-effect waves-dark">
											<div class="card-image blue">
												<i class="fa fa-heart fa-fw"></i>
											</div>
											<div class="card-stacked blue">
												<div class="card-content white-text">
													<h4>小于100岁的退休人员人数：</h4>
												</div>
												<div class="card-action white-text">
													<strong><%= request.getAttribute("lessthan100") %>人</strong>
												</div>
											</div>
										</div>
									</div>
									<div class="col-xs-12 col-sm-6 col-md-4">
										<div class="card horizontal cardIcon waves-effect waves-dark">
											<div class="card-image green">
												<i class="fa fa-star fa-fw"></i>
											</div>
											<div class="card-stacked green">
												<div class="card-content white-text">
													<h4>党员总人数：</h4>
												</div>
												<div class="card-action white-text">
													<strong><%= request.getAttribute(party_attrs[0]) %>人</strong>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12 col-sm-6 col-md-3">
										<div class="card-panel text-center">
											<h4>男性人数</h4>
											<div class="easypiechart" id="easypiechart-blue" data-percent="<%= (long)request.getAttribute(allamount_attrs[2])*100/(long)request.getAttribute(allamount_attrs[0]) %>">
												<span class="percent"><%= request.getAttribute(allamount_attrs[2]) %></span>
											</div>
										</div>
									</div>
									<div class="col-xs-12 col-sm-6 col-md-3">
										<div class="card-panel text-center">
											<h4>女性人数</h4>
											<div class="easypiechart" id="easypiechart-red" data-percent="<%= (long)request.getAttribute(allamount_attrs[1])*100/(long)request.getAttribute(allamount_attrs[0]) %>">
												<span class="percent"><%= request.getAttribute(allamount_attrs[1]) %></span>
											</div>
										</div>
									</div>
									<div class="col-xs-12 col-sm-6 col-md-3">
										<div class="card-panel text-center">
											<h4>男性党员人数</h4>
											<div class="easypiechart" id="easypiechart-teal" data-percent="<%= (long)request.getAttribute(party_attrs[1])*100/(long)request.getAttribute(party_attrs[0]) %>">
												<span class="percent"><%= request.getAttribute(party_attrs[1]) %></span>
											</div>
										</div>
									</div>
									<div class="col-xs-12 col-sm-6 col-md-3">
										<div class="card-panel text-center">
											<h4>女性党员人数</h4>
											<div class="easypiechart" id="easypiechart-orange" data-percent="<%= (long)request.getAttribute(party_attrs[2])*100/(long)request.getAttribute(party_attrs[0]) %>">
												<span class="percent"><%= request.getAttribute(party_attrs[2]) %></span>
											</div>
										</div>
									</div>
								</div>
							</div>
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
	<script>
		document.getElementById("Anls").className = "active-menu";
	</script>
    

</body>

</html>