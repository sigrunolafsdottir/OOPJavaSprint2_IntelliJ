package Övn10Live;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class TimeProvider {
    
    DateTimeFormatter formatter 
            = DateTimeFormatter.ofPattern("HH:mm:ss");
    
    public ZonedDateTime getZonedDateTime(ZoneId zoneId){
        Instant timestamp = Instant.now();
        ZonedDateTime zdt = timestamp.atZone(zoneId);
        return zdt;
    }

    public ZoneId indata2ZoneId(String inData) throws Exception{
        

            if (inData.equals("Stockholm")){
                return ZoneId.of("Europe/Stockholm");
            }
            else if (inData.equals("Toronto")){
                return ZoneId.of("America/Toronto");
            }
            else if (inData.equals("Shanghai")){
                return ZoneId.of("Asia/Shanghai");
            }
            else{
                throw new Exception();
            }
       // return null;
    }
    
    public String getMessage(String city){
        try {
            ZoneId currentZoneId = indata2ZoneId(city);
            ZonedDateTime zdt = getZonedDateTime(currentZoneId);
            String formattedString = formatter.format(zdt);
        
            return "I "+city+" är klockan "+formattedString;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "nåt gick fel";
    }
}
