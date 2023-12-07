package src.servlet.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import src.servlet.model.bean.Employee;
import src.servlet.model.bo.employeeBO;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/loginController")
public class loginController extends HttpServlet {
    private static final long serialVersionID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String destination = null;

        String username = req.getParameter("username");
        String password = req.getParameter("password");

//        employeeBO checkLoginBO = new employeeBO();
//        ArrayList<Employee> listStudent = null;
//
//        if(checkLoginBO.isValidUSer(username, password)) {
//            listStudent = checkLoginBO.getListStudent();
//            req.setAttribute("listStudent", listStudent);
//            destination = "/welcome.jsp";
//            RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
//            rd.forward(req, resp);
//        } else {
//            destination = "/login.jsp";
//            RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
//            rd.forward(req, resp);
//        }
   }
}
