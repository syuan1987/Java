<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/14
  Time: 22:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=0.8">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC 添加用户</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="from-group">
    <h1 style="text-align: center">添加学员信息</h1>
    <hr/>
    <form:form action="/student/addStu" method="post" commandName="stu" reole="form">
        <%--<div class="form-group">--%>
            <%--<label for="id">id:</label>--%>
            <%--<input type="hidden" class="form-control" id="id" name="id" placeholder="请输入id"/>--%>
        <%--</div>--%>
        <div class="form-group">
            <label for="stu_name">姓名:</label>
            <input type="text" class="form-control" id="stu_name" name="stu_name" placeholder="请输入姓名"/>
        </div>
        <div class="form-group">
            <label for="stu_pwd">密码:</label>
            <input type="text" class="form-control" id="stu_pwd" name="stu_pwd" placeholder="请输入密码"/>
        </div>
        <div class="form-group">
            <label for="stu_QQ">QQ:</label>
            <input type="text" class="form-control" id="stu_QQ" name="stu_QQ" placeholder="请输入QQ号"/>
        </div><div class="form-group">
            <label for="course">修真类型:</label>
            <input type="text" class="form-control" id="course" name="course" placeholder="请输入修真类型"/>
        </div>
        <div class="form-group">
            <label for="school">毕业院校:</label>
            <input type="text" class="form-control" id="school" name="school" placeholder="请输入毕业院校"/>
        </div>
        <div class="form-group">
            <label for="stu_ID">线上学号:</label>
            <input type="text" class="form-control" id="stu_ID" name="stu_ID" placeholder="请输入线上学号"/>
        </div>
        <div class="form-group">
            <label for="stu_date">入学时间:</label>
            <input type="text" class="form-control" id="stu_date" name="stu_date" placeholder="请输入入学时间"/>
        </div>
        <div class="form-group">
            <label for="daily_link">日报链接:</label>
            <input type="text" class="form-control" id="daily_link" name="daily_link" placeholder="请输入日报链接"/>
        </div>
        <div class="form-group">
            <label for="hope">立愿:</label>
            <input type="text" class="form-control" id="hope" name="hope" placeholder="请输入立愿"/>
        </div>
        <div class="form-group">
            <label for="yinjian">引荐师兄:</label>
            <input type="text" class="form-control" id="yinjian" name="yinjian" placeholder="请输入引荐师兄"/>
        </div>
        <div class="form-group">
            <label for="shenhe">审核师兄:</label>
            <input type="text" class="form-control" id="shenhe" name="shenhe" placeholder="请输入审核师兄"/>
        </div>
        <%--<div class="form-group">--%>
            <%--<label for="creat_at">创建时间:</label>--%>
            <%--<input type="hidden" class="form-control" id="creat_at" name="creat_at" placeholder="系统录入创建时间"/>--%>
        <%--</div>--%>
        <%--<div class="form-group">--%>
            <%--<label for="update_at">修改时间:</label>--%>
            <%--<input type="hidden" class="form-control" id="update_at" name="updaet_at" placeholder="系统录入修改时间"/>--%>
        <%--</div>--%>
        <div class="form-group">
            <button type="submit" class="btn btn-sm btn-success">提交</button>
        </div>
    </form:form>
</div>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>
