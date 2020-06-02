<!DOCTYPE html>
<%@page pageEncoding="utf-8" contentType="text/html; utf-8" import="cn.sensor.domain.Message"
        import="cn.sensor.domain.JudgeMessage" %>
<%
    Message msg = new Message();
    msg = (Message) request.getAttribute("msg");
    JudgeMessage judge = new JudgeMessage();
    String suggestion = null;
    suggestion = judge.getAllSuggestion(msg);
%>
<html>
<head>
    <!-- 这个是注释-->
    <meta charset="UTF-8">
    <title>个人中心</title>
</head>
<script>
    $('textarea').var(suggestion);
</script>
<style>
    * {
        margin: 0px;
        padding: 0px;
        box-sizing: border-box;
    }

    body {
        background: url("images/bg.jpg") no-repeat center;
        padding-top: 25px;
    }

    .data_layout {
        width: 900px;
        height: 400px;
        border: 8px solid #EEEEEE;
        background-color: white;
        /*让div水平居中*/
        margin: auto;
    }

    .data_left {
        float: left;
        margin: 15px;
    }

    .data_left > p:first-child {
        color: black;
        font-size: 25px;
    }

    .data_left > p:last-child {
        color: rgb(201, 109, 109);
        font-size: 20px;

    }

    .data_center {
        float: left;
    }

    .data_right {
        float: right;
        margin: 15px;
    }

    .data_right > p:first-child {
        font-size: 15px;

    }

    .data_right p a {
        color: pink;
    }

    .td_left {
        width: 100px;
        text-align: right;
        height: 45px;
    }

    .td_right {
        padding-left: 50px;
    }

    #username, #password {
        width: 251px;
        height: 32px;
        border: 1px solid #A6A6A6;
        /*设置边框圆角*/
        border-radius: 5px;
        padding-left: 10px;
    }

    #suggest {
        position: relative;
        left: 35px;
        bottom: -50px;
        width: 280px;
        height: 120px;
        border: 1px solid #A6A6A6;
        /*设置边框圆角*/
        border-radius: 5px;

    }
</style>
<body>
<div class="data_layout">
    <!--属性 -->
    <div class="data_left">
        <p>用户健康信息</p>
        <p>您的身体健康数据如下：</p>
        <p><a href="messageServlet">历史健康数据</a></p>
    </div>

    <div class="data_center">
        <table>
            <tr>
                <td class="td_left"><label for="heartrate">心&nbsp;率&nbsp;:</label></td>
                <td class="td_right"><input type="text" name="heartrate" id="heartrate" value="<%=msg.getHeartrate()%>">
                </td>
            </tr>

            <tr>
                <td class="td_left"><label for="bloodoxygen">血&nbsp;氧&nbsp;:</label></td>
                <td class="td_right"><input type="text" name="bloodoxygen" id="bloodoxygen"
                                            value="<%=msg.getBloodoxygen()%>"></td>
            </tr>

            <tr>
                <td class="td_left"><label for="temperature">体&nbsp;温&nbsp;:</label></td>
                <td class="td_right"><input type="text" name="temperature" id="temperature"
                                            value="<%=msg.getTemperature()%>"></td>
            </tr>

            <tr>
                <td class="td_left"><label for="temperature">时&nbsp;间&nbsp;:</label></td>
                <td class="td_right"><input type="text" name="theTime" id="theTime" value="<%=msg.getTheTime()%>"></td>
            </tr>

            <tr>
                <td colspan="2" align="center"><textarea name="suggest"
                                                         id="suggest">给用户的建议：<%=suggestion == null ? "" : suggestion%></textarea>
                </td>

                <%--<td colspan="2" align="center">  <input type="text" name="suggest" id="suggest" value="<%=judge.getAllSuggestion(msg)%>"></td>--%>
            </tr>
        </table>
    </div>

    <div class="data_right">
        <p>退出系统<a href="index.jsp">立即退出</a></p>
    </div>

</div>

</body>
</html>