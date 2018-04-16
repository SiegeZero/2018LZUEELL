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
		<li id="Home"><a class="waves-effect waves-dark active" href="../HMM/Home"><i class="fa fa-home fa-fw"></i> <strong>首页</strong></a></li>
		<li id="HMMang"><a class="waves-effect waves-dark" href="../HMM/HMMang"><i class="fa fa-users fa-fw"></i> <strong>人员管理</strong></a></li>
		<li id="SocietyMang"><a class="waves-effect waves-dark" href="../SYM/SocietyMang"><i class="fa fa-flag fa-fw"></i> <strong>分会管理</strong></a></li>
		<li id="EVMang"><a class="waves-effect waves-dark" href="../HMM/EVMang"><i class="fa fa-tasks fa-fw"></i> <strong>活动管理</strong></a></li>
		<li id="WorkPlans"><a class="waves-effect waves-dark" href="../WKM/WorkPlans"><i class="fa fa-calendar fa-fw"></i> <strong>工作管理</strong></a></li>
		<li><a class="dropdown-button waves-effect waves-dark" href="#" data-activates="userdropdown" style="margin-right:20px"><i class="fa fa-user fa-fw"></i> <strong>XXX</strong><i class="material-icons right">arrow_drop_down</i></a></li>
	</ul>
</nav>
		<!-- Dropdown Structure -->
		<ul id="userdropdown" class="dropdown-content">
			<li><a href="#"><i class="fa fa-user fa-fw"></i>个人资料</a>
			</li>
			<li><a href="../LGM/Login"><i class="fa fa-sign-out fa-fw"></i>登出</a>
			</li>
		</ul>