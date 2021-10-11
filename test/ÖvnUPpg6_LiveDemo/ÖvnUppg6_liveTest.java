package ÖvnUPpg6_LiveDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ÖvnUppg6_liveTest {


    ÖvnUppg6_live calc = new ÖvnUppg6_live();

    @BeforeEach
    void setUp() {
        calc.isTest = true;
    }

    @Test
    void calculateChangeTest(){
        int price=234;
        int amountPaid = 500;
        assertTrue(calc.calculateChange(amountPaid, price) == 266);
    }

    @Test
    void amountOfValörTest(){
        int change1=234;
        int valör1=200;
        int change2=5;
        int valör2=2;
        assertTrue(calc.getAmountOfValör(change1, valör1)==1);
        assertTrue(calc.getAmountOfValör(change2, valör2)==2);
    }

    @Test
    void removeValör(){
        int valör = 200;
        int origChange = 234;
        int antalValör = 1;
        assertTrue(calc.removeValör(valör, origChange, antalValör)==34);

    }

    @Test
    void hasArrayRightValör(){
        int[] arr = calc.getValörArray();
        assertTrue(arr.length == 10);
        assertTrue(arr[0] == 1000);
        assertTrue(arr[1] == 500);
        assertTrue(arr[2] == 200);
        assertTrue(arr[3] == 100);
        assertTrue(arr[4] == 50);
        assertTrue(arr[5] == 20);
        assertTrue(arr[6] == 10);
        assertTrue(arr[7] == 5);
        assertTrue(arr[8] == 2);
        assertTrue(arr[9] == 1);
    }


    @Test
    void listTest(){
        List<Integer> list = calc.getValörList();
        assertTrue(list.size() == 10);
        assertTrue(list.get(0) == 1000);
        assertTrue(list.get(1) == 500);
        assertTrue(list.get(2) == 200);
    }

    @Test
    void felhanteringTest(){
        assert(calc.checkVäxelOK(0).equals("Det blev ingen växel"));
        assert(calc.checkVäxelOK(-1).equals("Du har betalat för lite"));
    }



}