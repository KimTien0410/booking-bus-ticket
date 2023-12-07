package src.servlet.model.bean;

public class Bus {
    private int bus_id;
    private String bus_no;
    private int number_chair;
    private int number_left;
    private int drive_id;
    private boolean status;

    public Bus(int bus_id, String bus_no, int number_chair, int number_left, int drive_id, boolean status) {
        this.bus_id = bus_id;
        this.bus_no = bus_no;
        this.number_chair = number_chair;
        this.number_left = number_left;
        this.drive_id = drive_id;
        this.status = status;
    }

    public int getBus_id() {
        return bus_id;
    }

    public void setBus_id(int bus_id) {
        this.bus_id = bus_id;
    }

    public String getBus_no() {
        return bus_no;
    }

    public void setBus_no(String bus_no) {
        this.bus_no = bus_no;
    }

    public int getNumber_chair() {
        return number_chair;
    }

    public void setNumber_chair(int number_chair) {
        this.number_chair = number_chair;
    }

    public int getNumber_left() {
        return number_left;
    }

    public void setNumber_left(int number_left) {
        this.number_left = number_left;
    }

    public int getDrive_id() {
        return drive_id;
    }

    public void setDrive_id(int drive_id) {
        this.drive_id = drive_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
