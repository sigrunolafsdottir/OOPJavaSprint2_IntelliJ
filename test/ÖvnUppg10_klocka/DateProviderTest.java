package ÖvnUppg10_klocka;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import junit.framework.TestCase;
import org.junit.Test;


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
        
        TestCase.assertEquals(correctZone1, zoneId1.toString());
        TestCase.assertEquals(correctZone2, zoneId2.toString());
        TestCase.assertEquals(correctZone3, zoneId3.toString());
        TestCase.assertFalse(correctZone3.equals(zoneId2.toString()));
        TestCase.assertNull(dp.indata2ZoneId("bla bla"));
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
        
        TestCase.assertEquals(stockholmZoneId.toString(), zdtStockholm.getZone().toString());
        TestCase.assertEquals(shanghaiZoneId.toString(), zdtShanghai.getZone().toString());
        TestCase.assertEquals(torontoZoneId.toString(), zdtToronto.getZone().toString());
        TestCase.assertFalse(stockholmZoneId.toString().equals(zdtToronto.getZone().toString()));
        
    }
    
    @Test
    public void testMessageOutput(){
        
        String message = dp.getMessage("Stockholm");
        String expectedStartOfMessage = "I Stockholm är klockan";
        
        String message2 = dp.getMessage("Toronto");
        String expectedStartOfMessage2 = "I Toronto är klockan";
        
        String message3 = dp.getMessage("Shanghai");
        String expectedStartOfMessage3 = "I Shanghai är klockan";
        
        TestCase.assertTrue(message.startsWith(expectedStartOfMessage));
        TestCase.assertTrue(message2.startsWith(expectedStartOfMessage2));
        TestCase.assertTrue(message3.startsWith(expectedStartOfMessage3));
        TestCase.assertFalse(message.startsWith("gdsgd gfd"));
    }
    
    
    @Test
    public void testErrorMessage(){
        
        String message = dp.getErrorMessage();
        String expectedMessage = "Inte en giltig stad";
        
        TestCase.assertTrue(message.equals(expectedMessage));
        TestCase.assertFalse(message.equals("gdsgd gfd"));
    }

}
