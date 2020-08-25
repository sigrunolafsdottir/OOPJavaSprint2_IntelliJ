package ÖvnUppg7_Interest;

import java.util.Scanner;


public class ÖvnUppg7_Interest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ange belopp: ");
        double initialAmount = sc.nextDouble();
        
        System.out.println("Ange ränta: ");
        double interest = sc.nextDouble();
        
        System.out.println("Hur många år? ");
        int years = sc.nextInt();
        System.out.println();
        
        double amount = initialAmount;
        System.out.println(" År        Summa");
        System.out.println("-------------------");
        
        for(int i = 0; i <= years; i++){
            System.out.printf("%2d%13.2f kr\n", i, amount);
            amount += amount * interest;
        }
        System.out.flush();
    }

}
