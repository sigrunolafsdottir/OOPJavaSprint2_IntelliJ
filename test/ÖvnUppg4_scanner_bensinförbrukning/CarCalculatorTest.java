package ÖvnUppg4_scanner_bensinförbrukning;

import org.junit.Test;


import static junit.framework.TestCase.assertTrue;

public class CarCalculatorTest {

    CarCalculator c = new CarCalculator();

    @Test
    public final void calculateDistanceDrivenDuringLastYearTest(){
        double mätarställningNu = 23000;
        double mätarställningFörraÅret = 10000;
        double x = c.calculateDistanceDrivenDuringLastYear(mätarställningNu, mätarställningFörraÅret);
        assertTrue(x == 13000);
    }

    @Test
    public final void calculateAverageGasUsageTest(){
        double gasUsedLastYear = 10000;
        double distanceDrivenLastYear = 200;
        double x = c.calculateAverageGasUsage(gasUsedLastYear, distanceDrivenLastYear);
        assertTrue(x == 50);
    }

    @Test
    public final void outputFormattingCorrectTest(){
        assertTrue(c.printDistanceDrivenDuringLastYear(1487).equals("Antal körda mil: 1487.0"));
        assertTrue(c.printGasUsedLastYear(1235.4).equals("Antal liter bensin: 1235.4"));
        assertTrue(c.printAverageGasUsage(0.83).equals("Förbrukning per mil: 0.83"));
    }
}

