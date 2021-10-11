package ÖvnUppg11_videobandspelare;

import java.time.Duration;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VideotapeTest {
    Videotape vt = new Videotape(90, 35);
    
    Duration fortyMinutes = Duration.between(LocalTime.parse("14:10"), 
            LocalTime.parse("14:50"));
    Duration sixtyMinutes = Duration.between(LocalTime.parse("16:10"), 
            LocalTime.parse("17:10"));
    
    @Test
    public final void minutesLeftTest() {
        assertTrue(vt.minutesLeft() == 55);
        assertFalse(vt.minutesLeft() == 57);
    }
    
    @Test
    public final void hasEnoughTimeTest() {
        assertTrue(vt.hasEnoughTime(30));
        assertFalse(vt.hasEnoughTime(60));
    }
    
    @Test
    public final void minutesLeftDurationTest() {
        assertTrue(vt.hasEnoughTime(fortyMinutes));
        assertFalse(vt.hasEnoughTime(sixtyMinutes));
    }
    
    
    
    
    
}
