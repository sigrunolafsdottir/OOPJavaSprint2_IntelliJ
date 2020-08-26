package ÖvnUppg9a;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ÖvnUppg9a_gammal_inteTDD {
    
    //Kräver filer som finns. 
    //Ligger de i samma katalog måste de skrivas enligt src\\PathDemo\\filnamn

    public ÖvnUppg9a_gammal_inteTDD() {
       
        String firstLine;
        String secondLine;
        Path inFilePath;
        String filePath = "src\\övningsuppgift6"
                + "\\Personuppgifter.txt";
        String outFilePathString = "src\\övningsuppgift6"
                + "\\TallPeopleInformation.txt";
        Path outFilePath = Paths.get(outFilePathString);
        
        String[] personDataParts;
        inFilePath = Paths.get(filePath);
        
        try(PrintWriter w = new PrintWriter(
                Files.newBufferedWriter(outFilePath));
               Scanner fileScanner = new Scanner(inFilePath);){
            
            while(fileScanner.hasNext()){
                firstLine = fileScanner.nextLine();
                if (fileScanner.hasNext()){
                    secondLine = fileScanner.nextLine();
                    personDataParts = secondLine.split(",");

                    if (Integer.parseInt(personDataParts[2]
                            .trim()) > 199){
                        w.print(firstLine + "\n" + 
                                secondLine+ "\n");
                    }
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Filen kunde inte hittas");
            e.printStackTrace();
            System.exit(0);
       }
        catch (IOException e){
            System.out.println("Det gick inte att skriva till fil");
            e.printStackTrace();
            System.exit(0);
        }
        catch (Exception e){
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.exit(0);
        }
        //finally behövs inte när vi har try-with-resources
    }
    
    public static void main(String[] args){
        ÖvnUppg9a_gammal_inteTDD ö = new ÖvnUppg9a_gammal_inteTDD();
    }
}
