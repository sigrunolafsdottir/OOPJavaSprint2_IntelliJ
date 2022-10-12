package Övn6LiveDemo2022_distans;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Övn6Livedemo_2022_distans {

    protected boolean test = false;

    protected List<Integer> amounts = List.of(1000, 500, 200, 100, 50, 20, 10, 5, 2, 1);

    public int getChange(int prize, int fullAmount){
        return fullAmount - prize;
    }

    public Övn6Livedemo_2022_distans(boolean test){

        this.test = test;

        if (!this.test) {
            Scanner sc = new Scanner(System.in);
            int pris = 0;
            int betalatBelopp = 0;
            int växel = 0;
            List<Integer> res = new ArrayList<>();

            try {
                System.out.println("Vad kostar varan?");
                if (sc.hasNextInt()) {
                    pris = sc.nextInt();
                }
                System.out.println("Hur mycket betalar du?");
                if (sc.hasNextInt()) {
                    betalatBelopp = sc.nextInt();
                }
                växel = getChange(pris, betalatBelopp);
                res = doIteration(växel);
                System.out.println("växel: " + växel);
                System.out.println(amounts);
                System.out.println(res);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args){
        Övn6Livedemo_2022_distans öu = new Övn6Livedemo_2022_distans(false);
    }

    public int getMultiplyer(int change, int amount) {
        return change/amount;
    }

    public int getRest(int change, int amount) {
        return change%amount;
    }

    public List<Integer> doIteration(int change) {
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < amounts.size(); i++){
            res.add(getMultiplyer(change, amounts.get(i)));
            change = getRest(change, amounts.get(i));
        }
        return res;
    }
}
