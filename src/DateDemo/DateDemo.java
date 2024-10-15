package DateDemo;

import static java.lang.Thread.sleep;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.TimeZone;


public class DateDemo {   
    
    public static void main (String[] args){
        
        //LocalTime

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalTime lt2 = LocalTime.of(13,14,15);
        System.out.println(lt2);

        LocalTime lt3 = LocalTime.parse("13:56:34");
        System.out.println(lt3);

        LocalTime lt4 = lt3.minusHours(20);
        System.out.println(lt4);
        System.out.println();

        //LocalDate
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate anotherDay = LocalDate.of(2017,2,4);
        System.out.println(anotherDay);

        LocalDate anotherDay2 = LocalDate
                .of(2017, Month.JULY, 22);
        System.out.println(anotherDay2);

        LocalDate yetAnotherDay = LocalDate
            .parse("2015-12-24");
        System.out.println(yetAnotherDay);

        System.out.println();


//        //LocalDateTime

        LocalDateTime today = LocalDateTime.now();
	System.out.println(today);

	today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
	System.out.println(today);

      LocalDateTime specificDate = LocalDateTime.of(2014,
            Month.JANUARY, 1, 10, 10, 30);
	System.out.println(specificDate);

        System.out.println();


//
//        //DateFormatter
//        
       System.out.println(lt3.format(DateTimeFormatter.
            ofPattern("HH:mm:ss")));

        System.out.println(lt3.format(DateTimeFormatter.
      ofPattern("HH mm")));
        
        
        System.out.println(yetAnotherDay
                .format(DateTimeFormatter
                        .ofPattern("YY MM dd")));

        System.out.println(yetAnotherDay
                .format(DateTimeFormatter
                        .ofPattern("dd/MM/yyyy")));

        System.out.println(specificDate.format
            (DateTimeFormatter
                .ofPattern("YYYY-MM-dd HH:mm:ss")));

        System.out.println();

        System.out.println(TimeZone.getDefault().toString());
        System.out.println(TimeZone.getDefault().toZoneId());
        System.out.println(TimeZone.getTimeZone("GMT"));

        TimeZone tokyoTimeZone = TimeZone
                .getTimeZone("Asia/Tokyo");

        TimeZone.setDefault(tokyoTimeZone);

        System.out.println(LocalTime.now());

        TimeZone britishTimeZone = TimeZone
                .getTimeZone("GMT");
        TimeZone.setDefault(britishTimeZone);

        System.out.println(LocalTime.now());



        //---------
        Instant timeStamp= Instant.now();

        LocalDateTime ldt = LocalDateTime.now();

        ZoneId singaporeZoneId = ZoneId.of("Asia/Singapore");
        
        ZonedDateTime asiaZonedDateTime =
                timeStamp.atZone(singaporeZoneId);

        System.out.println("Date (Singapore) : "
                + asiaZonedDateTime);

        System.out.println(asiaZonedDateTime.format
            (DateTimeFormatter
                .ofPattern("HH:mm:ss")));




        Instant inst1 = Instant.now();
            System.out.println("inst1: " + inst1);
        try {
            sleep(1000);
        }catch (Exception e) {
            System.out.println("Sleep funkade inte");
        }

        Instant inst2 = Instant.now();
        System.out.println("inst2: " + inst2);

        if (inst1.isBefore(inst2)){
            System.out.println("Inst1 är före inst2");
        }
        else{
            System.out.println("Inst2 är före inst1");
        }

        System.out.println(Duration.between(inst1, inst2).toMillis());

        System.out.println(Duration.between(lt, lt2).toMinutes());


    }



}
