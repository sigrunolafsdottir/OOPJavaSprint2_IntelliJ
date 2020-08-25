package ÖvnUppg6_Växel;


import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Övningsuppgift6b {
    
    private static StringBuilder sb = new StringBuilder();
    private static int[] sedlarOchMynt = {1000,500,200,100,50,20,10,5,2,1};
    private final static String mynt = new String("kronor");
    private final static String sedlar = new String("lappar");
    
    public static void addToPrintoutString(int valör, 
            int amountOfValör){
        String pengatyp = new String();
        if (valör >= 20){
            pengatyp = sedlar;
        }
        else{
            pengatyp = mynt;
        }
        if (amountOfValör > 0){

            sb.append("Antal ").append(valör).append("-").append(pengatyp)
                    .append(": ").append(amountOfValör).append("\n");
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("Ange pris:");
        Scanner sc = new Scanner(System.in);
        String felmeddelande = new String("");
        try{
            int priceOfWare = sc.nextInt();
            System.out.println("Ange summa du betalade med:");
            int amount = sc.nextInt();
            int change = amount - priceOfWare;
            
            if (change < 0){
                System.out.println("För lite pengar!");
                System.exit(0);
            }
            
            System.out.println("Detta ska du få tillbaka:");
            int amountOfValör;
            
            if (change == 0){
                System.out.println("0 kr");
                System.exit(0);
            }
            
            for(int i = 0; i < sedlarOchMynt.length; i++){
                amountOfValör = change / sedlarOchMynt[i];
                addToPrintoutString(sedlarOchMynt[i], amountOfValör);
                change -= (amountOfValör*sedlarOchMynt[i]);
            }

            System.out.println(sb);
            
        }
        catch (InputMismatchException e) {
                System.out.println("Felaktigt tal!");
        }
        catch (NoSuchElementException e) {
            System.out.println("Indata saknas!");
        }
        catch (Exception e) {
            System.out.println("Ospecifierat fel inträffade, försök igen!");
            e.printStackTrace();
        }
        
    }
    

}

            
