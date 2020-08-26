package lesson3;


import java.text.DateFormat;
import java.util.Date;

public class Event {
    private String msg;
    private int id = (int) (Math.random() * 100);
    private Date date;
    private DateFormat dateFormat;

    public Event(Date date, DateFormat dateFormat) {
        this.date = date;
        this.dateFormat = dateFormat;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return msg + " " + id + " " + dateFormat.format(date);
    }


}
