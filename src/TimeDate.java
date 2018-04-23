@javax.jdo.annotations.PersistenceCapable

public class TimeDate {
    int minute;
    int hour;
    int day;
    int month;
    int year;

    public TimeDate(){
        //Default
    }

    public TimeDate(int minute, int hour, int day, int month, int year){
        this.minute = minute;
        this.hour = hour;
        this.day = day;
        this.month = month;
        this.year = year;
    }

}
