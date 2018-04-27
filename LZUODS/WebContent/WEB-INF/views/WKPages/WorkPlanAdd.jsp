<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>工作计划添加</title>
	
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
						<div class="card">
							<div class="card-action"><h2><strong>添加工作计划</strong></h2></div>
							<div class="card-content">
								<form action="add_workplan" method="POST">
								<div class="row">
						        	<div class="input-field col s6">
						          		<input id="title" name="title" type="text" required>
						          		<label for="title">计划标题</label>
						        	</div>
							        <div class="input-field col s6">
							          	<input id="happen_time" name="happen_time" type="text" required>
							          	<label for="happen_time">计划时间</label>
							        </div>
						        </div>
						        <div class="row">
							        <div class="input-field col s12">
							          	<textarea id="textarea" name="content" class="materialize-textarea"></textarea>
							          	<label for="textarea">计划内容</label>
							        </div>
							     </div>
								<input name="planer_no" type="hidden" value='2' >
								<input name="plan_status" type="hidden" value='3' >
								<div>
									<center>
										<button type="reset" class="btn waves-effect waves-light" style="margin-right:20px">重置
										    <span class="glyphicon glyphicon-remove"></span>
										</button></a>
										<button type="submit" class="btn waves-effect waves-light" name="action">确认
											<span class="fa fa-check fa-fw"></span>
										</button>
									</center>
								</div>
								</form>
							</div>
							<div class="card-content">
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
    <!-- DatePicker -->
    <script>
	    $('.datepicker').pickadate({
	        selectMonths: true, // Creates a dropdown to control month
	        selectYears: 15 // Creates a dropdown of 15 years to control year
		});
    </script> 
    <!-- characterCounter -->
    <script>
    	$(document).ready(function() {
    		$('input#input_text, textarea#textarea1').characterCounter();
 		});
    </script>
	<script>
		document.getElementById("WorkPlans").className = "active"; 
	</script>

</body>

</html>