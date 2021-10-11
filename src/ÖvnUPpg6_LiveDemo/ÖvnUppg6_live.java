package ÖvnUPpg6_LiveDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ÖvnUppg6_live {

    private int[] valörer = {1000, 500, 200, 100, 50, 20, 10, 5, 2,1 };
    private List<Integer> valList= Arrays.asList(1000, 500, 200, 100, 50, 20, 10, 5, 2,1);
    private Scanner sc;
    private int price=0;
    private int amountPayed=0;
    public boolean isTest = false;

    public int[] getValörArray(){
        return valörer;
    }

    public List<Integer> getValörList(){
        return valList;
    }

    public int calculateChange(int amountPaid, int price){
        return amountPaid - price;
    }

    public int getAmountOfValör(int change, int valör){
        return change / valör;
    }

    public int removeValör(int valör, int origChange, int antalValör){
        return origChange - (valör * antalValör);
    }

    protected int getInParam(String promptMessage, int optionalTestParam) {
        if (isTest){
            return optionalTestParam;
        }
        else{
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println(promptMessage);
                if (sc.hasNextInt()) {
                    return sc.nextInt();
                } else {
                    sc.next();
                }
            }
        }
    }

    public String checkVäxelOK(int växel){
        if (växel == 0){
            return "Det blev ingen växel";
        }
        else if (växel < 0){
            return ("Du har betalat för lite");
        }
        else return null;
    }

    //public collectParam()


    public void mainProgram(){
        price = (int) getInParam("Skriv kostnad", 0);
        amountPayed = (int) getInParam("Skriv betalning", 0);
        int växel = calculateChange(amountPayed, price);
        for(int i = 0; i < valörer.length; i++){
            int amountOfValör = getAmountOfValör(växel, valörer[i]);

            System.out.println(amountOfValör +" "+ valörer[i]);
            växel = removeValör(valörer[i], växel, amountOfValör);

        }


        //System.out.println( cost +" "+payment);
    }

    public static void main (String[] args){
        ÖvnUppg6_live uppg = new ÖvnUppg6_live();
        uppg.mainProgram();
    }
}
