package ÖvnUppg10_klocka;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DateProviderTest {
    
    DateProvider dp = new DateProvider();
    
      @Test
    public void testString2TimezoneMapping(){
        
        String inData1 = "Stockholm";
        String inData2 = "Toronto";
        String inData3 = "Shanghai";
        
        String correctZone1 = "Europe/Stockholm";
        String correctZone2 = "America/Toronto";
        String correctZone3 = "Asia/Shanghai";
        
        ZoneId zoneId1 = dp.indata2ZoneId(inData1);
        ZoneId zoneId2 = dp.indata2ZoneId(inData2);
        ZoneId zoneId3 = dp.indata2ZoneId(inData3);
        
        assertEquals(correctZone1, zoneId1.toString());
        assertEquals(correctZone2, zoneId2.toString());
        assertEquals(correctZone3, zoneId3.toString());
        assertFalse(correctZone3.equals(zoneId2.toString()));
        assertNull(dp.indata2ZoneId("bla bla"));
    }
    
    @Test
    public void testCorrectZoneOfOutputDateTime(){
        
        String stockholm = "Stockholm";
        String zoneIdStockholmString = "Europe/Stockholm";
        ZoneId stockholmZoneId = ZoneId.of("Europe/Stockholm");
        
        String shanghai = "Shanghai";
        String zoneIdShanghaiString = "Asia/Shanghai";
        ZoneId shanghaiZoneId = ZoneId.of("Asia/Shanghai");
        
        String toronto = "Toronto";
        String zoneIdTorontoString= "America/Toronto";
        ZoneId torontoZoneId = ZoneId.of("America/Toronto");
        
        ZonedDateTime zdtStockholm = dp.getZonedDateTime(stockholmZoneId);
        ZonedDateTime zdtShanghai = dp.getZonedDateTime(shanghaiZoneId);
        ZonedDateTime zdtToronto = dp.getZonedDateTime(torontoZoneId);
        
        assertEquals(stockholmZoneId.toString(), zdtStockholm.getZone().toString());
        assertEquals(shanghaiZoneId.toString(), zdtShanghai.getZone().toString());
        assertEquals(torontoZoneId.toString(), zdtToronto.getZone().toString());
        assertFalse(stockholmZoneId.toString().equals(zdtToronto.getZone().toString()));
        
    }
    
    @Test
    public void testMessageOutput(){
        
        String message = dp.getMessage("Stockholm");
        String expectedStartOfMessage = "I Stockholm är klockan";
        
        String message2 = dp.getMessage("Toronto");
        String expectedStartOfMessage2 = "I Toronto är klockan";
        
        String message3 = dp.getMessage("Shanghai");
        String expectedStartOfMessage3 = "I Shanghai är klockan";
        
        assertTrue(message.startsWith(expectedStartOfMessage));
        assertTrue(message2.startsWith(expectedStartOfMessage2));
        assertTrue(message3.startsWith(expectedStartOfMessage3));
        assertFalse(message.startsWith("gdsgd gfd"));
    }
    
    
    @Test
    public void testErrorMessage(){
        
        String message = dp.getErrorMessage();
        String expectedMessage = "Inte en giltig stad";
        
        assertTrue(message.equals(expectedMessage));
        assertFalse(message.equals("gdsgd gfd"));
    }

}
