package DateTime;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class CalendarTime {
    public static void main(String[] args) {
        ChronoUnit chronoUnit=ChronoUnit.valueOf("FOREVER");
        ChronoUnit[] array=chronoUnit.values();
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
       Instant instant=Instant.now();
        System.out.println(instant);
    }
}
