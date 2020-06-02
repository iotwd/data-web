package cn.sensor.web.servlet;

import cn.sensor.dao.UserDao;
import cn.sensor.domain.User;
import cn.sensor.domain.Message;
import cn.sensor.dao.MessageDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/successServlet")
public class SuccessServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取reqest域中共享的user对象
        User user = (User)request.getAttribute("user");
        if (user != null){
            //如果成功，跳转到个人中心 personal.jsp
            //设置编码
            response.setContentType("text/html;charset=utf-8");
            //共享查询到的数据
            UserDao dao = new UserDao();
            Message msg = new Message( );
            MessageDao daom = new MessageDao();
//            msg=daom.findByID(user.getId());
            msg=daom.findByID(daom.getNewestId()-1);
            request.setAttribute("msg",msg);
            //跳转到personal.html
            request.getRequestDispatcher("./personal.jsp").forward(request,response);

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
