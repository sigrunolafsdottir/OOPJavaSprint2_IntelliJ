package övningsuppgift1;

import java.util.Scanner;

public class Övningsuppgift1 {
    
    public Scanner sc = new Scanner(System.in);

    protected double getInParam(String promptMessage){
        while(true){
            System.out.println(promptMessage);
            if (sc.hasNextDouble()){
                return sc.nextDouble();
            }
            else{
                sc.next();
            }
        }
    }
    
    public Övningsuppgift1() {
        double currentMätarställning 
                = getInParam("Ange mätarställning nu: ");
        double oldMätarställning 
                = getInParam("Ange mätarställning för ett år sedan: ");
        double amountOfGas 
                = getInParam("Ange antal liter förbrukad bensin: ");
        
        double antalKördaMil = 
                currentMätarställning - oldMätarställning;
        double forbrukningPerMil = 
                amountOfGas / antalKördaMil;
        
        System.out.printf("Antal körda mil:\t %.0f \n" , 
                antalKördaMil);
        System.out.printf("Antal liter bensin:\t %.1f \n", 
                amountOfGas);
        System.out.printf("Förbrukning per mil:\t %.2f \n", 
                forbrukningPerMil);
        
    }
    
    public static void main(String[] args) {
        Övningsuppgift1 ö = new Övningsuppgift1();
    }
    
}
