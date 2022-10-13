package Övn6LiveDemoPåplats2022;

import org.junit.jupiter.api.Test;

import java.util.List;

public class Övn6LiveDemoPåplats2022Test {

    String testdata = "342 3546";

    Övn6LiveDemoPåplats2022 öu = new Övn6LiveDemoPåplats2022(true, testdata);

    @Test
    public void getChangeTest(){

        int pris = 234;
        int totalbelopp = 500;

        assert(öu.getChange(pris, totalbelopp) == 266);

    }

    @Test
    public void listTest(){

        List<Integer> list = öu.list;

        assert(list.size() == 10);
        assert(list.get(0) == 1000);
        assert(list.get(1) == 500);
        assert(list.get(2) == 200);
        assert(list.get(3) == 100);
        assert(list.get(4) == 50);
        assert(list.get(5) == 20);
        assert(list.get(6) == 10);
        assert(list.get(7) == 5);
        assert(list.get(8) == 2);
        assert(list.get(9) == 1);
    }

    @Test
    public void getRestTest(){

        int change = 3005;
        int valör = 1000;

        assert(öu.getRest(change, valör) == 5);

    }

    @Test
    public void getMultiplicatorTest(){

        int change = 3005;
        int valör = 1000;

        assert(öu.getMultiplicator(change, valör) == 3);

    }

    @Test
    public void iterateTest(){

        int change = 3205;
        List<Integer> res = öu.iterate(change);

        assert(res.size() == 10);
        assert(res.get(0) == 3);
        assert(res.get(1) == 0);
        assert(res.get(2) == 1);
        assert(res.get(3) == 0);
        assert(res.get(4) == 0);
        assert(res.get(5) == 0);
        assert(res.get(6) == 0);
        assert(res.get(7) == 1);
        assert(res.get(8) == 0);
        assert(res.get(9) == 0);

    }

    @Test
    public void getMoneyTypeTest(){

        String kr = "-kronor";
        String lappar = "-lappar";
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

        assert(öu.getMoneyType(amount1).equals(kr));
        assert(öu.getMoneyType(amount2).equals(kr));
        assert(öu.getMoneyType(amount5).equals(kr));
        assert(öu.getMoneyType(amount10).equals(kr));
        assert(öu.getMoneyType(amount20).equals(lappar));
        assert(öu.getMoneyType(amount50).equals(lappar));
        assert(öu.getMoneyType(amount100).equals(lappar));
        assert(öu.getMoneyType(amount200).equals(lappar));
        assert(öu.getMoneyType(amount500).equals(lappar));
        assert(öu.getMoneyType(amount1000).equals(lappar));

    }


    @Test
    public void getResultStringTest(){
        List<Integer> res = List.of(3,0,0,0,0,0,0,0,0,1); //3001

        String resString = öu.getResultString(res);

        System.out.println(resString);

        assert(resString.contains("3 1000-lappar"));
        assert(resString.contains("0 500-lappar"));
        assert(resString.contains("0 200-lappar"));
        assert(resString.contains("0 100-lappar"));
        assert(resString.contains("0 50-lappar"));
        assert(resString.contains("0 20-lappar"));
        assert(resString.contains("0 10-kronor"));
        assert(resString.contains("0 5-kronor"));
        assert(resString.contains("0 2-kronor"));
        assert(resString.contains("1 1-kronor"));
    }

}
