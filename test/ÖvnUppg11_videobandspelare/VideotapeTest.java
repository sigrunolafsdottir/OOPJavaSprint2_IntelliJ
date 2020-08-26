package ÖvnUppg11_videobandspelare;

import java.time.Duration;
import java.time.LocalTime;
import junit.framework.TestCase;
import org.junit.Test;

public class VideotapeTest {
    Videotape vt = new Videotape(90, 35);
    
    Duration fortyMinutes = Duration.between(LocalTime.parse("14:10"), 
            LocalTime.parse("14:50"));
    Duration sixtyMinutes = Duration.between(LocalTime.parse("16:10"), 
            LocalTime.parse("17:10"));
    
    @Test
    public final void minutesLeftTest() {
        TestCase.assertTrue(vt.minutesLeft() == 55);
        TestCase.assertFalse(vt.minutesLeft() == 57);
    }
    
    @Test
    public final void hasEnoughTimeTest() {
        TestCase.assertTrue(vt.hasEnoughTime(30));
        TestCase.assertFalse(vt.hasEnoughTime(60));
    }
    
    @Test
    public final void minutesLeftDurationTest() {
        TestCase.assertTrue(vt.hasEnoughTime(fortyMinutes));
        TestCase.assertFalse(vt.hasEnoughTime(sixtyMinutes));
    }
    
    
    
    
    
}
