package com.anderson.servlets.commands;

import com.anderson.dao.UserDAO;
import com.anderson.model.UserModel;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;

public class ReturnCommand extends FrontCommand {
    @Override
    public void execute() throws ServletException, IOException {
        String strId = (String) request.getParameter("id");
        Long id = Long.parseLong(strId);
        UserDAO.updateStatus(id, true);
        List<UserModel> users = UserDAO.selectAll();
        request.setAttribute("users", users);
        request.setAttribute("error", null);
        forward("index");
    }
}
