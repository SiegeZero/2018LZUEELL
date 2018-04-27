<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>详细信息</title>
	
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
	com.gsb.BasicObject.MBGPOJO.Society,
	com.gsb.BasicObject.MBGPOJO.SalaryLib,
	com.gsb.BasicObject.Beans.SourcePerson,
	java.text.SimpleDateFormat
	" %>
<%
List<Society> society_list =(List<Society>) request.getAttribute("societies_list");
List<SalaryLib> slib_list =(List<SalaryLib>) request.getAttribute("slib_list");
SourcePerson person = (SourcePerson)request.getAttribute("target");
SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
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
	
							<div class="card-action"><h2><strong>详细信息</strong></h2></div>
	
							<div class="card-content">
								<form action="UpdateConfirmPage" method="post" id="BaseInfo">
	        					<input type="hidden" name="id" value="<%=person.getSysNo() %>">
									<div class="table-responsive">
										<table class="table">
										    <tbody>
								                <tr>
								                    <th>姓名:</th>
								                    <div class="input-group input-group-sm">
								                        <td><input name="name" type="text" class="form-control" value="<%=person.getName() %>" /></td>
								                    </div>
								                    <th>性别:</th>
								                    <div class="input-group input-group-sm">
								                        <td><input name="gender" type="text" class="form-control" value="<%=person.getGender() %>" /></td>
								                    </div>
								                    <th>籍贯:</th>
								                    <div class="input-group input-group-sm">
								                        <td><input name="native_place" type="text" class="form-control" value="<%=person.getNativePlace()%>" /></td>
								                    </div>
								                    <th>民族:</th>
								                    <div class="input-group input-group-sm">
								                        <td><input name="nation" type="text" class="form-control" value="<%=person.getNation() %>" /></td>
								                    </div>
								                </tr>
								                <tr>
								                    <th>出生日期:</th>
								                    <div class="input-group input-group-sm">
								                        <td><input name="birth_date" type="text" class="form-control" value="<%=sdf.format(person.getBirthTime()) %>" /></td>
								                    </div>
								                    <th>工资编号:</th>
								                    <div class="input-group input-group-sm">
								                        <td><input name="salary_no" type="text" class="form-control" value="<%=person.getSalaryNo() %>" /></td>
								                    </div>
								                    <th>工资库:</th>
								                    <div class="input-group input-group-sm">
								                        <td><input name="slary_lib" type="text" class="form-control" value="<%=person.getSlib().getSalaryVersion() %>" /></td>
								                    </div>
								                    <th>所在分会:</th>
								                    <div class="input-group input-group-sm">
								                        <td><input name="society" type="text" class="form-control" value="<%=person.getSociety().getSocietyName() %>" /></td>
								                    </div>
								                </tr>
								                <tr>
								                	<th>职级：</th>
								                    <div  class="input-group input-group-sm">
								                        <td><input name="func" type="text" class="form-control" value="<%=person.getFunc() %>" /></td>
								                    </div>
								                	<th>职称：</th>
								                    <div  class="input-group input-group-sm">
								                        <td><input name="title_lv" type="text" class="form-control" value="<%=person.getTitleLv() %>" /></td>
								                    </div>
								                    <th>学历:</th>
								                    <div class="input-group input-group-sm">
								                        <td><input name="edu_bg" type="text" class="form-control" value="<%=person.getEduBg() %>" /></td>
								                    </div>
								                    <th>政治面貌:</th>
								                    <div  class="input-group input-group-sm">
								                        <td><input name="political_status" type="text" class="form-control" value="<%=person.getPoliticalStatus() %>" /></td>
								                    </div>
								                    </td>
								                </tr>
								                <tr>
								                    <th>离休情况:</th>
								                    <div  class="input-group input-group-sm">
								                        <td><input name="quit_office_type" type="text" class="form-control" value="<%=person.getQuitOfficeType() %>" /></td>
								                    </div>
								                    <th>兵役情况:</th>
								                    <div  class="input-group input-group-sm">
								                        <td><input name="conscription_situation" type="text" class="form-control" value="<%=person.getConscriptionSituation() %>" /></td>
								                    </div>
								                    <th>贫困情况：</th>
									                    <div class="input-group input-group-sm">
									                        <td><input name="is_help_needed"  type="text" class="form-control" value="<%=person.getIsHelpNeeded()?"是":"否" %>" /></td>
									                    </div>
								                    <th>慰问情况：</th>
									                    <div class="input-group input-group-sm">
									                        <td><input name="lastest_sympathy_year" type="text" class="form-control" value="<%=person.getLatestSympathyYear() %>" /></td>
									                    </div>
								                </tr>
								                <tr>
								                    <th>联系方式:</th>
								                    <div  class="input-group input-group-sm">
								                        <td><input name="telephone_num" type="text" class="form-control" value="<%=person.getTelephoneNum() %>" /></td>
								                    </div>
								                    <th>身体状况:</th>
									                    <div class="input-group input-group-sm">
									                        <td><input name="physical_situation"  type="text" class="form-control" value="<%=person.getPhysicalSituation() %>" /></td>
									                    </div>
								                    <th>养老模式:</th>
								                    <div  class="input-group input-group-sm">
								                        <td><input name="pension_model_no" type="text" class="form-control" value="" /></td>
								                    </div>
								                </tr>
											</tbody>
										</table>
										<table class="table">
										    <tbody>
										    	<tr class="info">
							                    <th>工作开始时间</th>
							                    <th>工作结束时间</th>
							                    <th>工作单位</th>
								                </tr>
								                <tr>
								                	<div class="input-group input-group-sm">
								                        <td><input name="start_time" type="text" class="form-control" value="<%=sdf.format(person.getJobStartTime()) %>" /></td>
								                    </div>
								                    <div class="input-group input-group-sm">
								                        <td><input name="end_time" type="text" class="form-control" value="<%=sdf.format(person.getJobEndTime()) %>" /></td>
								                    </div>
								                    <div class="input-group input-group-sm">
								                        <td><input name="dept" type="text" class="form-control" value="<%=person.getDept().getDeptName() %>"  /></td>
								                    </div>
								                </tr>
											</tbody>
										</table>
										<table class="table">
										    <tbody>
										    	<tr class="info">
						                    	<th>家庭情况</th>
								                </tr>
								                <tr>
								                    <div class="input-group input-group-sm">
								                        <td><input name="living_situation"  type="text" class="form-control" value="<%=person.getLivingSituation()%>" /></td>
								                    </div>
								                </tr>
											</tbody>
										</table><table class="table">
										    <tbody>
										    	<tr class="info">
							                    <th>居住住址</th>
								                </tr>
								                <tr>
								                    <div class="input-group input-group-sm">
								                        <td><input name="address" type="text" class="form-control" value="<%=person.getAddress() %>" /></td>
								                    </div>
							                	</tr>
											</tbody>
										</table>
									</div>
									<div>
									    <center>
									        <a href="HMMang"><button type="button" class="btn waves-effect waves-light" style="margin-right:20px">返回
									        	<span class="glyphicon glyphicon-remove"></span>
									        </button></a>
									    	<button type="submit" class="btn waves-effect waves-light" name="action">保存
									    		<span class="glyphicon glyphicon-floppy-save"></span>
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
