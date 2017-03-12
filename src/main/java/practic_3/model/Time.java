package practic_3.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by SergLion on 03.02.2017.
 */
public class Time {
    @Getter @Setter
    private int hour;
    @Getter @Setter
    private int minute;

    public Time(int hour, int minute) {
        if (hour >= 0 & hour <= 24 & minute <= 60 & minute >= 0) {
            this.hour = hour;
            this.minute = minute;
        } else {
            System.out.println("You set uncorrect time");
        }

    }

    @Override
    public String toString() {
        return "Time -  "+ hour +":" + minute;
    }
}
