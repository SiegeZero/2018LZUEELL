<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
	
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
    <title>修改确认</title>
</head>

<%@ page
	import="java.util.List,
		java.util.ArrayList,
		com.gsb.BasicObject.MBGPOJO.Society,
		java.util.Map,
		java.util.HashMap"%>
<%
int quit_office_type_size=2,conscription_situation_conditions_size=0;

String gender_str  = request.getParameter("gender");
String[] quit_office_types = request.getParameterValues("quit_office_type");
String name_str = request.getParameter("name_condition");
String func_str = request.getParameter("func_condition");
String title_lv_str = request.getParameter("title_lv_condition");
String[] age_range = request.getParameterValues("age");
String[] societies = request.getParameterValues("society");
String[] nations = request.getParameterValues("nations");
String[] cs_str = request.getParameterValues("conscription_situation");
String[] political_str = request.getParameterValues("political_status");
String physical_str = request.getParameter("physical_situation");
String[] edu_bg = request.getParameterValues("edu_bg");
String is_help_needed = request.getParameter("is_help_needed");
String latest_sympathy_year = request.getParameter("latest_sympathy_year");
Map<Integer, String> societies_map = new HashMap<>();
List<Society> societies_list = (List<Society>) request.getAttribute("societies_list");
for( Society s:societies_list) {
	societies_map.put( s.getSocietyNo(),s.getSocietyName());
}
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
							<div class="card-action"><h2><strong>条件确认</strong></h2></div>
							<div class="card-content">
								<form action="HMMang" method="post">
								<%
								if( name_str != null && !name_str.equals("")) {
								%>
									<div class="container-fluid">
										<strong>选择的姓名包含：</strong> <input type="text" class="form-control"
											name="name_condition" value="<%=name_str %>" readonly />
									</div>
									<%
									}
									if( func_str != null && !func_str.equals("")) {
									%>
									<div class="container-fluid">
										<strong>选择的职务包含：</strong> <input type="text" class="form-control"
											name="func_condition" value="<%=func_str %>" readonly />
									</div>
									<%
									}
									if( title_lv_str != null && !title_lv_str.equals("")) {
									%>
									<div class="container-fluid">
										<strong>选择的职级包含：</strong> <input type="text" class="form-control"
											name="title_lv_condition" value="<%=title_lv_str %>" readonly />
									</div>
									<%
									}
									if(gender_str!=null && !gender_str.equals("")) {
									%>
									<div class="container-fluid">
										<strong>选择的性别包含：</strong>
										<input name="gender" type="text"
											class="form-control"
											value="<%=gender_str %>"
											readonly />
									</div>
									<%
									}
									if(is_help_needed!=null && !is_help_needed.equals("")) {
									%>
									<div class="container-fluid">
										<strong>选择的贫困情况包含：</strong>
										<input name="is_help_needed" type="text"
											class="form-control"
											value="<%=is_help_needed %>"
											readonly />
									</div>
									<%
									}
									if(latest_sympathy_year!=null && !latest_sympathy_year.equals("")) {
									%>
									<div class="container-fluid">
										<strong>选择的慰问情况包含：</strong>
										<input name="latest_sympathy_year" type="text"
											class="form-control"
											value="<%=latest_sympathy_year %>"
											readonly />
									</div>
									<%
									}
									if( quit_office_types!=null && quit_office_types.length!=0) {
									%>
									
									<div class="container-fluid">
										<strong>选择的离退休情况包含：</strong>
										<%for(int index=0;index< quit_office_types.length;index++){ %>
										<input type="text" class="form-control" name="quit_office_type"
											value="<%=quit_office_types[index]%>" readonly />
										<%} %>
									</div>
									<%
									}
					
									if(age_range!=null && age_range.length == 2 
											&& !age_range[0].equals("") && !age_range[1].equals("")) {
									%>
									<div class="container-fluid">
										<strong>选择的年龄范围是：</strong> <input name="age_range" type="text"
											class="form-control" value="<%=age_range[0]+"-"+age_range[1]%>" readonly /> <input
											name="deadline" type="text" class="form-control"
											placeholder="如果需要精确到某一天，请在此输入一个具体的截止日期，日期输入格式为yyyymmdd">
									</div>
									<%
									}
									if(societies!=null&&societies.length!=0) {
									%>
									<div class="container-fluid">
										<strong>选择的分会包含：</strong>
										<%
										for( int i=0;i<societies.length;i++){
										%>
										<input name="society" id="society<%=i %>" type="hidden"
											class="form-control"
											value="<%=societies[i] %>"
											readonly />
										<input type="text" class="form-control" 
											value="<%=societies_map.get( Integer.parseInt(societies[i]))%>" 
											readonly />
										<%
										}
										%>
									</div>
									<%
									}
									if(physical_str!=null && !physical_str.equals("")) {
									%>
									<div class="container-fluid">
										<strong>选择的在世情况包含：</strong>
										<input name="physical_situation" type="text"
											class="form-control"
											value="<%=physical_str %>"
											readonly />
									</div>
									<%
									}
									if(edu_bg!=null&&edu_bg.length!=0) {
									%>
									<div class="container-fluid">
										<strong>选择的学历包含：</strong>
										<%
										for( int i=0;i<edu_bg.length;i++){
										%>
										<input type="text" class="form-control" 
											name="edu_bg" id="edu_bg<%=i %>"
											value="<%=edu_bg[i]%>" 
											readonly />
										<%
										}
										%>
									</div>
									<%
									}
									if(cs_str!=null&&cs_str.length!=0) {
									%>
									<div class="container-fluid">
										<strong>选择的兵役情况包含：</strong>
										<%
										for( int i=0;i<cs_str.length;i++){
										%>
										<input type="text" class="form-control" 
											name="conscription_situation" id="conscription_situation<%=i %>"
											value="<%=cs_str[i].equals("无数据")?"":cs_str[i]%>"
											readonly />
										<%
										}
										%>
									</div>
									<%
									}
									if(political_str!=null&&political_str.length!=0) {
									%>
									<div class="container-fluid">
										<strong>选择的政治面貌包含：</strong>
										<%
										for( int i=0;i<political_str.length;i++){
										%>
										<input type="text" class="form-control"
											name="political_status" id="political_status<%=i %>"
											value="<%=political_str[i].equals("无数据")?"":political_str[i]%>"
											readonly />
										<%
										}
										%>
									</div>
									<%
									}
									if(nations!=null&&nations.length!=0) {
									%>
									<div class="container-fluid">
										<strong>选择的民族包含：</strong>
										<%
										for( int i=0;i<nations.length;i++){
										%>
										<input name="nations" id="nation<%=i %>" type="text"
											class="form-control" value="<%=nations[i]%>" readonly />
										<%
										}
										%>
									</div>
									<%
									}
									
									%>
									<div>
										<center>
									        <button type="button" class="btn waves-effect waves-light" onclick="javascript:history.back(-1);" style="margin-right:20px">返回修改
									        	<span class="glyphicon glyphicon-remove"></span>
									        </button></a>
									    	<button type="submit" class="btn waves-effect waves-light" name="action">确认查询
									    		<span class="fa fa-check fa-fw"></span>
										  	</button>
									    </center>
									</div>
								</form>
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
		document.getElementById("HMMang").className = "active"; 
	</script>
    
</body>
</html>