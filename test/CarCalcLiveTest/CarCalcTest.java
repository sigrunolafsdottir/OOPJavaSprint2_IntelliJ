package CarCalcLiveTest;

import CarCalcLive.CarCalc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CarCalcTest {

    //Indata: mätarställning nu, mätarställning då, antal liter bensin
    // Räkna ut: diff mätarställning, bensinförbrukning öer året
    //bensinförbrukning per mil

    CarCalc cc = new CarCalc();

    @Test
    public void calculateMätarDiff(){
        double märställningNu = 23000;
        double mätarställningDå = 10000;
        double diff = cc.mätarDiff(märställningNu, mätarställningDå);
        assertEquals(diff, 13000);
        assertNotEquals(diff, 14000);
    }

    @Test
    public void calculateGasUsagePerMile(){
        double gasUsedLastYear = 1000;
        double distanceDrivenLastYear = 200;
        double gasUsagePerMile = cc.gasUsagePerMile(gasUsedLastYear, distanceDrivenLastYear);
        assertEquals(gasUsagePerMile, 5);
        assertNotEquals(gasUsagePerMile, 6);
    }

    @Test
    public void testPrintout(){
        String p1 = "Antal körda mil: ";
        String p2 = "Antal liter bensin: ";
        String p3 = "Förbrukning per mil: ";

        String fullP1 = cc.getMilePrintout(1000.0).trim();
        assertEquals(fullP1, "Antal körda mil: 1000.0");

        String fullP2 = cc.getGasUsedPrintout(1000.0).trim();
        assertEquals(fullP2, "Antal liter bensin: 1000.0");

        String fullP3 = cc.getGasPerMile(1000.0).trim();
        assertEquals(fullP3, "Förbrukning per mil: 1000.0");
    }

}
