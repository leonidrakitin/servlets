package com.anderson.servlets.commands;

import com.anderson.dao.UserDAO;
import com.anderson.model.UserModel;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;

public class HomeCommand extends FrontCommand {
    @Override
    public void execute() throws ServletException, IOException {
        List<UserModel> users = UserDAO.selectAll();
        request.setAttribute("users", users);
        request.setAttribute("error", null);
        forward("index");
    }
}
