<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="height: 100%">

<head style="height: 100%">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!--IE浏览器渲染方式-->
<title>其他功能</title>
</head>

<body>
	<form action="test/start" method="post">
		<div>
			<input name="year" type="text" placeholder="输入年份"> <input name="judgerAmount" type="text"
				placeholder="评定人数">
		</div>
		<div>
			<table>
				<tr>
					<td><input name="judge1" type="text" placeholder="评分类型1"></td>
					<td><input name="judge2" type="text" placeholder="评分类型2"></td>
					<td><input name="judge3" type="text" placeholder="评分类型3"></td>
					<td><input name="judge4" type="text" placeholder="评分类型4"></td>
				</tr>
				<tr>

					<td><input name="weight1" type="text" placeholder="所占权重"></td>
					<td><input name="weight2" type="text" placeholder="所占权重"></td>
					<td><input name="weight3" type="text" placeholder="所占权重"></td>
					<td><input name="weight4" type="text" placeholder="所占权重"></td>
				</tr>
			</table>
		</div>
		<div>
			<button type="submit">下一步</button>
		</div>
	</form>
</body>

</html>
