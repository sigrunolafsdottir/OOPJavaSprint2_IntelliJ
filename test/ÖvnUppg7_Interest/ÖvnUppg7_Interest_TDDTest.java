package ÖvnUppg7_Interest;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ÖvnUppg7_Interest_TDDTest {

    boolean isTest = true;
    public ÖvnUppg7_Interest_TDD öiTDD = new ÖvnUppg7_Interest_TDD(isTest);;
    double start = 100;
    double interest = 0.1;
    double years = 2;


    @Test
    public final void calculateInterestTest(){
        double result = öiTDD.calculateInterest(start, interest, years);
        double expected = 121.0;
        assertTrue(result == expected);
    }

    @Test
    public void getPrintOutStartkapitalTest(){
        String print = öiTDD.getPrintOutStartkapital();
        String expected = "Ange startkapital:";
        assertTrue(print == expected);
    }

    @Test
    public void getPrintOutInterestTest(){
        String print = öiTDD.getPrintOutInterest();
        String expected = "Ange räntesats:";
        assertTrue(print == expected);
    }

    @Test
    public void getPrintOutYearTest(){
        String print = öiTDD.getPrintOutYears();
        String expected = "Ange antal år:";
        assertTrue(print == expected);
    }

    @Test
    public void getHeader7bTest(){
        String print = öiTDD.getHeader7b();
        String expected = " År        Summa\n-------------------";
        assertTrue(print == expected);
    }



}