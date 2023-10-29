package Calendar;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int month=sc.nextInt();
        int day=sc.nextInt();


        Calendar calendar=Calendar.getInstance();
        calendar.set(year,month-1,day);
        String dayOfWeek=calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.US).toUpperCase();
        System.out.println(dayOfWeek);

    }
}
