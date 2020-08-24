package Övningsuppgift6b;

import java.util.List;


public class Övningsuppgift6b {

    public Övningsuppgift6b () {
       
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
        Övningsuppgift6b ö = new Övningsuppgift6b();
    }
}
