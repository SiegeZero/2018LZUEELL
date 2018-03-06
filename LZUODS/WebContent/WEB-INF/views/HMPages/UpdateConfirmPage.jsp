<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>信息编辑</title>
	
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
	com.gsb.BasicObject.MBGPOJO.SalaryLib,
	com.gsb.BasicObject.Beans.SourcePerson,
	java.text.SimpleDateFormat" %>
<%
List<String> society_list =(List<String>) request.getAttribute("sociaties_list");
List<SalaryLib> slib_list =(List<SalaryLib>) request.getAttribute("slib_list");
SourcePerson person = (SourcePerson)request.getAttribute("target");
SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
SourcePerson new_person = (SourcePerson)request.getAttribute("new_person");
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
								<form action="update_basic_info" method="post">
									<input type="hidden" name="sys_no" value="<%=person.getSysNo() %>" />
									<table class="table">
										<tr>
											<th class="info" style="width:15%; text-align: center">改动条目</th>
											<th class="info" style="width:40%; text-align: center">改动之前</th>
											<th class="info" style="width:5%; text-align: center"></th>
											<th class="info" style="width:40%; text-align: center">改动之后</th>
										</tr>
										<%
										if( !person.getName().equals( new_person.getName())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="姓名:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getName() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="name" type="text" class="form-control" value="<%=new_person.getName() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
											
										%>
										
										<input type="hidden" name="name" value="<%=person.getName() %>" />	
										<%
										}
										if( !person.getGender().equals( new_person.getGender())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="性别:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getGender() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="gender" type="text" class="form-control" value="<%=new_person.getGender()%>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										
										<input type="hidden" name="gender" value="<%=person.getGender() %>" />	
										<%
										}
										if( !person.getNativePlace().equals( new_person.getNativePlace())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="籍贯:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getNativePlace()%>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="native_place" type="text" class="form-control" value="<%=new_person.getNativePlace() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
											
										%>
										<input type="hidden" name="native_place" value="<%=person.getNativePlace() %>" />	
										<%
										}
										if( !person.getNation().equals( new_person.getNation())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="民族:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getNation() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="nation" type="text" class="form-control" value="<%=new_person.getNation() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="nation" value="<%=person.getNation() %>" />	
										<%
										}
										if( person.getBirthTime() == null && new_person.getBirth() != null
												||!sdf.format(person.getBirthTime()).equals( new_person.getBirth())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="出生日期:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=sdf.format(person.getBirthTime()) %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="birth_date" type="text" class="form-control" value="<%=new_person.getBirth() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="birth_date" value="<%=sdf.format(person.getBirthTime()) %>" />	
										<%
										}
										if( person.getSalaryNo() == null && new_person.getSalaryNo() != null
												||!person.getSalaryNo().equals( new_person.getSalaryNo())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="工资编号:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getSalaryNo() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="salary_no" type="text" class="form-control" value="<%=new_person.getSalaryNo() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="salary_no" value="<%=person.getSalaryNo() %>" />		
										<%
										}
										if( person.getSlib().getSalaryVersion() == null &&  new_person.getSlib().getSalaryVersion() != null
												||!person.getSlib().getSalaryVersion().equals( new_person.getSlib().getSalaryVersion())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="工资库:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getSlib().getSalaryVersion() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="slary_lib" type="text" class="form-control" value="<%=new_person.getSlib().getSalaryVersion() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="slary_lib" value="<%=person.getSlib().getSalaryVersion() %>" />		
										<%
										}
										if( !person.getSociety().getSocietyName().equals( new_person.getSociety().getSocietyName())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="所在分会:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getSociety().getSocietyName() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="society" type="text" class="form-control" value="<%=new_person.getSociety().getSocietyName() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="society" value="<%=person.getSociety().getSocietyName() %>" />	
										<%
										}
										if( person.getFunc() == null && new_person.getFunc() != null 
												||!person.getFunc().equals( new_person.getFunc())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="职级:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getFunc() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="func" type="text" class="form-control" value="<%=new_person.getFunc() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="func" value="<%=person.getFunc() %>" />	
										<%
										}
										if( person.getTitleLv() == null && new_person.getTitleLv() != null 
												||!person.getTitleLv().equals( new_person.getTitleLv())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="职称:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getTitleLv() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="title_lv" type="text" class="form-control" value="<%=new_person.getTitleLv() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="title_lv" value="<%=person.getTitleLv() %>" />	
										<%
										}
										if(  person.getEduBg() == null && new_person.getEduBg() != null 
												||!person.getEduBg().equals( new_person.getEduBg())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="学历:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getEduBg() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="edu_bg" type="text" class="form-control" value="<%=new_person.getEduBg() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="edu_bg" value="<%=person.getEduBg() %>" />	
										<%
										}
										if( !person.getPoliticalStatus().equals( new_person.getPoliticalStatus())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="政治面貌:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getPoliticalStatus() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="political_status" type="text" class="form-control" value="<%=new_person.getPoliticalStatus() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="political_status" value="<%=person.getPoliticalStatus() %>" />	
										<%
										}
										if(  person.getQuitOfficeType() == null && new_person.getQuitOfficeType() != null 
												||!person.getQuitOfficeType().equals( new_person.getQuitOfficeType())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="离休情况:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getQuitOfficeType() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="quit_office_type" type="text" class="form-control" value="<%=new_person.getQuitOfficeType() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="quit_office_type" value="<%=person.getQuitOfficeType() %>" />	
										<%
										}
										if( !person.getConscriptionSituation().equals( new_person.getConscriptio_situation())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="兵役情况:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getConscriptionSituation() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="conscription_situation" type="text" class="form-control" value="<%=new_person.getConscriptio_situation() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="conscription_situation" value="<%=person.getConscriptionSituation() %>" />	
										<%
										}
										String tmp = person.getIsHelpNeeded()?"是":"否";
										if( !tmp.equals( new_person.getNeed_help())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="是否贫困:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=tmp %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="is_help_needed" type="text" class="form-control" value="<%=new_person.getNeed_help() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="is_help_needed" value="<%=person.getIsHelpNeeded() %>" />	
										<%
										}
										if( person.getLatestSympathyYear()!=null && !person.getLatestSympathyYear().equals( new_person.getLatestSympathyYear())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="慰问情况:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getLatestSympathyYear() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="lastest_sympathy_year" type="text" class="form-control" value="<%=new_person.getLatestSympathyYear() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="lastest_sympathy_year" value="<%=person.getLatestSympathyYear() %>" />	
										<%
										}
										if( !person.getTelephoneNum().equals( new_person.getTelephoneNum())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="联系方式:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getTelephoneNum() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="telephone_num" type="text" class="form-control" value="<%=new_person.getTelephoneNum() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="telephone_num" value="<%=person.getTelephoneNum() %>" />	
										<%
										}
										if( !person.getPhysicalSituation().equals( new_person.getPhysicalSituation())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="身体状况:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getPhysicalSituation() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="physical_situation" type="text" class="form-control" value="<%=new_person.getPhysicalSituation() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="physical_situation" value="<%=person.getPhysicalSituation() %>" />	
										<%
										}
										if( person.getPensionModelNo()!=null && !person.getPensionModelNo().equals( new_person.getPensionModelNo())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="养老模式:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getPensionModelNo() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="pension_model_no" type="text" class="form-control" value="<%=new_person.getPensionModelNo() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="pension_model_no" value="<%=person.getPensionModelNo() %>" />	
										<%
										}
										if( person.getJobStartTime()==null&&new_person.getStart_job()!=null
												||!sdf.format(person.getJobStartTime()).equals( new_person.getStart_job())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="工作开始时间:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=sdf.format(person.getJobStartTime()) %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="start_time" type="text" class="form-control" value="<%=new_person.getStart_job() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="start_time" value="<%=sdf.format(person.getJobStartTime()) %>" />	
										<%
										}
										if( person.getJobEndTime() == null && new_person.getEnd_job()!= null
												|| !sdf.format(person.getJobEndTime()).equals( new_person.getEnd_job())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="工作结束时间:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=sdf.format(person.getJobEndTime()) %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="end_time" type="text" class="form-control" value="<%=new_person.getEnd_job() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="end_time" value="<%=sdf.format(person.getJobEndTime()) %>" />	
										<%
										}
										if( !person.getDept().getDeptName().equals( new_person.getDept().getDeptName())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="工作单位" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getDept().getDeptName() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="dept" type="text" class="form-control" value="<%=new_person.getDept().getDeptName() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="dept" value="<%=person.getDept().getDeptName() %>" />	
										<%
										}
										if( !person.getLivingSituation().equals( new_person.getLivingSituation())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="家庭情况:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getLivingSituation()%>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="living_situation" type="text" class="form-control" value="<%=new_person.getLivingSituation() %>" /></td>
							                </div>
										</tr>
										
										<%
										} else{
										%>
										<input type="hidden" name="living_situation" value="<%=person.getLivingSituation() %>" />	
										<%
										}
										if( !person.getAddress().equals( new_person.getAddress())) {
										%>
										<tr>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="居住住址:" readonly/></td>
							                </div>
							                <div class="input-group input-group-sm">
							                	<td><input type="text" class="form-control" value="<%=person.getAddress() %>" readonly/></td>
							                </div>
											<td align="center"><span class="glyphicon glyphicon-arrow-right" style="line-height:34px; vertical-align:middle"></span></td>
							                <div class="input-group input-group-sm">
							                	<td><input name="address" type="text" class="form-control" value="<%=new_person.getAddress() %>" /></td>
							                </div>
										</tr>
										<%} else{
										%>
										<input type="hidden" name="address" value="<%=person.getAddress() %>" />	
										<%
										}
										%>
									</table>
								    <div>
									    <center>
									        <a href="HMDtal?id=<%=person.getSysNo()%>"><button type="button" class="btn waves-effect waves-light" style="margin-right:20px">返回
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
    

</body>

</html>