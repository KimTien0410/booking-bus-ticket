package src.servlet.model.dao;

import src.servlet.model.bean.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class customerDAO {
    private Connection conn;

    public customerDAO() {
        conn = DBUtil.getConn();
    }

    public Customer login(String valueLogin, String password) {
        try {
            String sql = "SELECT * FROM customer where (phone = ? OR email = ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, valueLogin);
            statement.setString(2, valueLogin);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String hashPassword = rs.getString("password");
                if (handlePassword.confirmPassword(password, hashPassword)) {
                    return new Customer(rs.getInt("customer_id"), rs.getString("phone"),
                            rs.getString("email"), "",
                            rs.getString("fullname"), rs.getString("address"));
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public boolean isCustomer(String phone, String email) {
        try {
            String sql = "SELECT * FROM customer where (phone = ? OR email = ?) LIMIT 1";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, phone);
            statement.setString(2, email);
            ResultSet rs = statement.executeQuery();
            if(rs.getRow() == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String registerCustomer(Customer customer) {
        try {
            if(isCustomer(customer.getPhone(), customer.getEmail())) {
                return "Hành khách đã có tài khoản...";
            }
            String sql = "INSERT INTO customer (customer_id, phone, email, password, fullname, address) VALUES "
                    + " (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            String hashPassword = handlePassword.hashPassword(customer.getPassword());
            statement.setString(1, customer.getCustomer_id() + "");
            statement.setString(2, customer.getPhone());
            statement.setString(3, customer.getEmail());
            statement.setString(4, hashPassword);
            statement.setString(5, customer.getFullname());
            statement.setString(6, customer.getAddress());
            statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Đăng ký tài khoản thành công. Quý khách vui lòng đăng nhập lại...";
    }
}
