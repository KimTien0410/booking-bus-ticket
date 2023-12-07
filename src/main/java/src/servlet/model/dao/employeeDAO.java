package src.servlet.model.dao;

import src.servlet.model.bean.Employee;

import java.sql.*;
import java.util.ArrayList;

public class employeeDAO {
    private Connection conn;

    public employeeDAO() {
        conn = DBUtil.getConn();
    }

    public Employee login(String valueLogin, String password) {
        try {
            String sql = "SELECT * FROM employee JOIN role ON employee.role_id = role.role_id" +
                    " where (phone = ? OR email = ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, valueLogin);
            statement.setString(2, valueLogin);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String hashPassword = rs.getString("password");
                if (handlePassword.confirmPassword(password, hashPassword)) {
                    return new Employee(
                            rs.getInt("emloyee_id"), rs.getString("phone"),
                            rs.getString("email"), "",
                            rs.getString("fullname"), rs.getInt("role_id"), rs.getString("role_name"));
                } else break;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ArrayList<Employee> getListEmployee() {
        ArrayList<Employee> result = new ArrayList<Employee>();
        try {
            Statement stmt = conn.createStatement();
            String sql = "select employee_id, phone, email, fullname, employee.role_id, role.role_name "
                    + " from employee JOIN role ON employee.role_id = role.role_id"
                    + " where (NOT employee.role_id = 'admin')";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Employee employee = new Employee(
                        rs.getInt("emloyee_id"), rs.getString("phone"),
                        rs.getString("email"), "",
                        rs.getString("fullname"), rs.getInt("role_id"), rs.getString("role_name"));
                result.add(employee);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
