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
    <title>详细信息</title>
</head>

<%@page import="com.gsb.BasicObject.MBG.SourcePerson,java.text.SimpleDateFormat" %>

<%
SourcePerson person = (SourcePerson)request.getAttribute("target");
SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

%>

<body>

	<jsp:include page="NavigationBar.jsp"></jsp:include>

    <div class="container-fluid">
        <p class="alert alert-info"><strong>详细信息</strong></p>
    </div>

    <div class="container-fluid">
        <div id="BaseInfo">
            <table class="table">
                <tr>
                    <th>姓名:</th>
                    <td><%=person.getName() %></td>
                    <th>性别:</th>
                    <td><%=person.getGender() %></td>
                    <th>籍贯:</th>
                    <td><%=person.getNativePlace()%></td>
                    <th>民族:</th>
                    <td><%=person.getNation() %></td>
                </tr>
                <tr>
                    <th>出生日期:</th>
                    <td><%=sdf.format(person.getBirthTime()) %></td>
                    <th>工资编号:</th>
                    <td><%=person.getSalaryNo() %></td>
                    <th>工资库:</th>
                    <td><%=person.getSlib().getSalaryVersion() %></td>
                    <th>所在分会:</th>
                    <td><%=person.getSociaty().getSociatyName() %></td>
                </tr>
                <tr>
                    <th>职级:</th>
                    <td><%=person.getFunc() %></td>
                    <th>职称:</th>
                    <td><%=person.getTitleLv() %></td>
                    <th>学历:</th>
                    <td><%=person.getEduBg() %></td>
                    <th>政治面貌:</th>
                    <td><%=person.getPoliticalStatus() %></td>
                </tr>
                <tr>
                    <th>离休情况:</th>
                    <td><%=person.getQuitOfficeType() %></td>
                    <th>兵役情况:</th>
                    <td><%=person.getConscriptio_situation() %></td>
                    <th>贫困情况:</th>
                    <td><%=person.getIsHelpNeeded() %></td>
                    <th>慰问情况:</th>
                    <td><%=person.getLatestSympathyYear() %></td>
                </tr>
            </table>
            </center>
        </div>
        <div>
            <table class="table">
                <tr>
                    <th class="info">工作时间</th>
                    <th class="info">离退时间</th>
                    <th class="info">工作单位</th>
                </tr>
                <tr>
                	<td><%=sdf.format(person.getJobStartTime()) %></td>
                	<td><%=sdf.format(person.getJobEndTime()) %></td>
                    <td><%=person.getDept().getDeptName() %></td>
                </tr>
            </table>
        </div>
        <div>
            <table class="table">
                <tr>
                    <th class="info">家庭成员</th>
                    <th class="info">姓名</th>
                    <th class="info">联系方式</th>
                </tr>
                <tr>
                    <td>配偶</td>
                    <td>李四</td>
                    <td>123456789</td>
                </tr>
            </table>
        </div>
        <div>
            <table class="table">
                <tr>
                    <th class="info">健康情况</th>
                </tr>
                <tr>
                    <td><%=person.getLivingSituation() %></td>
                </tr>
            </table>
        </div>
        <div>
            <table class="table">
                <tr>
                    <th class="info">现居住地</th>
                </tr>
                <tr>
                    <td><%=person.getAddress() %></td>
                </tr>
            </table>
        </div>
    </div>
    <hr />
    <div>
        <button type="button" class="btn btn-warning tool-btn"><a href="#">编辑</button>
        <button type="button" class="btn btn-primary tool-btn"><a href="HMMang.html">返回</button>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
