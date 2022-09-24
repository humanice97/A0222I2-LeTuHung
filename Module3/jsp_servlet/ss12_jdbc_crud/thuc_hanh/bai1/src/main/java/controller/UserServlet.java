package controller;

import model.User;
import service.impl.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/users")
public class UserServlet extends HttpServlet {
    UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                break;
            case "edit":
                break;
            case "delete":
                break;
            default:
                findAll(request, response);
                break;
        }


    }

    private void findAll(HttpServletRequest request, HttpServletResponse response) {
        List<User> userList = userService.selectAllUsers();
        request.setAttribute("userList", userList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                userCreate(request, response);
                break;
            case "edit":
                userEdit(request, response);
                break;
            case "delete":
                userDelete(request, response);
                break;
            case "search":
                userSearch(request, response);
                break;
        }

    }

    private void userSearch(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("nameSearch");
        String email = request.getParameter("emailSearch");
        String country = request.getParameter("countrySearch");
        List<User> listUser = userService.selectUser(name, email, country);
        request.setAttribute("userList", listUser);
        request.setAttribute("nameSearch", name);
        request.setAttribute("emailSearch", email);
        request.setAttribute("countrySearch", country);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/list.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void userEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("userId"));
        String name = request.getParameter("userName");
        String email = request.getParameter("userEmail");
        String country = request.getParameter("userCountry");
        User user = new User(id, name, email, country);
        try {
            userService.updateUser(user);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            response.sendRedirect("users");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void userCreate(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("userNameCreate");
        String email = request.getParameter("userEmailCreate");
        String country = request.getParameter("userCountryCreate");


        User user = new User(name, email, country);
        try {
            userService.insertUser(user);
            response.sendRedirect("/users");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void userDelete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("deleteId"));
        try {
            userService.deleteUser(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            response.sendRedirect("/users");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
