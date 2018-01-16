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
    <title>新增人员</title>
</head>
<%@ page import="java.util.List,com.gsb.BasicObject.MBG.SalaryLib,com.gsb.BasicObject.MBG.SourcePerson,java.text.SimpleDateFormat" %>
<%
List<String> sociaty_list =(List<String>) request.getAttribute("sociaties_list");
List<SalaryLib> slib_list =(List<SalaryLib>) request.getAttribute("slib_list");
SourcePerson person = (SourcePerson)request.getAttribute("target");
SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
%>
<body>

	<jsp:include page="NavigationBar.jsp"></jsp:include>
	
    <div class="container-fluid">
        <p class="alert alert-info"><strong>新增人员</strong></p>
    </div>

    <div class="container-fluid">
        <form action="UpdateConfirmPage" method="post" id="BaseInfo">
        <input type="hidden" name="id" value="<%=person.getSysNo() %>">
            <table class="table">
                <tr>
                    <th>姓名:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="name" type="text" class="form-control" value="<%=person.getName() %>" placeholder="姓名" /></td>
                    </div>
                    <th>性别:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="gender" type="text" class="form-control" value="<%=person.getGender() %>" placeholder="性别" /></td>
                    </div>
                    <th>籍贯:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="native_place" type="text" class="form-control" value="<%=person.getNativePlace()%>" placeholder="籍贯" /></td>
                    </div>
                    <th>民族:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="nation" type="text" class="form-control" value="<%=person.getNation() %>" placeholder="民族" /></td>
                    </div>
                </tr>
                <tr>
                    <th>出生日期:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="birth_date" type="text" class="form-control" value="<%=sdf.format(person.getBirthTime()) %>" placeholder="出生日期" /></td>
                    </div>
                    <th>工资编号:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="salary_no" type="text" class="form-control" value="<%=person.getSalaryNo() %>" placeholder="工资编号" /></td>
                    </div>
                    <th>工资库:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="slary_lib" type="text" class="form-control" value="<%=person.getSlib().getSalaryVersion() %>" placeholder="工资库" /></td>
                    </div>
                    <th>所在分会:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="sociaty" type="text" class="form-control" value="<%=person.getSociaty().getSociatyName() %>" placeholder="所在分会" /></td>
                    </div>
                </tr>
                <tr>
                	<th>职级：</th>
                    <div  class="input-group input-group-sm">
                        <td><input name="func" type="text" class="form-control" value="<%=person.getFunc() %>" placeholder="职级" /></td>
                    </div>
                	<th>职称：</th>
                    <div  class="input-group input-group-sm">
                        <td><input name="title_lv" type="text" class="form-control" value="<%=person.getTitleLv() %>" placeholder="职称" /></td>
                    </div>
                    <th>学历:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="edu_bg" type="text" class="form-control" value="<%=person.getEduBg() %>" placeholder="学历" /></td>
                    </div>
                    <th>政治面貌:</th>
                    <div  class="input-group input-group-sm">
                        <td><input name="political_status" type="text" class="form-control" value="<%=person.getPoliticalStatus() %>" placeholder="政治面貌" /></td>
                    </div>
                    </td>
                </tr>
                <tr>
                    <th>离休情况:</th>
                    <div  class="input-group input-group-sm">
                        <td><input name="quit_office_type" type="text" class="form-control" value="<%=person.getQuitOfficeType() %>" placeholder="离休情况" /></td>
                    </div>
                    <th>兵役情况:</th>
                    <div  class="input-group input-group-sm">
                        <td><input name="conscription_situation" type="text" class="form-control" value="<%=person.getConscriptionSituation() %>" placeholder="兵役情况" /></td>
                    </div>
                    <th>贫困情况：</th>
	                    <div class="input-group input-group-sm">
	                        <td><input name="is_help_needed"  type="text" class="form-control" value="<%=person.getIsHelpNeeded() %>" placeholder="是否贫困" /></td>
	                    </div>
                    <th>慰问情况：</th>
	                    <div class="input-group input-group-sm">
	                        <td><input name="lastest_sympathy_year" type="text" class="form-control" value="<%=person.getLatestSympathyYear() %>" placeholder="最近慰问年份" /></td>
	                    </div>
                </tr>
                <tr>
                    <th>联系方式:</th>
                    <div  class="input-group input-group-sm">
                        <td><input name="telephone_num" type="text" class="form-control" value="<%=person.getTelephoneNum() %>" placeholder="联系方式" /></td>
                    </div>
                    <th>身体状况:</th>
	                    <div class="input-group input-group-sm">
	                        <td><input name="physical_situation"  type="text" class="form-control" value="<%=person.getPhysicalSituation() %>" placeholder="身体状况" /></td>
	                    </div>
                    <th>养老模式:</th>
                    <div  class="input-group input-group-sm">
                        <td><input name="pension_model_no" type="text" class="form-control" value="" placeholder="养老模式" /></td>
                    </div>
                </tr>
            </table>
            </center>
        </div>
        <div>
            <table class="table">
                <tr class="info">
                    <th>工作开始时间</th>
                    <th>工作结束时间</th>
                    <th>工作单位</th>
                </tr>
                <tr>
                	<div class="input-group input-group-sm">
                        <td><input name="start_time" type="text" class="form-control" value="<%=sdf.format(person.getJobStartTime()) %>" placeholder="起日期" /></td>
                    </div>
                    <div class="input-group input-group-sm">
                        <td><input name="end_time" type="text" class="form-control" value="<%=sdf.format(person.getJobEndTime()) %>" placeholder="止日期" /></td>
                    </div>
                    <div class="input-group input-group-sm">
                        <td><input name="dept" type="text" class="form-control" value="<%=person.getDept().getDeptName() %>"  placeholder="工作单位" /></td>
                    </div>
                </tr>
            </table>
        </div>
        <div>
            <table class="table">
                <tr class="info">
                    <th>家庭情况</th>
                </tr>
                <tr>
                    <div class="input-group input-group-sm">
                        <td><input name="living_situation"  type="text" class="form-control" value="<%=person.getLivingSituation()%>" placeholder="家庭情况" /></td>
                    </div>
                </tr>
            </table>
        </div>
        <div>
            <table class="table">
                <tr class="info">
                    <th>居住住址</th>
                </tr>
                <tr>
                    <div class="input-group input-group-sm">
                        <td><input name="address" type="text" class="form-control" value="<%=person.getAddress() %>" placeholder="居住地住" /></td>
                    </div>
                </tr>
            </table>
		    <div>
		        <button type="submit" class="btn btn-primary tool-btn">保存</button>
		        <a href="HMMang"><button type="button" class="btn btn-info tool-btn">返回</button></a>
		    </div>
        </form>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
