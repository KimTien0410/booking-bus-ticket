//package src.servlet;
//
//import src.servlet.model.bean.Employee;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        String url = "jdbc:mysql://127.0.0.1:3306/dulieu";
//        String user = "root";
//        String passwordDB = "";
//        Connection connection = null;
//        ArrayList<Employee> result = new ArrayList<Employee>();
//        try {
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            connection = DriverManager.getConnection(url, user, passwordDB);
//            Statement stmt = connection.createStatement();
//            String sql = "select * from sinhvien";
//            ResultSet rs = stmt.executeQuery(sql);
//            while (rs.next()) {
//                Employee student = new Employee(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("university"));
//                result.add(student);
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        for(Employee student : result) {
//            System.out.println(student.getName());
//        }
//    }
//}
