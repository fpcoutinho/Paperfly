package business.model;

public class ComparadorData implements Comparable<Data> {
    private int day, month, year;

    public ComparadorData(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
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
