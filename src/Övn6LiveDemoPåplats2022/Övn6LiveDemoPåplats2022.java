package Övn6LiveDemoPåplats2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Övn6LiveDemoPåplats2022 {

    public boolean test = false;

    protected List<Integer> list = List.of(1000, 500, 200, 100, 50, 20, 10, 5, 2, 1);

    public int getChange(int pris, int totaltBelopp) {
        return totaltBelopp - pris ;

    }

    public Övn6LiveDemoPåplats2022(boolean test, String testdata){
        this.test = test;
        Scanner sc;

        if (!test) {
            sc = new Scanner(System.in);
        }
        else{
            sc = new Scanner(testdata);
        }
        int pris = 0;
        int belopp = 0;
        int växel = 0;
        System.out.println("Vad kostar varan");
        try{
            if (sc.hasNextInt()){
                pris= sc.nextInt();
            }
            System.out.println("Vad betalar du");
            if (sc.hasNextInt()){
                belopp= sc.nextInt();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        växel = getChange(pris, belopp);
        System.out.println(iterate(växel));
    }


    public static void main(String[] args){
        Övn6LiveDemoPåplats2022 öu = new Övn6LiveDemoPåplats2022(false, null );
    }

    public int getRest(int change, int valör) {
        return change % valör;
    }

    public int getMultiplicator(int change, int valör) {
        return change / valör;

    }

    //  (1000, 500, 200, 100, 50, 20, 10, 5, 2, 1);
    public List<Integer> iterate(int change) {
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            res.add(getMultiplicator(change, list.get(i)));
            change = getRest(change, list.get(i));
        }
        return res;
    }

    public String getMoneyType(int amount) {
        if (amount >= 20) return "-lappar";
        return "-kronor";
    }

    public String getResultString(List<Integer> res) {
        String resString = "Du får tillbaka ";
        for (int i = 0; i < list.size(); i++){
            resString += res.get(i) +" " + list.get(i) + getMoneyType(list.get(i)) +"\n";
        }
        return resString;
    }
}
