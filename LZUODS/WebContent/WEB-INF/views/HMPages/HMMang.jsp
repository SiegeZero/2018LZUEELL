<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人员管理</title>
<style>
body {
	margin: 0; /*去除边缘间隙*/
	padding: 0;
	font-family: "微软雅黑";
}

#HMMenu {
	position: fixed;
	background: #0F88EB;
	top: 58px;
	width: 14%;
	min-width: 100px;
	height: 100%;
	color: #FFFFFF;
	box-shadow: 2px 2px 5px #3B78E7;
}

#HMMenu span {
	display: block;
	vertical-align: middle;
	padding-left: 25%;
	font-size: 18px;
	line-height: 54px;
	font-weight: bold;
}

#HMMenu ul {
	margin: 0px;
	padding: 0px;
	list-style-type: none; /*去除标识原点*/
	overflow: hidden;
}

#HMMenu a {
	display: block;
	font-size: 12px;
	font-weight: bold;
	color: #FFFFFF;
	text-align: center;
	padding: 5px;
	line-height: 30px;
	-webkit-transition: background-color 0.5s ease, color 0.5s ease,
		border-bottom 0.5s ease;
	-moz-transition: background-color 0.5s ease, color 0.5s ease,
		border-bottom 0.5s ease;
	-o-transition: background-color 0.5s ease, color 0.5s ease,
		border-bottom 0.5s ease;
	transition: background-color 0.5s ease, color 0.5s ease, border-bottom
		0.5s ease;
}

#HMMenu a:link, a:visited {
	text-decoration: none;
	text-transform: uppercase;
}

#HMMenu a:hover, a:active {
	background-color: #36C6D3;
}

#CommentField {
	width: 86%;
	min-width: 800px;
	float: right;
	padding-top: 96px;
}

#SearchField {
	width: 50%;
	height: 28px;
	font-size: 12px;
	color: #777777;
	padding-left: 12px;
	border: thin solid #3B78E7;
}

#SearchBtn {
	padding: 0px;
	background: #3B78E7;
	color: #FFFFFF;
	width: 54px;
	height: 30px;
	font-size: 14px;
	border: 0px;
	cursor: pointer;
}

#HMSearch table {
	width: 97%;
	padding-left: 20px;
	vertical-align: middle;
}

#HMSearch th {
	padding: 10px;
	color: #3B78E7;
	font-size: 12px;
	font-weight: bold;
	text-align: left;
}

#HMSearch td {
	font-size: 10px;
	color: #0F88EB;
	font-weight: bold;
	text-align: left;
	padding: 10px;
}

#HMSearch input {
	margin-left: 10px;
	vertical-align: middle;
}

#HMInfo table {
	width: 97%;
	font-size: 12px;
	padding-left: 20px;
}

#HMInfo th {
	padding: 10px;
	text-align: left;
	color: #3B78E7;
	font-size: 12px;
	font-weight: bold;
}

#HMInfo td {
	font-size: 10px;
	font-weight: bold;
	text-align: left;
	padding: 10px;
}

#HMTools {
	text-align: right;
}

#HMTools input {
	width: 60px;
	height: 24px;
	margin-right: 20px;
	background: #3B78E7;
	font-size: 10px;
	color: #FFFFFF;
	border: #000000;
	text-align: center;
}

body, td, th {
	font-size: 14px;
}
</style>
<script>
	onload = function() {
		sexesn.style.display = "none";
		sex.onmouseenter = function() {
			sexesn.style.display = "block";
		};
		sex.onmouseleave = function() {
			sexesn.style.display = "none";
		};
	};

	//导出excel表格
	var idTmr;
	function getExplorer() {
		var explorer = window.navigator.userAgent;
		//ie  
		if (explorer.indexOf("MSIE") >= 0) {
			return 'ie';
		}
		//firefox  
		else if (explorer.indexOf("Firefox") >= 0) {
			return 'Firefox';
		}
		//Chrome  
		else if (explorer.indexOf("Chrome") >= 0) {
			return 'Chrome';
		}
		//Opera  
		else if (explorer.indexOf("Opera") >= 0) {
			return 'Opera';
		}
		//Safari  
		else if (explorer.indexOf("Safari") >= 0) {
			return 'Safari';
		}
	}
	function printtable(tableid) {
		if (getExplorer() == 'ie') {
			var curTbl = document.getElementById(tableid);
			var oXL = new ActiveXObject("Excel.Application");
			var oWB = oXL.Workbooks.Add();
			var xlsheet = oWB.Worksheets(1);
			var sel = document.body.createTextRange();
			sel.moveToElementText(curTbl);
			sel.select();
			sel.execCommand("Copy");
			xlsheet.Paste();
			oXL.Visible = true;

			try {
				var fname = oXL.Application.GetSaveAsFilename("Excel.xls",
						"Excel Spreadsheets (*.xls), *.xls");
			} catch (e) {
				print("Nested catch caught " + e);
			} finally {
				oWB.SaveAs(fname);
				oWB.Close(savechanges = false);
				oXL.Quit();
				oXL = null;
				idTmr = window.setInterval("Cleanup();", 1);
			}

		} else {
			tableToExcel(tableid)
		}
	}
	function Cleanup() {
		window.clearInterval(idTmr);
		CollectGarbage();
	}
	var tableToExcel = (function() {
		var uri = 'data:application/vnd.ms-excel;base64,', template = '<html><head><meta charset="UTF-8"></head><body><table>{table}</table></body></html>', base64 = function(
				s) {
			return window.btoa(unescape(encodeURIComponent(s)))
		}, format = function(s, c) {
			return s.replace(/{(\w+)}/g, function(m, p) {
				return c[p];
			})
		}
		return function(table, name) {
			if (!table.nodeType)
				table = document.getElementById(table)
			var ctx = {
				worksheet : name || 'Worksheet',
				table : table.innerHTML
			}
			window.location.href = uri + base64(format(template, ctx))
		}
	})()
