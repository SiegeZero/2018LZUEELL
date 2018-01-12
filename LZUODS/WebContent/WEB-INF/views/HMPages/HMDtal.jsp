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

<%@page import="com.gsb.BasicObject.MBG.SourcePerson" %>

<%
SourcePerson person = (SourcePerson)request.getAttribute("target");


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
                    <th>工资编号:</th>
                    <td><%=person.getSalaryNo() %></td>
                    <th>姓名:</th>
                    <td><%=person.getName() %></td>
                    <th>籍贯:</th>
                    <td><%=person.getNativePlace()%></td>
                    <th>工作单位:</th>
                    <td><%=person.getDept().getDeptName() %></td>
                </tr>
                <tr>
                    <th>性别:</th>
                    <td><%=person.getGender() %></td>
                    <th>工资库:</th>
                    <td><%=person.getSlib().getSalaryVersion() %></td>
                    <th>离休情况:</th>
                    <td><%=person.getQuitOfficeType() %></td>
                    <th>兵役情况:</th>
                    <td><%=person.getConscriptio_situation() %></td>
                </tr>
                <tr>
                    <th>所在分会:</th>
                    <td><%=person.getSociaty().getSociatyName() %></td>
                    <th>学历:</th>
                    <td><%=person.getEduBg() %></td>
                    <th>政治面貌:</th>
                    <td><%=person.getPoliticalStatus() %></td>
                    <th>民族:</th>
                    <td><%=person.getNation() %></td>
                </tr>
            </table>
            </center>
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
                <tr>
                    <td>长子</td>
                    <td>王五</td>
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
                    <td>行动不便，有子女照顾。</td>
                </tr>
            </table>
        </div>
        <div>
            <table class="table">
                <tr>
                    <th class="info">居住住址</th>
                    <th class="info">居住时间</th>
                </tr>
                <tr>
                    <td>兰州大学</td>
                    <td>1990-2000</td>
                </tr>
                <tr>
                    <td>XXX小区</td>
                    <td>2001-2015</td>
                </tr>
            </table>
        </div>
    </div>
    <hr />
    <div>
        <button type="button" class="btn btn-warning"><a href="#">编辑</button>
        <button type="button" class="btn btn-primary"><a href="#">返回</button>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
