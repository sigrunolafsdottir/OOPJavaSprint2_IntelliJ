package ÖvnUppg6_Växel;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Övningsuppgift6a {
    
    protected static String s = new String();
    public static boolean test = false;
    protected static Scanner sc;
    protected static int[] sedlarOchMynt = {1000,500,200,100,50,20,10,5,2,1};
    protected final static String mynt = new String("kronor");
    protected final static String sedlar = new String("lappar");


    //räknar ut hur många ex av en vissa valör som ska finnas i växeln
    public static int getAmountOfValör(int change, int valörArrayCounter ){
        return change / sedlarOchMynt[valörArrayCounter];
    }

    //tar bort den största valören från växeln efter att den har skrivits ut
    //ex: 654 -> 54
    public static int removeLargestValör(int amount, int valörArrayCounter){
        return amount - (getAmountOfValör(amount, valörArrayCounter ) * sedlarOchMynt[valörArrayCounter]) ;
    }

    //Räknar ut växeln utifrån pris och betald summa
    public static int getChange(int price, int amountPayed){
        return amountPayed - price;
    }

    //styr upp vilka valörer som är mynt resp. sedlar
    public static String getMyntOrSedel(int valör){
        if (valör >= 20) return sedlar;
        return mynt;
    }

    //Ger oss en sträng typ "Antal 50-lappar: 1"
    public static String getStringForOneValör(int amountOfValör, int valörArrayCounter){
        return "Antal "+sedlarOchMynt[valörArrayCounter]+"-"
                +getMyntOrSedel(sedlarOchMynt[valörArrayCounter])+": "+amountOfValör;
    }

    //Loopar över alla valörer, anropar strängkonstruktions-funktionen ovan
    //Skriver ut strängen, tar bort den valör som har skrivits ut så vi kan fortsätta med nästa
    public static void getPrintOutAllLines(int change, int amountPayed){
        for(int i= 0; i < sedlarOchMynt.length; i++){
            int amountOfValör = getAmountOfValör(change, i);
            String printOutForOneValör = getStringForOneValör(amountOfValör, i);
            System.out.println(printOutForOneValör);
            change = removeLargestValör(change, i);
        }
    }

    //felhantering
    public static String errorHandling(int change){
        if (change == 0){
            return "Det blev ingen växel";
        }
        else if (change < 0){
            return "Du lämnade för lite pengar";
        }
        else return null;
    }

    //läser in data till programmet
    public static int readInputData(String prompt, String optionalTestParameter){

        if(test){
            sc = new Scanner(optionalTestParameter);
        }
        else{
            sc = new Scanner(System.in);
        }

        while (true) {
            try {
                System.out.println(prompt);
                return sc.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Felaktigt tal!");
                sc.next();
            } catch (NoSuchElementException e) {
                System.out.println("Indata saknas!");
                sc.next();
            } catch (Exception e) {
                System.out.println("Ospecifierat fel inträffade, försök igen!");
                sc.next();
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
            int priceOfWare = readInputData("Ange pris: ", null);
            int amount = readInputData("Ange summa du betalade med: ", null);
            int change = getChange(priceOfWare, amount);
            
            if (change <= 0){
                errorHandling(change);
                System.exit(0);
            }

            System.out.println("Detta ska du få tillbaka:");
            getPrintOutAllLines(change,amount);
    }
    

}

            
