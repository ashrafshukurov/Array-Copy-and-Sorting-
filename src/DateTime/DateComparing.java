package DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class DateComparing {
    public static void main(String[] args) throws InterruptedException {
        chronUnit();
    }
    public static void comparingTwoInstancesOfTheLocalDate(){
        LocalDate today= LocalDate.now();
        LocalDate anotherDay=LocalDate.of(2018,02,14);
        int dif=today.compareTo(anotherDay);
        if(dif<0){
            System.out.println("today is less than another day");
        }
        else if(dif>0){
            System.out.println("today is greater than another day");
        }else{
            System.out.println("they are equal");
        }
    }
    public static void localDateTime() throws InterruptedException {
        LocalDateTime localDateTime= LocalDateTime.now();
        Thread.currentThread().sleep(1000);
        LocalDateTime localDateTime1=LocalDateTime.now();
        boolean isEqual=localDateTime1.toLocalDate().isEqual(localDateTime1.toLocalDate());
        System.out.println(isEqual);
//compare date and time parts
        System.out.println(localDateTime.isEqual(localDateTime1));//false
        System.out.println(localDateTime.isAfter(localDateTime1));//false
        System.out.println(localDateTime.isBefore(localDateTime1));//true

    }
    public static void zonedDateTime(){
        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);
        ZonedDateTime nowUtc=zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
        ZonedDateTime zonedTimeUtc=ZonedDateTime.parse("2022-02-15T11:21:12.123+05:30[UTC]");
        System.out.println(nowUtc.toInstant());
        long difference=nowUtc.toInstant().compareTo(zonedTimeUtc.toInstant());

        if (difference<0){
            System.out.println("nowUtc less than zonedTimeUtc");
        }else if(difference>0){
            System.out.println("nowUtc greater than zonedTimeUtc");
        }else{
            System.out.println("they are equal");
        }
    }
    public static LocalDate isValidLocalDate(String date, DateTimeFormatter dateTimeFormatter){
        LocalDate date1=null;
        try{
            date1=LocalDate.parse(date,dateTimeFormatter);
        }catch (DateTimeParseException e){
            e.printStackTrace();
        }
        return date1;
    }
    public static void dateTimeExtraction() throws InterruptedException {
        Instant start=Instant.now();
        System.out.println(start);
        Thread.currentThread().sleep(1000);
        Instant finish=Instant.now();
        System.out.println(finish);
        long timeElapsed=Duration.between(start,finish).toMillis();
        System.out.println(timeElapsed);

    }
    public static void chronUnit(){
        Instant ins=Instant.parse("2021-02-09T11:19:42.12Z");
        System.out.println("Ins: "+ins);
        System.out.println(ins.isSupported(ChronoUnit.DAYS));
        Instant now=Instant.now();
        System.out.println("now :"+now);

        Instant dif=now.minus(Duration.ofDays(10));
        System.out.println(dif);

    }
}
