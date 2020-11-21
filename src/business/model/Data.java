package business.model;
import java.io.Serializable;

public class Data implements Serializable, Comparable<Data> {
    private int day, month, year;
    
    public Data(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
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

    @Override
    public int compareTo(Data data) {

       if(Integer.compare(this.year, data.getYear()) == 0) {
           if(Integer.compare(this.month, data.getMonth()) == 0) {
               return Integer.compare(this.day, data.getDay());
           } else {
               return Integer.compare(this.month, data.getMonth());
           }
       }
        return Integer.compare(this.year, data.getYear());
    }
}
