package src.servlet.model.bean;

public class Customer {
    private int customer_id;
    private String phone;
    private String email;
    private String password;
    private String fullname;
    private String address;

    public Customer(int customer_id, String phone, String email, String password, String fullname, String address) {
        this.customer_id = customer_id;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.fullname = fullname;
        this.address = address;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
