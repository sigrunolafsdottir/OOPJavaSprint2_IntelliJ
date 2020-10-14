package ÖvnUppg6_Växel;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Övningsuppgift6abcd {
    
    protected String s = new String();
    public boolean test = false;
    protected Scanner sc;
    protected int[] sedlarOchMynt = {1000,500,200,100,50,20,10,5,2,1};
    protected final String mynt = new String("kronor");
    protected final String sedlar = new String("lappar");


    //räknar ut hur många ex av en vissa valör som ska finnas i växeln
    public int getAmountOfValör(int change, int valör ){
        return change / valör;
    }

    //tar bort den största valören från växeln efter att den har skrivits ut
    //ex: 654 -> 54
    public int removeLargestValör(int amount, int valör, int amoutOfValör){
        //return amount - (getAmountOfValör(amount, valör ) * valör) ;
        return amount - amoutOfValör * valör ;
    }

    //Räknar ut växeln utifrån pris och betald summa
    public int getChange(int price, int amountPayed){
        return amountPayed - price;
    }

    //styr upp vilka valörer som är mynt resp. sedlar
    public String getMyntOrSedel(int valör){
        if (valör >= 20) return sedlar;
        return mynt;
    }

    //Ger oss en sträng typ "Antal 50-lappar: 1"
    public String getStringForOneValör(int amountOfValör, int valör){
        //använder en vanlig String som jag konkaternerar ihop
        return "Antal "+valör+"-"
                +getMyntOrSedel(valör)+": "+amountOfValör;

        //StringBuider, uppg 3c
 /*       StringBuilder sb = new StringBuilder("Antal ");
        sb.append(valör).append("-");
        sb.append(getMyntOrSedel(valör));
        sb.append(": ").append(amountOfValör);
        return sb.toString(); */
    }

    //Loopar över alla valörer, anropar strängkonstruktions-funktionen ovan
    //Skriver ut strängen, tar bort den valör som har skrivits ut så vi kan fortsätta med nästa
    public void getPrintOutAllLines(int change){
        for(int i= 0; i < sedlarOchMynt.length; i++){
            int valör = sedlarOchMynt[i];
            int amountOfValör = getAmountOfValör(change, valör);
            System.out.println(getStringForOneValör(amountOfValör, valör));
            change = removeLargestValör(change, valör, amountOfValör);
        }
    }

    //felhantering
    public String errorHandling(int change){
        if (change == 0){
            return "Det blev ingen växel";
        }
        else if (change < 0){
            return "Du lämnade för lite pengar";
        }
        else return null;
    }

    //läser in data till programmet
    public int readInputData(String prompt, String optionalTestParameter){

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

    public void mainProgram(){
        int priceOfWare = readInputData("Ange pris: ", null);
        int amount = readInputData("Ange summa du betalade med: ", null);
        int change = getChange(priceOfWare, amount);

        if (change <= 0){
            errorHandling(change);
            System.exit(0);
        }

        System.out.println("Detta ska du få tillbaka:");
        getPrintOutAllLines(change);
    }

    public static void main(String[] args) {
        Övningsuppgift6abcd uppg = new Övningsuppgift6abcd();
        uppg.mainProgram();
    }
    

}

            
