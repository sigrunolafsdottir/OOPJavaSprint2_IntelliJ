package ÖvnUppg4_scanner_bensinförbrukning;

import java.util.Scanner;

public class CarCalculator {

    public Scanner sc = new Scanner(System.in);

    protected double getInParam(String promptMessage) {
        while (true) {
            System.out.println(promptMessage);
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                sc.next();
            }
        }
    }

    public double calculateDistanceDrivenDuringLastYear(
            double mätarställningNu, double mätarställningFörraÅret){
        return mätarställningNu - mätarställningFörraÅret;
    }

    public double calculateAverageGasUsage(
            double gasUsedLastYear, double distanceDrivenLastYear){
        return gasUsedLastYear / distanceDrivenLastYear;
    }

    public String printDistanceDrivenDuringLastYear(double distanceDrivenDuringLastYear){
        return "Antal körda mil: " + distanceDrivenDuringLastYear;
    }

    public String printGasUsedLastYear(double gasUsedLastYear){
        return "Antal liter bensin: " + gasUsedLastYear;
    }

    public String printAverageGasUsage(double averageGasUsage){
        return "Förbrukning per mil: " + averageGasUsage;
    }

    public void mainProgram(){

        double mätarställningNu = getInParam("Ange mätarställning: ");
        double mätarställningFörEttÅrSen = getInParam("Ange mätarställning för ett år sen: ");
        double gasUsedLastYear = getInParam("Ange bensinförbrukning under året: ");

        double distanceDrivenDuringLastYear = calculateDistanceDrivenDuringLastYear(mätarställningNu, mätarställningFörEttÅrSen);
        double averageGasUsage = calculateAverageGasUsage(distanceDrivenDuringLastYear, gasUsedLastYear);

        System.out.println(printDistanceDrivenDuringLastYear(distanceDrivenDuringLastYear));
        System.out.println(printGasUsedLastYear(gasUsedLastYear));
        System.out.println(printAverageGasUsage(averageGasUsage));
    }

    public static void main(String [] args){
        CarCalculator cc = new CarCalculator();
        cc.mainProgram();
    }

}
