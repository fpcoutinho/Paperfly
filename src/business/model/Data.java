package business.model;
import java.io.Serializable;

public class Data implements Serializable {
    private int day, month, year;
    private ComparadorData comparadorData;
    
    public Data(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
        this.comparadorData = new ComparadorData(this.day, this.month, this.year);
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
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
    public ComparadorData getComparadorData() {
        return this.comparadorData;
    }

    public String getData(){
        String d = Integer.toString(day);
        String m = Integer.toString(month);
        String y = Integer.toString(year);

        String data = d.concat("/");
        data = data.concat(m);
        data = data.concat("/");
        data = data.concat(y);

        return data;
    }
}
