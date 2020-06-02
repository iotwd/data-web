package cn.sensor.web.servlet;

import cn.sensor.dao.UserDao;
import cn.sensor.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        User loginuser = new User();
        loginuser.setUsername(username);
        loginuser.setPassword(password);
        UserDao dao = new UserDao();
        User user=(User)dao.login(loginuser);
        if(user==null){
            //登陆失败
            request.getRequestDispatcher("/failServlet").forward(request,response);
        }else{
            //存储数据
            request.setAttribute("user",user);
            //转发
            request.getRequestDispatcher("/successServlet").forward(request,response);
        }
    }
}
