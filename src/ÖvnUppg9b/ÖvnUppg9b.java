package ÖvnUppg9b;

import java.util.List;


public class ÖvnUppg9b {


    public ÖvnUppg9b() {
       
        String filePath = "src\\ÖvnUppg9b\\Personuppgifter.txt";
        String outFilePathString = "src\\ÖvnUppg9b\\TallPeopleInformation.txt";
        
        List <Person> personList = IOUtil
                .readDataFromFile(filePath);
        
        List <Person> onlyTallPersons = LogicUtil
                .getAllTallPersons(personList);
        
        IOUtil.writeDataToFile(outFilePathString, 
                onlyTallPersons);
        
    }
    
    public static void main(String[] args){
        ÖvnUppg9b ö = new ÖvnUppg9b();
    }
}
