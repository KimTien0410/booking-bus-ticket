package src.servlet.model.bean;

public class Employee {
    private int employee_id;
    private String phone;
    private String email;
    private String password;
    private String fullname;
    private int role_id;
    private String role_name;

    public Employee(int employee_id, String phone, String email, String password, String fullname, int role_id, String role_name) {
        this.employee_id = employee_id;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.fullname = fullname;
        this.role_id = role_id;
        this.role_name = role_name;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}