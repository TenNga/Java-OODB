@javax.jdo.annotations.PersistenceCapable

public class TimeDate implements Comparable<TimeDate>{
    ATMTransaction atmTransaction;
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

    @Override
    public int compareTo(TimeDate o) {
        if(o.year > this.year){
            return 1;
        }
        else  if(o.year < this.year){
            return 1;
        }
        else if(o.month > this.month){
            return 1;
        }
        else if(o.month < this.month){
            return 1;
        }
        else if(o.day > this.day){
            return 1;
        }
        else if(o.day < this.day){
            return 1;
        }
        else if(o.hour > this.hour){
            return 1;
        }
        else if(o.hour < this.hour){
            return 1;
        }
        else if(o.minute > this.minute){
            return 1;
        }
        else if(o.minute < this.minute){
            return 1;
        }
        else
            return this.atmTransaction.IDcode.compareTo(o.atmTransaction.IDcode);
    }
}
