package ÖvnUppg2_TDD;

import javax.swing.*;

public class CarCalculator {

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
        double mätarställningNu = Double.parseDouble(
                JOptionPane.showInputDialog("Ange mätarställning: ").trim());
        double mätarställningFörEttÅrSen = Double.parseDouble(
                JOptionPane.showInputDialog("Ange mätarställning för ett år sen: ").trim());
        double gasUsedLastYear = Double.parseDouble(
                JOptionPane.showInputDialog("Ange bensinförbrukning under året: ").trim());

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
