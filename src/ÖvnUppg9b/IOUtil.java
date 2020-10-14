package ÖvnUppg9b;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class IOUtil {
    
    public static List<Person> readDataFromFile(String readFromFile){
        String firstLine;
        String secondLine;
        Path inFilePath;
        List<Person> personList = new ArrayList<>();
        
        String[] personDataPartsFirstLine = new String[3];
        String[] personDataPartsSecondLine= new String[3];
        inFilePath = Paths.get(readFromFile);
     
        try(Scanner fileScanner = new Scanner(inFilePath)){   
            
            while(fileScanner.hasNext()){
                firstLine = fileScanner.nextLine();
                personDataPartsFirstLine = firstLine.split(",");
                if (fileScanner.hasNext()){
                    secondLine = fileScanner.nextLine();
                    personDataPartsSecondLine = secondLine.split(",");
                }
                
                Person p = new Person(personDataPartsFirstLine[0], personDataPartsFirstLine[1], 
                        personDataPartsFirstLine[2], 
                        Integer.parseInt(personDataPartsSecondLine[0].trim()),
                        Integer.parseInt(personDataPartsSecondLine[1].trim()),
                        Integer.parseInt(personDataPartsSecondLine[2].trim()));
                
                personList.add(p);
            }
        }
        catch (IOException e){
            System.out.println("Fel inträffade vid läsning från fil");
            e.printStackTrace();
            System.exit(0);
        }
       
        return personList;
        //finally behövs inte när vi har try-with-resources
    }
    
    public static void writeDataToFile(String writeToFile, List<Person> prunedDownPersonList){
        Path outFilePath = Paths.get(writeToFile);
        try(PrintWriter w = new PrintWriter(
                Files.newBufferedWriter(outFilePath))){
            for ( Person p : prunedDownPersonList){
                w.print(p.getName() + "\n");
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
    }
}


