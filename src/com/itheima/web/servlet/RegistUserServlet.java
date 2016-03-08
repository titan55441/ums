package com.itheima.web.servlet;

import com.itheima.domain.User;
import com.itheima.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by batcave on 16/2/20.
 */
public class RegistUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        try {
            String id = request.getParameter("id");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String gender = request.getParameter("gender");
            String age = request.getParameter("age");

            User user = new User(id, username, password, gender, age);
            UserService userService = new UserService();
            userService.regist(user);

            request.setAttribute("msg","用户注册成功");
            request.getRequestDispatcher("/pages/message.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();

            request.setAttribute("msg","用户注册不成功,请售后重试");
            request.getRequestDispatcher("/pages/message.jsp").forward(request,response);
        }
    }
}
