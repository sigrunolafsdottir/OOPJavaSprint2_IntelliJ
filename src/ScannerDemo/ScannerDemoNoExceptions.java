package ScannerDemo;

import java.util.Scanner;

/*
    Calculates change for a given cost and payment.
*/

public class ScannerDemoNoExceptions {
    
    ScannerDemoNoExceptions(){
        Scanner sc = new Scanner(System.in);
        int cost = 0;
        int payment = 0;
        
        System.out.println("State your cost: ");
        
        boolean gettingCost = false;
        boolean gettingPayment = false;
        while (!gettingCost){
                if (sc.hasNextInt()){
                    cost = sc.nextInt();
                    gettingCost = true;
                }
                else if (sc.hasNext()){
                    System.out.println("Incorrect cost, try again");
                    sc.next();
                }
        }
        
        System.out.println("State your payment: ");
        
        while (!gettingPayment){
                if (sc.hasNextInt()){
                    payment = sc.nextInt();
                    gettingPayment = true;
                }
                else if (sc.hasNext()){
                    System.out.println("Incorrect payment, try again");
                    sc.next();
                }
        }
        
        System.out.println("Change: " + (payment - cost));
        
    }
    
    public static void main(String[] args){
        ScannerDemoNoExceptions sc = new ScannerDemoNoExceptions();
    }

}
