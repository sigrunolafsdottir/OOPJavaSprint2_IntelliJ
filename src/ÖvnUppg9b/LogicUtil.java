package ÖvnUppg9b;

import java.util.ArrayList;
import java.util.List;


public class LogicUtil {
    
    public static List<Person> getAllTallPersons(List<Person> 
            allPersons){
        
        List<Person> onlyTallPersons = new ArrayList<>();
        for (Person p : allPersons){
            if (p.getLength() > 199){
                onlyTallPersons.add(p);
            }
        }
        return onlyTallPersons;
    }

}

