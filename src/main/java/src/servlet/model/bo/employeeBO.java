package src.servlet.model.bo;

import src.servlet.model.bean.Employee;
import src.servlet.model.dao.employeeDAO;

import java.util.ArrayList;


public class employeeBO {
    employeeDAO employeeDAO = new employeeDAO();

    public Employee login(String valueLogin, String password) {
        return employeeDAO.login(valueLogin, password);
    }

    public ArrayList<Employee> getListEmployee() {
        return employeeDAO.getListEmployee();
    }
}
