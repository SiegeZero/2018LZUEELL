<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<! doctype html>
<html>

<head>
	<meta charset="utf-8">
	<!--编码格式UTF-8-->
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<!--IE浏览器渲染方式-->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!--移动设备响应-->
	<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="../css/style.css">
<title>导航栏</title>
</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#navbar-menu" aria-expanded="false"
				aria-controls="navbar-menu">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a href="#" class="navbar-brand"><strong>LZUODS</strong>.net</a>
		</div>
		<div class="collapse navbar-collapse" id="navbar-menu">
			<ul class="nav navbar-nav">
				<li><a href="../HMM/Home">首页</a></li>
				<li><a href="../HMM/HMMang">人员管理</a></li>
				<li><a href="../SYM/SocietyMang">分会管理</a></li>
				<li><a href="../HMM/PTMang">党建管理</a></li>
				<li><a href="../HMM/EVMang">活动管理</a></li>
			</ul>
			<!-- <div class="profile navbar-right">
				<p class="navbar-text">
					欢迎回来, <a href="#" class="navbar-link"></a>
				</p>
			</div> -->
		</div>
	</div>
	</nav>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
