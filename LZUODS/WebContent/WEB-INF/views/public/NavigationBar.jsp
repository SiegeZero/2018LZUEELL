<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.gsb.BasicObject.MBGPOJO.Staff" %>
<%

Staff login_staff = (Staff)request.getSession().getAttribute("login_staff");

%>
<nav class="navbar navbar-default top-navbar" role="navigation">
	<div class="navbar-header">
		<a class="navbar-brand waves-effect waves-dark" href="../HMM/Home"><i class="large material-icons">track_changes</i> <strong>LZUODS</strong></a>
	</div>

	<ul class="nav navbar-top-links navbar-right">
		<li><a class="waves-effect waves-dark active" href="../HMM/Home"><i class="fa fa-home fa-fw"></i> <strong>首页</strong></a></li>
		<li><a class="waves-effect waves-dark" href="../HMM/HMMang"><i class="fa fa-users fa-fw"></i> <strong>人员管理</strong></a></li>
		<li><a class="waves-effect waves-dark" href="../SYM/SocietyMang"><i class="fa fa-flag fa-fw"></i> <strong>分会管理</strong></a></li>
		<li><a class="waves-effect waves-dark" href="../HMM/PTMang"><i class="fa fa-tasks fa-fw"></i> <strong>党建管理</strong></a></li>
		<li><a class="waves-effect waves-dark" href="../HMM/EVMang" style="margin-right:20px"><i class="fa fa-calendar fa-fw"></i> <strong>工作管理</strong></a></li>
	</ul>
</nav>