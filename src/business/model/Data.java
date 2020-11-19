package business.model;
import java.io.Serializable;

public class Data implements Serializable {
    private int day, month, year;
    
    public Data(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int setDay(int day) {
        this.day = day;
    }
    public int setMonth(int month) {
        this.month = month;
    }
    public int setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

}
