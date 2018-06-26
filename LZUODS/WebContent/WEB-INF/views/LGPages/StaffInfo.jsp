<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page isELIgnored ="false" %>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>职工管理</title>
	
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

<body>
	<div id="wapper">
		<div id="page-wapper" style="width:100%; position:absolute; margin-top:80px;">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<!--    Context Classes  -->
						<div class="card" style="width:500px; margin-left:auto; margin-right:auto; background:rgba(255,255,255,1)">
							<div class="card-action" >
								<div class="row">
									<div class="col s12">
										<table class="centered">
											<thead>
												<tr>
													<th>用户名</th>
													<th>密码</th>
													<th>姓名</th>
													<th>性别</th>
													<th>电话</th>
												</tr>
											</thead>
											<tbody>
												<%
												for(int tr_index = 0; tr_index < 10; tr_index++){
												%>
												<tr>
													<td>admin</td>
													<td>123456</td>
													<td>admin</td>
													<td>男</td>
													<td>1234567</td>
												</tr>
												<%} %>
											</tbody>
										</table>
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
    

</body>

</html>