package src.servlet.model.bean;

import java.sql.Date;
import java.sql.Timestamp;

public class Booking {
    private int booking_id;
    private int schedule_id;
    private int customer_id;
    private Timestamp booking_date;
    private Date departure_date;
    private String description;
    private boolean status;

    public Booking(int booking_id, int schedule_id, int customer_id, Timestamp booking_date, Date departure_date, String description, boolean status) {
        this.booking_id = booking_id;
        this.schedule_id = schedule_id;
        this.customer_id = customer_id;
        this.booking_date = booking_date;
        this.departure_date = departure_date;
        this.description = description;
        this.status = status;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Timestamp getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(Timestamp booking_date) {
        this.booking_date = booking_date;
    }

    public Date getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(Date departure_date) {
        this.departure_date = departure_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
