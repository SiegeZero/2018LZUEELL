<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>慰问管理</title>
	
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

<%@ page import="
	java.util.List,
	java.util.Map,
	com.gsb.BasicObject.MBGPOJO.SympathyAtv,
	com.gsb.BasicObject.Beans.SympathyWithName" %>
<%
	List<SympathyAtv> sympathy_atv_list = (List<SympathyAtv>)request.getAttribute("sympathy_atv_list");
	List<Map<SympathyAtv, List<SympathyWithName>>> sympathy_list = (List<Map<SympathyAtv, List<SympathyWithName>>>)request.getAttribute("sympathy_list");
%>

<body>
	<div id="wapper">
		<jsp:include page="../public/NavigationBar.jsp"></jsp:include>
		<div id="page-wapper" style="width:100%; position:absolute; margin-top:80px;">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<!--    Context Classes  -->
						<div class="card">
							<div class="card-action"><h2><strong>慰问情况</strong></h2></div>
							<div class="card-content">
							<%
							if(sympathy_atv_list != null && !sympathy_atv_list.isEmpty()){
								for( int i = 0;i<sympathy_atv_list.size();i++) {
									SympathyAtv atv = sympathy_atv_list.get(i);
									Map<SympathyAtv, List<SympathyWithName>> map = sympathy_list.get(i);
							%>
								<span><%=atv.getActivityNo() %></span>
								<span><%=atv.getSympathyTime() %></span>
								<span><%=atv.getActivityRemark() %></span>
								<hr />
								<%
									List<SympathyWithName> sym_list = map.get(sympathy_atv_list.get(i));
									if(  sym_list != null && !sym_list.isEmpty()) {
										for( SympathyWithName s:sym_list){
											
								%>
								<span><%=s.getSysNo() %></span>
								<span><%=s.getPerson_name() %></span>
								<span><%=s.getSympathyTime() %></span>
								<hr />
							<%
										}
									}
								}
							}
							%>
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
		document.getElementById("EVMang").className = "active";
	</script> 
    

</body>

</html>