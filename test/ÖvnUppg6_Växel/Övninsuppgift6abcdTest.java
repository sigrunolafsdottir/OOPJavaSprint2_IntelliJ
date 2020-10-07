package ÖvnUppg6_Växel;

import org.junit.Test;

import java.util.NoSuchElementException;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Övninsuppgift6abcdTest {

    Övningsuppgift6abcd x = new Övningsuppgift6abcd();

    // uppgift 3a

    @Test
    public final void getAmountOfValörTest(){
        int change = 32;
        int valör = 10;
        assertTrue(x.getAmountOfValör(change,valör ) == 3);
        assertFalse(x.getAmountOfValör(change,valör ) == 5);
    }

    // uppgift 3a

    @Test
    public final void removeLargestValörTest(){
        int amount = 32;
        int valör = 10;
        assertTrue(x.removeLargestValör(amount,valör, 3) == 2);
        assertFalse(x.removeLargestValör(amount,valör, 2 ) == 5);
    }

    // uppgift 3a
    @Test
    public final void getChangeTest(){
        int price = 234;
        int amountPayed = 1000;
        assertTrue(x.getChange(price, amountPayed) == 766);
        assertFalse(x.getChange(price, amountPayed) == 765);
    }

    // uppgift 3b
    @Test
    public final void getMyntOrSedelTest(){
        int amount1 = 1;
        int amount2 = 2;
        int amount5 = 5;
        int amount10 = 10;
        int amount20 = 20;
        int amount50 = 50;
        int amount100 = 100;
        int amount200 = 200;
        int amount500 = 500;
        int amount1000 = 1000;
        System.out.println(x.getMyntOrSedel(amount1));
        assertTrue(x.getMyntOrSedel(amount1).equals("kronor"));
        assertTrue(x.getMyntOrSedel(amount2).equals("kronor"));
        assertTrue(x.getMyntOrSedel(amount5).equals("kronor"));
        assertTrue(x.getMyntOrSedel(amount10).equals("kronor"));
        assertTrue(x.getMyntOrSedel(amount20).equals("lappar"));
        assertTrue(x.getMyntOrSedel(amount50).equals("lappar"));
        assertTrue(x.getMyntOrSedel(amount100).equals("lappar"));
        assertTrue(x.getMyntOrSedel(amount200).equals("lappar"));
        assertTrue(x.getMyntOrSedel(amount500).equals("lappar"));
        assertTrue(x.getMyntOrSedel(amount1000).equals("lappar"));
        assertFalse(x.getMyntOrSedel(amount1000).equals("spaghetti"));
    }

    // uppgift 3b

    @Test
    public final void getPrintOutTest(){
        assertTrue(x.getStringForOneValör(5, 1000).startsWith("Antal 1000-lappar: 5"));
        assertTrue(x.getStringForOneValör(3, 500).startsWith("Antal 500-lappar: 3"));
        assertTrue(x.getStringForOneValör(2, 5).startsWith("Antal 5-kronor: 2"));
        assertTrue(x.getStringForOneValör(0, 1).startsWith("Antal 1-kronor: 0"));
    }

    // uppgift 3b
    @Test
    public final void errorHandlingTest(){
        int zero = 0;
        int negativeVal = -5;
        int positiveVal = 5;
        assertTrue(x.errorHandling(zero).startsWith("Det blev ingen växel"));
        assertTrue(x.errorHandling(negativeVal).startsWith("Du lämnade för lite pengar"));
        assertTrue(x.errorHandling(positiveVal) == null);
    }


    // uppgift 3d
    @Test
    public final void readInputDataInputMismatchExceptionTest(){
        x.test = true;
        String error = "sfsfdsfs";
        Throwable exception = assertThrows(NoSuchElementException.class,
                () -> x.readInputData("Hej", error));
    }

    // uppgift 3d
    @Test
    public final void readInputDataTest(){
        x.test = true;
        String ok = "23";
        assertTrue(x.readInputData("Hej", ok) == 23);
        assertFalse(x.readInputData("Hej", ok) == 24);
    }

}
