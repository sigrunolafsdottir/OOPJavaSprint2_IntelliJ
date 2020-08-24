package Övn9Live2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class DateProvider {
    
    public ZoneId inputToZoneId(String s){
        if (s.equalsIgnoreCase("Stockholm")){
            return ZoneId.of("Europe/Berlin");
        }
        if (s.equalsIgnoreCase("Toronto")){
            return ZoneId.of("America/Toronto");
        }
        if (s.equalsIgnoreCase("Shanghai")){
            return ZoneId.of("Asia/Shanghai");
        }
        return null;
    }
    
    public ZonedDateTime zoneIdToZonedDateTime(ZoneId zId){
        LocalDateTime ldt = LocalDateTime.now(zId);
        return ldt.atZone(zId);
    }
    
    public String prettyPrintZonedDateTime(ZonedDateTime zdt){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        return "Tiden är: "+zdt.format(dtf);
        
    }


}
