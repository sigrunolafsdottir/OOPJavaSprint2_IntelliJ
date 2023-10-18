package ÖvnUppg8;


import ÖvnUppg8_inläsningFil.InprobableTemeratureException;
import ÖvnUppg8_inläsningFil.ÖvnUppg8a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ÖvnUppg8aTest {

    //plan för testerna:
    //Läsa in ett värde, ändra komma till punkt och konvertera till double
    //Läsa från fil, lägg alla värden i en lista
    //utifrån listan, räkna ut maxvärde
    //utifrån listan, räkna ut minvärde
    //utifrån listan, räkna ut medeltemp

    ÖvnUppg8a x = new ÖvnUppg8a();

    @Test
    public final void parseDoubleValueTest() throws InprobableTemeratureException {
        String val = "34,6";
        assertTrue(x.parseDoubleValue(val) == 34.6);
        assertFalse(x.parseDoubleValue(val) == 34.4);

        NumberFormatException thrown = assertThrows(
                NumberFormatException.class,
                () -> x.parseDoubleValue("hej"));
    }


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
        //List<Double> tempList = x.generateListFromFile("test/ÖvnUppg8/testtemp.txt");

        List<Double> tempList = Arrays.asList(2.3, 5.6, 14.5, 12.3, 14.0);
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
