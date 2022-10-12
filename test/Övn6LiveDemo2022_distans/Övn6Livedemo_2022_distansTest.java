package Övn6LiveDemo2022_distans;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Övn6Livedemo_2022_distansTest
{
    boolean test = true;

    Övn6Livedemo_2022_distans öu = new Övn6Livedemo_2022_distans(test);

    @Test
    public void getChangeTest(){

        int prize= 45;
        int fullAmount = 100;

        assert(öu.getChange(prize, fullAmount) == 55);
    }

    // [1000, 500, 200, 100, 50, 20, 10, 5, 2, 1]

    @Test
    public void getCorrectAmounts(){

        assert(öu.amounts.size() == 10);
        assert(öu.amounts.get(0) == 1000);
        assert(öu.amounts.get(1) == 500);
        assert(öu.amounts.get(2) == 200);
        assert(öu.amounts.get(3) == 100);
        assert(öu.amounts.get(4) == 50);
        assert(öu.amounts.get(5) == 20);
        assert(öu.amounts.get(6) == 10);
        assert(öu.amounts.get(7) == 5);
        assert(öu.amounts.get(8) == 2);
        assert(öu.amounts.get(9) == 1);
    }

    @Test
    public void getMultiplyerTest(){

        int change= 3005;
        int amount = 1000;

        assert(öu.getMultiplyer(change, amount) == 3);
    }

    @Test
    public void getRestTest(){

        int change= 3005;
        int amount = 1000;

        assert(öu.getRest(change, amount) == 5);
    }

    @Test
    public void doIterationTest(){

        int change= 3005;
        List<Integer> res = öu.doIteration(change);   //resultat-listan

        assert(res.get(0) == 3);
        assert(res.get(1) == 0);
        assert(res.get(2) == 0);
        assert(res.get(3) == 0);
        assert(res.get(4) == 0);
        assert(res.get(5) == 0);
        assert(res.get(6) == 0);
        assert(res.get(7) == 1);
        assert(res.get(8) == 0);
        assert(res.get(9) == 0);
        assert(res.size() == 10);

        System.out.println(res);
    }


}
