package com.sample;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServlet;

@WebServlet(
        name = "ValidateLogin",
        urlPatterns = "/ValidateLogin"
)

public class ValidateLogin extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String strUsername = req.getParameter("uname");
        List<String> l = new ArrayList<String>();
        l.add(strUsername);
        System.out.println("The User Name is"+strUsername);
        req.setAttribute("username", l);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
