package com.anderson.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//@WebServlet(urlPatterns = "/main")
public class UserServlet extends HttpServlet {


//
//    private static Statement statement;
//    private static PreparedStatement preparedStatement;
//    private static CallableStatement callableStatement;
//


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<User> users = new ArrayList<User> (Arrays.asList(
                new User("John First", 15, "Active"),
                new User("Bob Second", 25, "Active"),
                new User("Martin Third", 19, "Active")
        ));
        req.setAttribute("users", users);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}

//        String name = req.getParameter("name");
//        int score = Integer.parseInt(req.getParameter("score"));

//        try {
//            preparedStatement.setString(1, name);
//            preparedStatement.setInt(2, score);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        resp.getWriter().write("Student " + name + " (" + score + ") successfully added!\n\nOTHERS STUDENTS:");

//        try (Connection con = connect()){
//            connect();
//            resp.getWriter().write("++++++");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            ResultSet rs = statement.executeQuery("SELECT * FROM students");
//            while (rs.next()) {
//                resp.getWriter().write("id: " + rs.getInt("id") + ", name: " + rs.getString("name") + ", score: " + rs.getInt("score") + "\n");
//            }
//        } catch (SQLException e) {
//        }
//    }


