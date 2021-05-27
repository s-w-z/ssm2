<%--
  Created by IntelliJ IDEA.
  User: swz
  Date: 2021/5/18
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basePath = request.getContextPath();%>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>电子档案系统</title>
    <link rel="stylesheet" href="./layui/css/layui.css">
</head>
<body>

<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">layout demo</div>
        <!-- 头部区域（可配合layui 已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="" style="font-size: 25px">个人信息</a></li>
            <li class="layui-nav-item">
                <a href="" style="font-size: 25px">通知<span class="layui-badge">9</span></a>
            </li>

        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
               学生：${userInfo.stuName}
            </li>
            <li class="layui-nav-item"><a href="">Sign out</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">menu group 1</a>
                    <dl class="layui-nav-child">
                        <dd><a href="pdff.html" target="left">menu item 1-1</a></dd>
                        <dd><a href="javascript:;">menu item 1-2</a></dd>
                        <dd><a href="javascript:;">menu item 1-3</a></dd>
                        <dd><a href="">the links</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">menu group 2</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" >list 2-1</a></dd>
                        <dd><a href="javascript:;">list 2-2</a></dd>
                        <dd><a href="">超链接</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="javascript:;">menu item 123</a></li>
                <li class="layui-nav-item"><a href="">the links</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <iframe name="" src="<%=basePath%>/student/toMyInfo" frameborder=no  border=0  marginwidth=5px  marginheight=0  scrolling=no width="100%" height="100%"></iframe>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        底部固定区域
    </div>
</div>

<script src="./layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
</script>
</body>
</html>