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
    <title>新增人员</title>
</head>
<%@ page import="java.util.List,com.gsb.BasicObject.MBG.SalaryLib" %>
<%
List<String> sociaty_list =(List<String>) request.getAttribute("sociaties_list");
List<SalaryLib> slib_list =(List<SalaryLib>) request.getAttribute("slib_list");
%>
<body>

	<jsp:include page="NavigationBar.jsp"></jsp:include>
	
    <div class="container-fluid">
        <p class="alert alert-info"><strong>新增人员</strong></p>
    </div>

    <div class="container-fluid">
        <form action="save_basic_info" method="post" id="BaseInfo">
            <table class="table">
                <tr>
                    <th>姓名:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="name" type="text" class="form-control" value="张三" placeholder="姓名" /></td>
                    </div>
                    <th>性别:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="gender" type="text" class="form-control" value="男" placeholder="性别" /></td>
                    </div>
                    <th>籍贯:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="native_place" type="text" class="form-control" value="广东深圳" placeholder="籍贯" /></td>
                    </div>
                    <th>民族:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="nation" type="text" class="form-control" value="汉" placeholder="民族" /></td>
                    </div>
                </tr>
                <tr>
                    <th>出生日期:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="birth_date" type="text" class="form-control" value="19960101" placeholder="出生日期" /></td>
                    </div>
                    <th>工资编号:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="salary_no" type="text" class="form-control" placeholder="工资编号" /></td>
                    </div>
                    <th>工资库:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="slary_lib" type="text" class="form-control" placeholder="工资库" /></td>
                    </div>
                    <th>所在分会:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="sociaty" type="text" class="form-control" value="机关一分会" placeholder="所在分会" /></td>
                    </div>
                </tr>
                <tr>
                	<th>职级：</th>
                    <div  class="input-group input-group-sm">
                        <td><input name="func" type="text" class="form-control" value="正处级" placeholder="职级" /></td>
                    </div>
                	<th>职称：</th>
                    <div  class="input-group input-group-sm">
                        <td><input name="title_lv" type="text" class="form-control" value="正高" placeholder="职称" /></td>
                    </div>
                    <th>学历:</th>
                    <div class="input-group input-group-sm">
                        <td><input name="edu_bg" type="text" class="form-control" value="本科" placeholder="学历" /></td>
                    </div>
                    <th>政治面貌:</th>
                    <div  class="input-group input-group-sm">
                        <td><input name="political_status" type="text" class="form-control" value="群众" placeholder="政治面貌" /></td>
                    </div>
                    </td>
                </tr>
                <tr>
                    <th>离休情况:</th>
                    <div  class="input-group input-group-sm">
                        <td><input name="quit_office_type" type="text" class="form-control" value="退休" placeholder="离休情况" /></td>
                    </div>
                    <th>兵役情况:</th>
                    <div  class="input-group input-group-sm">
                        <td><input name="conscription_situation" type="text" class="form-control" placeholder="兵役情况" /></td>
                    </div>
                    <th>贫困情况：</th>
	                    <div class="input-group input-group-sm">
	                        <td><input name="is_help_needed"  type="text" class="form-control" value="是" placeholder="是否贫困" /></td>
	                    </div>
                    <th>慰问情况：</th>
	                    <div class="input-group input-group-sm">
	                        <td><input name="lastest_sympathy_year" type="text" class="form-control" placeholder="最近慰问年份" /></td>
	                    </div>
                </tr>
            </table>
            </center>
        </div>
        <div>
            <table class="table">
                <tr class="info">
                    <th>时间</th>
                    <th>时间</th>
                    <th>工作单位</th>
                </tr>
                <tr>
                	<div class="input-group input-group-sm">
                        <td><input name="start_time" type="text" class="form-control" value="20170101" placeholder="起日期" /></td>
                    </div>
                    <div class="input-group input-group-sm">
                        <td><input name="end_time" type="text" class="form-control" value="20171231" placeholder="止日期" /></td>
                    </div>
                    <div class="input-group input-group-sm">
                        <td><input name="dept" type="text" class="form-control" value="离退休处"  placeholder="工作单位" /></td>
                    </div>
                </tr>
            </table>
        </div>
        <div>
            <table class="table">
                <tr class="info">
                    <th>健康状况</th>
                </tr>
                <tr>
                    <div class="input-group input-group-sm">
                        <td><input name="living_situation"  type="text" class="form-control" placeholder="健康状况" /></td>
                    </div>
                </tr>
            </table>
        </div>
        <div>
            <table class="table">
                <tr class="info">
                    <th>居住时间</th>
                    <th>居住住址</th>
                </tr>
                <tr>
                    <div class="input-group input-group-sm">
                        <td><input type="text" class="form-control" placeholder="起止日期" /></td>
                    </div>
                    <div class="input-group input-group-sm">
                        <td><input type="text" class="form-control" placeholder="居住地住" /></td>
                    </div>
                </tr>
            </table>
		    <div>
		        <button type="submit" class="btn btn-primary">确认</button>
		        <a href="HMMang"><button type="button" class="btn btn-info">取消</button></a>
		    </div>
        </form>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
