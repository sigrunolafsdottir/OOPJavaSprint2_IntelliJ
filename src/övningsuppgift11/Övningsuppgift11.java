 package övningsuppgift11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class Övningsuppgift11 {
    
    public void printList(List<Fordon> fordon){
        fordon.forEach(f -> f.printMe());
    }
    
    
    Övningsuppgift11(){
        SerializationManager sm = new SerializationManager();
        
        Tåg tåg = new Tåg(180, 300000, 5);
        Bil bil = new Bil(200, 1000, 70);
        Båt båt = new Båt(50, 300, 50);
        Cykel cykel = new Cykel(50, 5, 10);
        
        List <Fordon> fordonsLista = new ArrayList<>();
        fordonsLista.add(tåg);
        fordonsLista.add(bil);
        fordonsLista.add(båt);
        fordonsLista.add(cykel);
        
        sm.serializeList(fordonsLista, 
                "src/övningsuppgift11/minaFordon.ser");
        
        List<Fordon> f = sm.deSerializeList();
        printList(f);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Övningsuppgift11 övn11 = new Övningsuppgift11();
    }
    
}