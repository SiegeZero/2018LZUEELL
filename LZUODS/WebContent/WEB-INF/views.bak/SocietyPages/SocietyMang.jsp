<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<! doctype html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分会管理</title>
</head>


<%@page import="java.util.List
	,com.gsb.BasicObject.MBGPOJO.SourcePerson
	,com.gsb.BasicObject.MBGPOJO.Society"%>
<%
	List<Society> societies_list = (List<Society>) request.getAttribute("societies_list");
	
%>

<body>

	<jsp:include page="../public/NavigationBar.jsp"></jsp:include>
	<div class="panel panel-default">
		<div class="panel-heading">分会列表</div>
		<div class="panel-body">
			<p>DWadfekflIekmf</p>
		</div>

		<table class="table">
        <thead>
          <tr>
            <th style="width:10%">#</th>
            <th>分会名称</th>
            <th style="width:25%">分会负责人</th>
            <th style="width:25%">分会人数</th>
          </tr>
        </thead>
        <tbody>
          <%
          for(int row_index = 0; societies_list != null && row_index < societies_list.size(); row_index++){
        	  Society s = societies_list.get(row_index);
          %>
          <tr>
            <td><%=row_index %></td>
            <td><%=s.getSocietyName() %></td>
            <td></td>
            <td></td>
          </tr>
          <%
            }
          %>
        </tbody>
      </table>
	</div>
</body>
</html>