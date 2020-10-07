package CarCalcLive;

import javax.swing.*;

public class CarCalc {

    public double mätarDiff(double mätarställningNu, double mätarStällningDå){
        return mätarställningNu - mätarStällningDå;
    }

    public double gasUsagePerMile(double gasUsedLastYear, double distanceDriven){
        return gasUsedLastYear/distanceDriven;
    }

    public String getMilePrintout(double mileDiff){
        return "Antal körda mil: "+mileDiff;
    }

    public String getGasUsedPrintout (double gasUsed){
        return "Antal liter bensin: "+gasUsed;
    }

    public String getGasPerMile(double gasPerMile){
        return "Förbrukning per mil: "+gasPerMile;
    }

    public void mainProgram(){
        double mätarställningNu = Double.parseDouble(
                JOptionPane.showInputDialog("Ange mätarställning nu: ").trim());
        double mätarställningDå = Double.parseDouble(
                JOptionPane.showInputDialog("Ange mätarställning för ett år sen: ").trim());
        double förbrukadBensin = Double.parseDouble(
                JOptionPane.showInputDialog("Ange hur mycket bensin som förbrukades under förra året: ").trim());

        double mätardiff = mätarDiff(mätarställningNu, mätarställningDå);
        double bensinFörbrukningPerMil = gasUsagePerMile(förbrukadBensin, mätardiff);

        System.out.println(getMilePrintout(mätardiff));
        System.out.println(getGasUsedPrintout(förbrukadBensin));
        System.out.println(getGasPerMile(bensinFörbrukningPerMil));
    }

    public static void main(String[] args){
       CarCalc cc = new CarCalc();
       cc.mainProgram();
    }

}
