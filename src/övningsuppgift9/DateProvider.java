package övningsuppgift9;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class DateProvider {
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    
    public ZonedDateTime getZonedDateTime(ZoneId zoneId){
        Instant timeStamp= Instant.now();
        ZonedDateTime zdt = timeStamp.atZone(zoneId);
        return zdt;
    }
    
    public ZoneId indata2ZoneId(String inData){
        if (inData.equals("Stockholm")){
            return ZoneId.of("Europe/Stockholm");
        }
        else if (inData.equals("Shanghai")){
            return ZoneId.of("Asia/Shanghai");
        }
        else if (inData.equals("Toronto")){
            return ZoneId.of("America/Toronto");
        }
        return null;
    }
    
    public String getMessage(String city){
        ZonedDateTime zdt = getZonedDateTime(indata2ZoneId(city));
        String formattedTime = formatter.format(zdt);
        
        return "I "+city+" är klockan "+ formattedTime;
    }
    
    public String getErrorMessage(){
        return "Inte en giltig stad";
    }

}
