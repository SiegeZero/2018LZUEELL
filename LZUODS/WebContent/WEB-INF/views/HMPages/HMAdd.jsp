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

<body>

	<jsp:include page="NavigationBar.jsp"></jsp:include>
	
    <div class="container-fluid">
        <p class="alert alert-info"><strong>新增人员</strong></p>
    </div>

    <div class="container-fluid">
        <div id="BaseInfo">
            <table class="table">
                <tr>
                    <th>工资编号:</th>
                    <div class="input-group input-group-sm">
                        <td><input type="text" class="form-control" placeholder="工资编号" /></td>
                    </div>
                    <th>姓名:</th>
                    <div class="input-group input-group-sm">
                        <td><input type="text" class="form-control" placeholder="姓名" /></td>
                    </div>
                    <th>籍贯:</th>
                    <div class="input-group input-group-sm">
                        <td><input type="text" class="form-control" placeholder="籍贯" /></td>
                    </div>
                    <th>工作单位:</th>
                    <div class="input-group input-group-sm">
                        <td><input type="text" class="form-control" placeholder="原工作单位" /></td>
                    </div>
                </tr>
                <tr>
                    <th>性别:</th>
                    <td>
                        <input name="sex" type="radio" value="男" checked />&nbsp;男&nbsp;
                        <input name="sex" type="radio" value="女" />&nbsp;女&nbsp;
                    </td>
                    <th>工资库:</th>
                    <td>
                        <input name="salary" type="radio" value="93后" checked />&nbsp;93后&nbsp;
                        <input name="salary" type="radio" value="93前" />&nbsp;93前&nbsp;
                    </td>
                    <th>离休情况:</th>
                    <td><input type="radio" name="离休情况" value="离休" checked />&nbsp;离休&nbsp;
                        <input type="radio" name="离休情况" value="退休" />&nbsp;退休&nbsp;
                    </td>
                    <th>兵役情况:</th>
                    <td>
                        <input type="radio" name="military" value="非军人" checked />&nbsp;非军人&nbsp;
                        <input type="radio" name="military" value="军人" />&nbsp;军人&nbsp;
                    </td>
                </tr>
                <tr>
                    <th>所在分会:</th>
                    <td>
                        <div class="dropdown">
                            <button type="button" class="btn btn-default" data-toggle="dropdown">
                           所属分会
                           <span class="caret"></span>
                           </button>
                            <ul class="dropdown-menu">
                                <li>离休一分会</li>
                                <li>离休一分会</li>
                                <li>理科一分会</li>
                                <li>文科一分会</li>
                            </ul>
                        </div>
                    </td>
                    <th>学历:</th>
                    <td>
                        <select>
                        <option value="博士">博士</option>
                        <option value="硕士">硕士</option>
                        <option value="本科">本科</option>
                        <option value="专科">专科</option>
                        <option value="高中">高中</option>
                        <option value="初中">初中</option>
                        <option value="小学">小学</option>
                        <option value="文盲">文盲</option>
                        </select>
                    </td>
                    <th>政治面貌:</th>
                    <td>
                        <select>
                        <option value="共产党员">共产党员</option>
                        <option value="民主党员">民主党员</option>
                        <option value="共青团员">共青团员</option>
                        <option value="群众">群众</option>
                        </select>
                    </td>
                    <th>民族:</th>
                    <td>
                        <select>
                        <option value="汉族">汉族</option>
                        <option value="苗族">苗族</option>
                        <option value="维吾尔族">维吾尔族</option>
                        <option value="回族">回族</option>
                        <option value="壮族">壮族</option>
                        <option value="蒙古族">蒙古族</option>
                        </select>
                    </td>
                </tr>
            </table>
            </center>
        </div>
        <div>
            <table class="table">
                <tr class="info">
                    <th>时间</th>
                    <th>工作内容</th>
                </tr>
                <tr>
                    <td><input type="date" />&nbsp;&nbsp;&nbsp;至&nbsp;&nbsp;&nbsp;<input type="date" /></td>
                    <div class="input-group input-group-sm">
                        <td><input type="text" class="form-control" placeholder="工作内容" /></td>
                    </div>
                </tr>
            </table>
        </div>
        <div>
            <table class="table">
                <tr class="info">
                    <th>与本人关系</th>
                    <th>姓名</th>
                    <th>联系方式</th>
                </tr>
                <tr>
                    <div class="input-group input-group-sm">
                        <td><input type="text" class="form-control" placeholder="称呼" /></td>
                    </div>
                    <div class="input-group input-group-sm">
                        <td><input type="text" class="form-control" placeholder="姓名" /></td>
                    </div>
                    <div class="input-group input-group-sm">
                        <td><input type="text" class="form-control" placeholder="联系方式" /></td>
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
                        <td><input type="text" class="form-control" placeholder="健康状况" /></td>
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
                    <td><input type="date" />&nbsp;&nbsp;&nbsp;至&nbsp;&nbsp;&nbsp;<input type="date" /></td>
                    <div class="input-group input-group-sm">
                        <td><input type="text" class="form-control" placeholder="居住地住" /></td>
                    </div>
                </tr>
            </table>
        </div>
    </div>
    <div>
        <a href="#"><button type="button" class="btn btn-primary">确认</button></a>
        <a href="HMMang.html"><button type="button" class="btn btn-info">取消</button></a>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
