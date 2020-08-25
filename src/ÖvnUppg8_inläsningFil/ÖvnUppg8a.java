package ÖvnUppg8_inläsningFil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class ÖvnUppg8a {

    String tempLine;
    final String tempPath = "src/ÖvnUppg8_inläsningFil/temp.txt";


    public Double readDoubleValue(String val){
        Double temp;
        val.trim();
        String replaced = val.replaceAll(",", ".");
        temp = Double.parseDouble(replaced);
        return temp;
    }

    public List<Double> generateListFromFile(String tempPath){
        List<Double> allMeasurements = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(tempPath));
            while ((tempLine = reader.readLine()) != null) {

                Double temp = readDoubleValue(tempLine);
                allMeasurements.add(temp);
            }
        }
        catch (Exception e){
                System.out.println("Något gick fel");
                e.printStackTrace();
                System.exit(0);
            }
        return allMeasurements;
    }

    public Double calculateMin(List<Double> allMeasurements){
        double minTemp = Double.MAX_VALUE;
        for(Double d : allMeasurements){
            if (d < minTemp) {
                minTemp = d;
            }
        }
        return minTemp;
    }

    public Double calculateMax(List<Double> allMeasurements){
        double maxTemp = -Double.MAX_VALUE;
        for(Double d : allMeasurements){
            if (d > maxTemp) {
                maxTemp = d;
            }
        }
        return maxTemp;
    }

    public Double calculateAvg(List<Double> allMeasurements){
        double sum = 0;
        for(Double d : allMeasurements){
            sum += d;
        }
        return sum / allMeasurements.size();
    }


    public ÖvnUppg8a() {
        List<Double> allMeasurements = generateListFromFile(tempPath);
        System.out.printf("Maxtemp är %.1f\nMintemp är %.1f\n"
                        + "Medelvärdet är %.1f (beräknat över %d dagar)\n",
                calculateMax(allMeasurements), calculateMin(allMeasurements),
                calculateAvg(allMeasurements), allMeasurements.size());
    }
    
    public static void main(String[] args){
        ÖvnUppg8a ö = new ÖvnUppg8a();
    }
}
