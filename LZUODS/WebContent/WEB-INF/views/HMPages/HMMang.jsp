<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>

<body>

	<jsp:include page="NavigationBar.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2 navbar-inverse navbar-collapse" style="height: 100%">
				<ul class="nav">
					<li>
						<a href="#">人员管理&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="caret"></span></a>
					</li>
					<ul class="nav">
						<li><a href="#"><span class="glyphicon glyphicon-user"></span>&nbsp;人员信息</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-yen"></span>&nbsp;工资管理</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-signal"></span>&nbsp;统计分析</a></li>
						<li><a href="#"><span class="glyphicon glyphicon-tags"></span>&nbsp;其他功能</a></li>
					</ul>
				</ul>
			</div>
			<div class="col-md-10">
				<form action="" method="post" class="navbar-form">
					<div>
						<center>
							<input type="text" placeholder="输入姓名或者工资号" class="form-control" />
							<button type="submit" action="#" method="post">
                        <span class="glyphicon glyphicon-search"></span>
                        </button>
						</center>
						<table class="table">
							<tr>
								<th>基本：</th>
								<!--<td id="sex" style="position: relative">性别
                                <div>
                                    <span><input type="checkbox" onClick="select_attribute"/>男</span>
                                    <span><input type="checkbox" onClick="select_attribute"/>女</span>
                                </div>
                            </td>-->
								<td>离休情况</td>
								<td>兵役情况</td>
								<td>政治面貌</td>
								<td>在世情况</td>
								<td>贫困状况</td>
								<td>慰问情况</td>
								<td>学历</td>
								<td>更多条件 ↓</td>
							</tr>
							<!--<tr style="height: 30px"></tr>-->
							<tr>
								<th>年龄：</th>
								<td><input type="checkbox" onClick="select_attribute" /> 60 - 70</td>
								<td><input type="checkbox" onClick="select_attribute" /> 70 - 80</td>
								<td><input type="checkbox" onClick="select_attribute" /> 80 - 90</td>
								<td><input type="checkbox" onClick="select_attribute" /> 90 - 100</td>
								<td><input type="checkbox" onClick="select_attribute" /> 100 +</td>
							</tr>
							<tr>
								<th>职级：</th>
								<td><input type="checkbox" onClick="select_attribute" /> 副科
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 正科
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 科长
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 副地级
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 地级
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 副厅级
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 正厅级
								</td>
								<td>更多+</td>
							</tr>
							<tr>
								<th>职称：</th>
								<td><input type="checkbox" onClick="select_attribute" /> 工人
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 技师
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 中级
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 高级
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 副高
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 正高
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 实验师
								</td>
								<td>更多+</td>
							</tr>
							<tr>
								<th>分会：</th>
								<td><input type="checkbox" onClick="select_attribute" /> 离休一分会
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 离休二分会
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 机关一分会
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 机关二分会
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 文科一分会
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 文科二分会
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 理科一分会
								</td>
								<td>更多+</td>
							</tr>
							<tr>
								<th>民族：</th>
								<td><input type="checkbox" onClick="select_attribute" /> 汉族
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 回族
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 维吾尔族
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 苗族
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 满族
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 土家族
								</td>
								<td><input type="checkbox" onClick="select_attribute" /> 壮族
								</td>
								<td>更多+</td>
							</tr>
						</table>
					</div>
				</form>
				<div class="table-resopnsive">
					<table class="table table-striped table-bordered table-hover" id="personitem">
						<tr>
							<th class="info">序号</th>
							<th class="info">姓名</th>
							<th class="info">工资编码</th>
							<th class="info">所在分会</th>
							<th class="info">单位名称</th>
							<th class="info">工资库</th>
							<th class="info">离/退</th>
							<th class="info">性别</th>
							<th class="info">民族</th>
							<th class="info">籍贯</th>
							<th class="info">学历</th>
							<th class="info">政治面貌</th>
						</tr>
						<c:forEach Items="${requestScope.person_list}" var="hminfo">
							<tr>
								<td><input type="checkbox" value="0" name="personitem" class="personitem" />$person_list.sysno</td>
								<td>$person_list.name</td>
								<td>$person_list.code</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
			<div class="col-md-10">
				<div class="pull-left tool-btn">
					<input type="checkbox"><strong>&nbsp;全选</strong>
				</div>
				<div class="pull-right">
					<button type="button" class="btn btn-info">新增人员</button>
					<button type="button" class="btn btn-warning">导出PDF</button>
					<button type="button" class="btn btn-warning" onclick="printtable(personitem)">导出Excel</button>
					<button type="button" class="btn btn-info">下载模板</button>
				</div>
			</div>
		</div>
	</div>

</body>

</html>
