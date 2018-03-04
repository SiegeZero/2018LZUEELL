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
	List<Society> sociaties_list = (List<Society>) request.getAttribute("sociaties_list");
	
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
          for(int row_index = 0; sociaties_list != null && row_index < sociaties_list.size(); row_index++){
        	  Society s = sociaties_list.get(row_index);
          %>
          <tr>
            <th><%=row_index %></th>
            <td><%=s.getSocietyName() %></td>
          </tr>
           <%
            }
          	%>
        </tbody>
      </table>
	</div>
</body>
</html>