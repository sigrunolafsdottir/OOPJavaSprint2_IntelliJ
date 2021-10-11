package Uppg8LiveTest;

import Uppg8Live.Uppg8Live;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Uppg8LiveTest {

    List<Double> vals = Arrays.asList(12.0, 12.5, 13.0);
    List<Double> vals2 = Arrays.asList(-12.0, -12.5, -13.0);
    Uppg8Live u8 = new Uppg8Live();

    @Test
    public void getMaxValTest(){
        double maxFromProg = u8.getMaxVal(vals);
        double maxFromProg2 = u8.getMaxVal(vals2);
        assertEquals(maxFromProg, 13.0);
        assertNotEquals(maxFromProg, 15.0);
        assertEquals(maxFromProg2, -12.0);
    }

    @Test
    public void getAvgValTest(){
        double avgFromProg = u8.getAvgVal(vals);
        assertEquals(avgFromProg, 12.5);
        assertNotEquals(avgFromProg, 15.0);
    }

    @Test
    public void parseDoubleTest(){
        String val = "13,5";
        double d = u8.parseDouble(val);
        assertEquals(d, 13.5);
    }

    @Test
    public void getListTest(){
        String path = "test/Uppg8LiveTest/testtemp.txt";
        List<Double> vals = u8.getList(path);
        assertEquals(vals.size(), 3);
        assertEquals(vals.get(0), 13.3);
        assertEquals(vals.get(1), 14.5);
        assertEquals(vals.get(2), 17.5);
    }



}
