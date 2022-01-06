package com.bjpowernode.controller;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet  extends  HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getServletPath();
        if("/student/select.do".equals(path)){
            select(req,resp);
        }else if("/student/delete.do".equals(path)){
            delete(req,resp);
        }
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行了delete方法");
    }

    private void select(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行了查询方法");
    }
}
