<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page isELIgnored ="false" %>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>登录</title>
	
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
		<jsp:include page="../public/NavigationBar.jsp"></jsp:include>
		<div id="page-wapper" style="width:100%; position:absolute; margin-top:80px;">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<!--    Context Classes  -->
						<div class="card" style="width:500px; margin-left:auto; margin-right:auto;">
							<div class="card-action">
							<div class="card-content">
								<form action="ahead" method="POST">
								<div>
								<div class="row col s12">
							      	<div class="row">
								        <div class="input-field">
								        	<i class="material-icons prefix" style="line-height:40px; vertical-align:middle">perm_identity</i>
								          <input id="account" name="account" type="text" class="validate">
								          <label for="account">用户名</label>
								        </div>
							        </div>
							      	<div class="row">
							        	<div class="input-field">
							        		<i class="material-icons prefix" style="line-height:40px; vertical-align:middle">vpn_key</i>
								          	<input id="passwd" name="passwd" type="password" class="validate">
								          	<label for="passwd">密码</label>
							        	</div>
							      	</div>
									<input type="hidden" name="target_addr" value="<%=request.getAttribute("last_addr")%>">
									<input type="hidden" name="login_status" value="<%=request.getAttribute("login_status")%>">
							 	</div>
							      	<div class="row">
										<center>
									        <button type="reset" class="btn waves-effect waves-light" style="margin-right:20px">重置
									        	<span class="glyphicon glyphicon-remove"></span>
									        </button></a>
									    	<button type="submit" class="btn waves-effect waves-light">登录
									    		<span class="fa fa-check fa-fw"></span>
										  	</button>
									    </center>
							      	</div>
							    </div>
								</form>
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