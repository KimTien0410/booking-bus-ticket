package src.servlet.model.bean;

public class Time {
    private String time_type;
    private String time_value;

    public Time(String time_type, String time_value) {
        this.time_type = time_type;
        this.time_value = time_value;
    }

    public String getTime_type() {
        return time_type;
    }

    public void setTime_type(String time_type) {
        this.time_type = time_type;
    }

    public String getTime_value() {
        return time_value;
    }

    public void setTime_value(String time_value) {
        this.time_value = time_value;
    }
}
