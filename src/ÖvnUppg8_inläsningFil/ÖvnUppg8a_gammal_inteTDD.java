package ÖvnUppg8_inläsningFil;

import java.io.BufferedReader;
import java.io.FileReader;


public class ÖvnUppg8a_gammal_inteTDD {
    public ÖvnUppg8a_gammal_inteTDD() {
        double temp;
        double tempSum = 0;
        int amountOfDays = 0;
        double maxTemp = -Double.MAX_VALUE;
        double minTemp = Double.MAX_VALUE;
        String tempLine;
        try{
            BufferedReader reader = new BufferedReader(
                    new FileReader("src/ÖvnUppg8_inläsningFil/temp.txt"));
            while((tempLine = reader.readLine()) != null){
                
                //bort med End of Line-tecknet och eventuella blanktecken som kan gömma sig i filen
                tempLine.trim();
                
                String replaced = tempLine.replaceAll(",", ".");
                temp = Double.parseDouble(replaced);
                
                //Alternativ metod
//                NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
//                Number number = format.parse(tempLine);
//                temp = number.doubleValue();

                if (temp > maxTemp) {
                    maxTemp = temp;
                }
                if (temp < minTemp) {
                    minTemp = temp;
                }
                amountOfDays++;
                tempSum += temp;
            }
        }
        catch (Exception e){
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.out.flush();
            System.exit(0);
        }
        
        System.out.printf("Maxtemp är %.1f\nMintemp är %.1f\n"
                + "Medelvärdet är %.1f (beräknat över %d dagar)\n", 
                maxTemp, minTemp, tempSum/amountOfDays, amountOfDays);
    }
    
    public static void main(String[] args){
        ÖvnUppg8a_gammal_inteTDD ö = new ÖvnUppg8a_gammal_inteTDD();
    }
}
