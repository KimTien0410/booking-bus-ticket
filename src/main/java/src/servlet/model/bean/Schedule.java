package src.servlet.model.bean;

import java.math.BigDecimal;

public class Schedule {
    private int schedule_id;
    private String departure;
    private String destination;
    private String time_type;
    private int bus_id;
    private BigDecimal price;

    public Schedule(int schedule_id, String departure, String destination, String time_type, int bus_id, BigDecimal price) {
        this.schedule_id = schedule_id;
        this.departure = departure;
        this.destination = destination;
        this.time_type = time_type;
        this.bus_id = bus_id;
        this.price = price;
    }

    public int getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTime_type() {
        return time_type;
    }

    public void setTime_type(String time_type) {
        this.time_type = time_type;
    }

    public int getBus_id() {
        return bus_id;
    }

    public void setBus_id(int bus_id) {
        this.bus_id = bus_id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
