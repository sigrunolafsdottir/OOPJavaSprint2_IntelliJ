 package ÖvnUppg12_serialisering;

import java.util.ArrayList;
import java.util.List;


public class ÖvnUppg12_serialisering {
    
    public void printList(List<Fordon> fordon){
        fordon.forEach(f -> f.printMe());
    }
    
    
    ÖvnUppg12_serialisering(){
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

        String listPath = "src/ÖvnUppg12_serialisering/minaFordon.ser";
        sm.serializeList(fordonsLista, listPath);
        
        List<Fordon> f = sm.deSerializeList(listPath);
        Fordon f1 = f.get(0);

        printList(f);

        System.out.println();

        String oneFordonPath = "src/ÖvnUppg12_serialisering/ettFordon.ser";
        sm.serializeFordon(cykel, oneFordonPath);
        sm.deSerializeFordon(oneFordonPath).printMe();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ÖvnUppg12_serialisering övn11 = new ÖvnUppg12_serialisering();
    }
    
}