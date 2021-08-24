package ÖvnUppg7_Interest;

import java.util.Scanner;

public class ÖvnUppg7_Interest_TDD {

    boolean test = false;
    double initialAmount;
    double interest;
    double years;

    public ÖvnUppg7_Interest_TDD(boolean test){

        this.test = test;
        if (!test) {
            collectData();

            //7a:
            System.out.println(calculateInterest(initialAmount, interest, years));

            //7b:
            System.out.println(getHeader7b());

            double aggregatedAmount = initialAmount;
            System.out.printf("%2d%13.2f kr\n", 0, aggregatedAmount);  //första året
            for (int i = 0; i < years; i++){
                aggregatedAmount = calculateInterest(aggregatedAmount, interest, 1);
                System.out.printf("%2d%13.2f kr\n", i, aggregatedAmount);
            }
        }
    }

    public void collectData(){
        Scanner sc = new Scanner(System.in);

        System.out.println(getPrintOutStartkapital());
        initialAmount = sc.nextDouble();

        System.out.println(getPrintOutInterest());
        interest = sc.nextDouble();

        System.out.println(getPrintOutYears());
        years = sc.nextDouble();
    }

    public double calculateInterest(double start, double interest, double years){
        double res = start;
        for(int i = 0; i < years; i++){
            res = res + (res * interest);
        }
        return res;
    }


    public String getPrintOutStartkapital() {
        return "Ange startkapital:";
    }

    public String getPrintOutInterest() {
        return "Ange räntesats:";
    }

    public String getPrintOutYears() {
        return "Ange antal år:";
    }

    public String getHeader7b() {
        return " År        Summa\n-------------------";
    }

    public static void main(String args[]){
        ÖvnUppg7_Interest_TDD öu7 = new ÖvnUppg7_Interest_TDD(false);
    }
}
