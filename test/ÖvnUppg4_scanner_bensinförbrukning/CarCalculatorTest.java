package ÖvnUppg4_scanner_bensinförbrukning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarCalculatorTest {

    CarCalculator c = new CarCalculator();

    @Test
    public final void calculateDistanceDrivenDuringLastYearTest(){
        double mätarställningNu = 23000;
        double mätarställningFörraÅret = 10000;
        double expectedresult = mätarställningNu-mätarställningFörraÅret;

        double actual = c.calculateDistanceDrivenDuringLastYear(mätarställningNu, mätarställningFörraÅret);
        assertTrue(actual == expectedresult);
    }

    @Test
    public final void calculateAverageGasUsageTest(){
        double gasUsedLastYear = 10000;
        double distanceDrivenLastYear = 200;
        double expectedresult = gasUsedLastYear/distanceDrivenLastYear;
        double actualResult = c.calculateAverageGasUsage(gasUsedLastYear, distanceDrivenLastYear);
        assertTrue(actualResult == expectedresult);
        assertEquals(actualResult, expectedresult, 0.0001);
    }

    @Test
    public final void outputFormattingCorrectTest(){
        assertTrue(c.printDistanceDrivenDuringLastYear(1487).equals("Antal körda mil: 1487.0"));
        assertTrue(c.printGasUsedLastYear(1235.4).equals("Antal liter bensin: 1235.4"));
        assertTrue(c.printAverageGasUsage(0.83).equals("Förbrukning per mil: 0.83"));
    }
}

