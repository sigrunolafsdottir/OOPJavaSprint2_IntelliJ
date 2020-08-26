package ÖvnUppg9b;

import java.util.List;


public class ÖvnUppg9b_gammal_inteTDD {

    public ÖvnUppg9b_gammal_inteTDD() {
       
        String filePath = "src\\Övningsuppgift6b\\"
                + "Personuppgifter.txt";
        String outFilePathString = "src\\Övningsuppgift6b"
                + "\\TallPeopleInformation.txt";
        
        List <Person> personList = IOUtil
                .readDataFromFile(filePath);
        
        List <Person> onlyTallPersons = LogicUtil
                .getAllTallPersons(personList);
        
        IOUtil.writeDataToFile(outFilePathString, 
                onlyTallPersons);
        
    }
    
    public static void main(String[] args){
        ÖvnUppg9b_gammal_inteTDD ö = new ÖvnUppg9b_gammal_inteTDD();
    }
}
