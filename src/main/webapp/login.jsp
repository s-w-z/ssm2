<%--
  Created by IntelliJ IDEA.
  User: swz
  Date: 2021/4/25
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basePath = request.getContextPath();%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>登录</title>
    <link rel="stylesheet" href="./layui/css/layui.css">
    <style type="text/css">
        .container{
            width: 420px;
            height: 320px;
            min-height: 320px;
            max-height: 320px;
            position: absolute;
            top: 0;
            left: 0;
            bottom: 0;
            right: 0;
            margin: auto;
            padding: 20px;
            z-index: 130;
            border-radius: 8px;
            background-color: #fff;
            box-shadow: 0 3px 18px rgba(100, 0, 0, .5);
            font-size: 16px;
        }
        .close{
            background-color: white;
            border: none;
            font-size: 18px;
            margin-left: 410px;
            margin-top: -10px;
        }

        .layui-input{
            border-radius: 5px;
            width: 300px;
            height: 40px;
            font-size: 15px;
        }
        .layui-form-item{
            margin-left: -20px;
        }
        #logoid{
            margin-top: -16px;
            padding-left:150px;
            padding-bottom: 15px;
        }
        .layui-btn{
            margin-left: -50px;
            border-radius: 5px;
            width: 350px;
            height: 40px;
            font-size: 15px;
        }
        .verity{
            width: 120px;
        }
        .font-set{
            font-size: 13px;
            text-decoration: none;
            margin-left: 120px;
        }
        a:hover{
            text-decoration: underline;
        }

    </style>
</head>
<body>
<form class="layui-form" lay-filter="loginForm" action="login" method="post">
    ${msg}
    <div class="container">
        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
            <legend>登录</legend>
        </fieldset>
        <div class="layui-form-item">
            <label class="layui-form-label">用户名</label>
            <div class="layui-input-block">
                <input type="text" name="userName" required  lay-verify="username" placeholder="请输入用户名" autocomplete="off" class="layui-input" value="2018124205">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">密 &nbsp;&nbsp;码</label>
            <div class="layui-input-inline">
                <input type="password" name="password" required lay-verify="pass" placeholder="请输入密码" autocomplete="off" class="layui-input" value="123456">
            </div>
            <!-- <div class="layui-form-mid layui-word-aux">辅助文字</div> -->
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">身份</label>
            <div class="layui-input-block">
                <select name="status" lay-verify="">
                    <option value="admin" >管理员</option>
                    <option value="student" selected>学生</option>
                    <option value="archivist">档案管理员</option>
                </select>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="*" >登陆</button>
            </div>
        </div>
        <a href="" class="font-set">忘记密码?</a>  <a href="" class="font-set">立即注册</a>
    </div>
</form>
<script type="text/javascript" src="./layui/layui.js"></script>
<script type="text/javascript" src="js/visitAddress.js"></script>
<script type="text/javascript" src="./js/jquery.js"></script>
<script>
    layui.use(['form', 'layedit', 'laydate' , 'layer'], function(){
        var form = layui.form
            ,layer = layui.layer;



        //监听提交
        form.on('submit(*)', function(data){
            var data1 = form.val("loginForm");
            alert(JSON.stringify(data1));

            // $.ajax({
            //     url:url+'login',
            //     type:'post',
            //     data:data1,
            //     success:function(result,testStatus){   //result保存服务端返回的返回值//testStatus保存服务器返回状态
            //         alert(testStatus);
            //         if(testStatus=='success'){
            //             alert(result.msg);
            //             if(result.msg){
            //
            //             }
            //         }
            //     },
            //     error:function(xhr,errorMessage,e){
            //     },
            // });

            // return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        });
    });
</script>
</body>
</html>