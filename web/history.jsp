<%--
  Created by IntelliJ IDEA.
  User: 王东
  Date: 2019/11/25
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="cn.sensor.dao.MessageDao" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.io.*,java.util.*" %>

<html>
<head>
    <title>数据表</title>
</head>
<style>
    body{
        background:url("images/bg.jpg") no-repeat center;
        padding-top: 25px;
    }
</style>
<body>
    <%--实现每隔5秒自动刷新一次界面--%>
    <%
        response.setIntHeader("Refresh",5);
    %>
    <%--输出数据到表格--%>
    <%
        MessageDao dao = new MessageDao();
        List list = dao.getAllMessage();
    %>
    <h2 align="center">运动状态检测后台数据中心</h2>
    <!-- 循环显示的数据 -->
    <table class="MessageTable" align="center" border="1" >
        <tr>
            <td align="center" style="width:120px; height: 21px;" valign="middle">id</td>
            <td align="center" style="width:120px; height: 21px;" valign="middle">体温</td>
            <td align="center" style="width:120px; height: 21px;" valign="middle">心率</td>
            <td align="center" style="width:120px; height: 21px;" valign="middle">湿度</td>
            <td align="center" style="width:220px; height: 21px;" valign="middle">时间</td>
        </tr>
    <%
    Map map=null;
          for(int i=0;i<list.size();i++){
       map=(Map)list.get(i);
    %>
        <tr>
            <td align="center" style="width:120px; height: 21px;" valign="middle"><%=map.get("id") %>
            </td>
            <td align="center" style="width:120px; height: 21px;" valign="middle"><%=map.get("heartRate") %>
            </td align="center" style="width:120px; height: 21px;" valign="middle">
            <td align="center" style="width:120px; height: 21px;" valign="middle"><%=map.get("bloodOxygen")%>
            </td>
            <td align="center" style="width:120px; height: 21px;" valign="middle"><%=map.get("temperature")%>
            </td>
            <td align="center" style="width:220px; height: 21px;" valign="middle"><%=map.get("theTime")%>
            </td>
        </tr>
    <% }%>
    </table>
</body>
</html>
