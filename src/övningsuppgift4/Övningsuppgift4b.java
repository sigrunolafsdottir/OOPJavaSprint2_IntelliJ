package övningsuppgift4;

import java.util.Scanner;


public class Övningsuppgift4b {
    
    private static void calculateInterestPrintOut(double amount, double interest, 
            int remainingYears, int i){
        if (remainingYears >= 0){
            System.out.printf("%2d%13.2f kr\n", i, amount);
            calculateInterestPrintOut(amount + amount*interest, interest, remainingYears - 1, ++i);
        }
    }
    
    private static double calculateInterest(double amount, double interest, 
           int remainingYears){
        if (remainingYears == 0){
           return amount;
        }
        return calculateInterest(amount + amount*interest, interest, --remainingYears);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ange belopp: ");
        System.out.flush();
        double initialAmount = sc.nextDouble();
        
        System.out.println("Ange ränta: ");
        System.out.flush();
        double interest = sc.nextDouble();
        
        System.out.println("Hur många år? ");
        System.out.flush();
        int years = sc.nextInt();
        
        System.out.println(" År        Summa");
        System.out.println("-------------------");
        
        System.out.println(calculateInterest(initialAmount, interest, years));
    }

}
