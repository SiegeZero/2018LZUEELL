<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-hans">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!--IE浏览器渲染方式-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--移动设备响应-->
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>更改确认</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
</head>

<%@ page import="java.util.List,com.gsb.BasicObject.MBG.SalaryLib,com.gsb.BasicObject.MBG.SourcePerson,java.text.SimpleDateFormat" %>
<%
List<String> sociaty_list =(List<String>) request.getAttribute("sociaties_list");
List<SalaryLib> slib_list =(List<SalaryLib>) request.getAttribute("slib_list");
SourcePerson person = (SourcePerson)request.getAttribute("target");
SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
SourcePerson new_person = (SourcePerson)request.getAttribute("new_person");
%>

<body>
	<div class="container-fluid">
		<form action="update_basic_info" method="post">
			<table class="table">
				<tr>
					<th class="info">所有条目</th>
					<th class="info">原始数据</th>
					<th class="info"></th>
					<th class="info">新的改动</th>
				</tr>
				<%
				if( !person.getName().equals( new_person.getName())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="姓名:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getName() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="name" type="text" class="form-control" value="<%=new_person.getName() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getGender().equals( new_person.getGender())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="性别:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getGender() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="gender" type="text" class="form-control" value="<%=new_person.getGender()%>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getNativePlace().equals( new_person.getNativePlace())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="籍贯:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getNativePlace()%>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="native_place" type="text" class="form-control" value="<%=new_person.getNativePlace() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getNation().equals( new_person.getNation())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="民族:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getNation() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="nation" type="text" class="form-control" value="<%=new_person.getNation() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getBirthTime().equals( new_person.getBirthTime())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="出生日期:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=sdf.format(person.getBirthTime()) %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="birth_date" type="text" class="form-control" value="<%=new_person.getBirthTime() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getSalaryNo().equals( new_person.getSalaryNo())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="工资编号:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getSalaryNo() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="salary_no" type="text" class="form-control" value="<%=new_person.getSalaryNo() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getSlib().getSalaryVersion().equals( new_person.getSlib().getSalaryVersion())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="工资库:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getSlib().getSalaryVersion() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="slary_lib" type="text" class="form-control" value="<%=new_person.getSlib().getSalaryVersion() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getSociaty().getSociatyName().equals( new_person.getSociaty().getSociatyName())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="所在分会:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getSociaty().getSociatyName() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="sociaty" type="text" class="form-control" value="<%=new_person.getSociaty().getSociatyName() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getFunc().equals( new_person.getFunc())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="职级:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getFunc() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="func" type="text" class="form-control" value="<%=new_person.getFunc() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getTitleLv().equals( new_person.getTitleLv())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="职称:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getTitleLv() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="title_lv" type="text" class="form-control" value="<%=new_person.getTitleLv() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getEduBg().equals( new_person.getEduBg())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="学历:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getEduBg() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="edu_bg" type="text" class="form-control" value="<%=new_person.getEduBg() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getPoliticalStatus().equals( new_person.getPoliticalStatus())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="政治面貌:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getPoliticalStatus() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="political_status" type="text" class="form-control" value="<%=new_person.getPoliticalStatus() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getQuitOfficeType().equals( new_person.getQuitOfficeType())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="离休情况:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getQuitOfficeType() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="quit_office_type" type="text" class="form-control" value="<%=new_person.getQuitOfficeType() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getConscriptionSituation().equals( new_person.getConscriptionSituation())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="兵役情况:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getConscriptionSituation() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="conscription_situation" type="text" class="form-control" value="<%=new_person.getConscriptionSituation() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getIsHelpNeeded().equals( new_person.getIsHelpNeeded())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="是否贫困:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getIsHelpNeeded() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="is_help_needed" type="text" class="form-control" value="<%=new_person.getIsHelpNeeded() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( person.getLatestSympathyYear()!=null && !person.getLatestSympathyYear().equals( new_person.getLatestSympathyYear())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="慰问情况:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getLatestSympathyYear() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="lastest_sympathy_year" type="text" class="form-control" value="<%=new_person.getLatestSympathyYear() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getTelephoneNum().equals( new_person.getTelephoneNum())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="联系方式:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getTelephoneNum() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="telephone_num" type="text" class="form-control" value="<%=new_person.getTelephoneNum() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getPhysicalSituation().equals( new_person.getPhysicalSituation())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="身体状况:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getPhysicalSituation() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="physical_situation" type="text" class="form-control" value="<%=new_person.getPhysicalSituation() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( person.getPensionModelNo()!=null && !person.getPensionModelNo().equals( new_person.getPensionModelNo())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="养老模式:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getName() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="pension_model_no" type="text" class="form-control" value="<%=new_person.getPensionModelNo() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( person.getStart_job()!=null && !person.getStart_job().equals( new_person.getStart_job())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="工作开始时间:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=sdf.format(person.getJobStartTime()) %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="start_time" type="text" class="form-control" value="<%=new_person.getStart_job() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( person.getEnd_job()!=null && !person.getEnd_job().equals( new_person.getEnd_job())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="工作结束时间:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=sdf.format(person.getJobEndTime()) %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="end_time" type="text" class="form-control" value="<%=new_person.getEnd_job() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getDept().getDeptName().equals( new_person.getDept().getDeptName())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="工作单位" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getDept().getDeptName() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="dept" type="text" class="form-control" value="<%=new_person.getDept().getDeptName() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getLivingSituation().equals( new_person.getLivingSituation())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="家庭情况:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getLivingSituation()%>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="living_situation" type="text" class="form-control" value="<%=new_person.getLivingSituation() %>" /></td>
	                </div>
				</tr>
				
				<%
				}
				if( !person.getAddress().equals( new_person.getAddress())) {
				%>
				<tr>
	                <div class="input-group input-group-sm">
	                	<td style="10%"><input type="text" class="form-control" value="居住住址:" readonly/></td>
	                </div>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input type="text" class="form-control" value="<%=person.getAddress() %>" readonly/></td>
	                </div>
					<td style="10%">→</td>
	                <div class="input-group input-group-sm">
	                	<td style="40%"><input name="address" type="text" class="form-control" value="<%=new_person.getAddress() %>" /></td>
	                </div>
				</tr>
				<%
					}
				%>
			</table>
		    <div>
		        <button type="submit" class="btn btn-primary tool-btn">保存</button>
		        <a href="HMDtal?id=<%=person.getSysNo()%>"><button type="button" class="btn btn-info tool-btn">返回</button></a>
		    </div>
		</form>
	</div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>