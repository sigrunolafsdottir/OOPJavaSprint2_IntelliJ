package ÖvnUppg8;

import org.junit.Test;
import ÖvnUppg8_inläsningFil.ÖvnUppg8b;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ÖvnUppg8bTest {

    //plan för testerna:
    //Läsa från fil, lägg alla värden i en lista
    //utifrån listan, räkna ut maxvärde
    //utifrån listan, räkna ut minvärde
    //utifrån listan, räkna ut medeltemp

    ÖvnUppg8b x = new ÖvnUppg8b();



    @Test
    public final void generateListFromFileTest(){
        List<Double> tempList = x.generateListFromFile("test/ÖvnUppg8/temp.txt");
        assertTrue(tempList.size() == 3);
        assertTrue(tempList.get(0) == 13.5);
        assertTrue(tempList.get(1) == 14.5);
        assertTrue(tempList.get(2) == 14.0);
    }

    @Test
    public final void calculateMaxTest(){
        List<Double> tempList = x.generateListFromFile("test/ÖvnUppg8/temp.txt");
        assertTrue(x.calculateMax(tempList) == 14.5);
        assertFalse(x.calculateMax(tempList) == 14.0);
    }

    @Test
    public final void calculateMinTest(){
        List<Double> tempList = x.generateListFromFile("test/ÖvnUppg8/temp.txt");
        assertTrue(x.calculateMin(tempList) == 13.5);
        assertFalse(x.calculateMin(tempList) == 14.0);
    }

    @Test
    public final void calculateAvgTest(){
        List<Double> tempList = x.generateListFromFile("test/ÖvnUppg8/temp.txt");
        assertTrue(x.calculateAvg(tempList) == 14.0);
        assertFalse(x.calculateAvg(tempList) == 14.5);
    }
}