</script>
</head>
<body>
	<jsp:include page="NavigationBar.jsp"></jsp:include>
	<div id="HMMenu">
		<hr />
		<span>人员管理</span>
		<ul>
			<li><a id="menu_hminfo_btn">人员信息</a></li>
			<li><a id="menu_salary_btn">工资管理</a></li>
			<li><a id="menu_analysis_btn">统计分析</a></li>
			<li><a id="menu_other_btn">其他功能</a></li>
		</ul>
	</div>
	<div id="CommentField">
		<div id="HMSearch">
			<center>
				<input type="text" id="SearchField" value="输入姓名或工资卡号"
					style="color: #bebebe" title="在此输入搜索内容" onfocus="this.value=''"
					onblur="if(this.value==''){this.value='输入姓名或工资卡号';}"> <input
					type="submit" id="SearchBtn" value="搜索">
			</center>
			<br />
			<form name="input" action="提交目的地" method="get">
				<table>
					<tr>
						<th>基本：</th>
						<td id="sex" >性别</td>
						<td>离休情况</td>
						<td>兵役情况</td>
						<td>政治面貌</td>
						<td>在世情况</td>
						<td>贫困状况</td>
						<td>慰问情况</td>
						<td>学历</td>
					</tr>
					<tr>
						<td colspan="8">
						·	<div id="sexesn"
									style="padding: 10px; border: thin solid #BEBEBE; background: #EEEFFF">
									<span>男 <input type="checkbox" onClick="select_attribute"
										check />
									</span> <span>女 <input type="checkbox"
										onClick="select_attribute" check />
									</span>
								</div>
						</td>
					<tr>
						<th>年龄：</th>
						<td>50-60 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>60-70 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>70-80 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>80-90 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>90-100 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>100+ <input type="checkbox" onClick="select_attribute"
							 /></td>
					</tr>
					<tr>
						<th>职级：</th>
						<td>副科 <input type="checkbox" onClick="select_attribute" /></td>
						<td>正科 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>科长 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>副地级 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>地级 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>副厅级 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>正厅级 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>更多+</td>
					</tr>
					<tr>
						<th>职称：</th>
						<td>工人 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>技师 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>中级 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>高级 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>副高 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>正高 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>实验师 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>更多+</td>
					</tr>
					<tr>
						<th>分会：</th>
						<td>离休一分会 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>离休二分会 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>机关一分会 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>机关二分会 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>文科一分会 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>文科二分会 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>理科一分会 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>更多+</td>
					</tr>
					<tr>
						<th>民族：</th>
						<td>汉族 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>回族 <input type="checkbox" onClick="select_attribute"
							 /></td>
						<td>维吾尔族 <input type="checkbox" onClick="select_attribute"
							check /></td>
						<td>苗族 <input type="checkbox" onClick="select_attribute"
							check /></td>
						<td>满族 <input type="checkbox" onClick="select_attribute"
							check /></td>
						<td>土家族 <input type="checkbox" onClick="select_attribute"
							check /></td>
						<td>壮族 <input type="checkbox" onClick="select_attribute"
							check /></td>
						<td>更多+</td>
					</tr>
				</table>
			</form>
			<br />
		</div>
		<div id="HMInfo">
			<br />
			<hr />
			<table id="hmdtaltable">
				<tr>
					<th>序号</th>
					<th>工资编码</th>
					<th>姓名</th>
					<th>所在分会</th>
					<th>单位名称</th>
					<th>工资库</th>
					<th>离/退</th>
					<th>性别</th>
					<th>民族</th>
					<th>籍贯</th>
					<th>学历</th>
					<th>政治面貌</th>
				</tr>
				<tr>
					<td><input type="checkbox" style="vertical-align: middle;"
						onClick="select_attribute" check />11</td>
					<td>1001</td>
					<td>夏志坚</td>
					<td>离休一分会</td>
					<td>后勤集团</td>
					<td>93前</td>
					<td>离休</td>
					<td>男</td>
					<td>汉</td>
					<td>山西五寨</td>
					<td>初中</td>
					<td>党员</td>
				</tr>
				<tr>
					<td><input type="checkbox" style="vertical-align: middle;"
						onClick="select_attribute" check />11</td>
					<td>1001</td>
					<td>夏志坚</td>
					<td>离休一分会</td>
					<td>后勤集团</td>
					<td>93前</td>
					<td>离休</td>
					<td>男</td>
					<td>汉</td>
					<td>山西五寨</td>
					<td>初中</td>
					<td>党员</td>
				</tr>
				<tr>
					<td><input type="checkbox" style="vertical-align: middle;"
						onClick="select_attribute" check />11</td>
					<td>1001</td>
					<td>夏志坚</td>
					<td>离休一分会</td>
					<td>后勤集团</td>
					<td>93前</td>
					<td>离休</td>
					<td>男</td>
					<td>汉</td>
					<td>山西五寨</td>
					<td>初中</td>
					<td>党员</td>
				</tr>
			</table>
			<hr />
		</div>
		<div id="HMTools">
			<input type="button" value="导入"> <input type="button"
				value="导出" onClick="printtable(hmdtaltable)" title="导出为Excel表格">
			<input type="button" value="下载模板">
		</div>
		<br />
	</div>
</body>
</html>