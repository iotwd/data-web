<!DOCTYPE html>
<%@page pageEncoding="utf-8" contentType="text/html; utf-8"%>
<html lang="en">
<html>
<head>
  <title >实践周数据查询中心</title>
</head>

<style>
  body{
    /*background:url("images/bg.jpg") no-repeat center;*/
    padding-top: 25px;
    /* background-size: cover;; */
  }
  #welcom{
    /* position: absolute;
    width: 320px;
    height: 50px;
    right:  360px; */
    text-align: center;
    padding: 25px;
  }
  #login{
    position: absolute;
    text-align: center;
    left: 450px;
    top: 200px;
    width: 40px;
    height: 20px;

  }
  #project{
    text-align: center;
    padding-top: 5px;
  }

  #members{
    padding-top: 5px;
  }
  #register{
    position: absolute;
    text-align: center;
    right: 400px;
    top: 200px;
    width: 40px;
    height: 20px;
  }

  .nav{
    line-height:30px;
    text-align: center;
    height:300px;
    width:100px;
    float:left;
    padding:5px;
  }

  footer {
    bottom: 10px;
    color:black;
    clear:both;
    text-align:center;
    padding:5px;
  }
</style>


<body>
<!-- 定义header -->
<h2 id="welcom">实践周数据查询中心</h2>
<!--定义导航栏链接-->
<div class="nav">
  <div>
    <a href="project.html" id="project" >项目介绍</a>
  </div>

  <div>
    <a href="members.html" id="members">成员介绍</a>
  </div>
</div>

<div>
  <a href="login.html" name="login" id="login">登陆</a>
</div>

<div>
  <a href="register.html" name="register" id="register">注册</a>
</div>

<footer>
  <p>
    Copyright by 2017物联网工程<br>
  <p>王东 <a href="mailto:wxydong@gmail.com">Email</a></p>
  </p>
</footer>
</body>
</html>