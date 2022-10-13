package ÖvnUppg8;


import ÖvnUppg8_inläsningFil.ÖvnUppg8b;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ÖvnUppg8bTest {

    //plan för testerna:
    //Läsa från fil, lägg alla värden i en lista
    //utifrån listan, räkna ut maxvärde
    //utifrån listan, räkna ut minvärde
    //utifrån listan, räkna ut medeltemp

    ÖvnUppg8b x = new ÖvnUppg8b();

    Path pt = Paths.get("test/ÖvnUppg8/temp.txt");


    @Test
    public final void generateListFromFileTest(){
        List<Double> tempList = x.generateListFromFile(pt);
        System.out.println(tempList);
        assertTrue(tempList.size() == 3);
        assertTrue(tempList.get(0) == 13.5);
        assertTrue(tempList.get(1) == 14.5);
        assertTrue(tempList.get(2) == 14.0);
    }

    @Test
    public final void calculateMaxTest(){
        List<Double> tempList = x.generateListFromFile(pt);
        assertTrue(x.calculateMax(tempList) == 14.5);
        assertFalse(x.calculateMax(tempList) == 14.0);
    }

    @Test
    public final void calculateMinTest(){
        List<Double> tempList = x.generateListFromFile(pt);
        assertTrue(x.calculateMin(tempList) == 13.5);
        assertFalse(x.calculateMin(tempList) == 14.0);
    }

    @Test
    public final void calculateAvgTest(){
        List<Double> tempList = x.generateListFromFile(pt);
        assertTrue(x.calculateAvg(tempList) == 14.0);
        assertFalse(x.calculateAvg(tempList) == 14.5);
    }
}
