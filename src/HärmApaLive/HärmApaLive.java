package HärmApaLive;

import java.util.Scanner;


public class HärmApaLive {
    
    public HärmApaLive(){
        Scanner sc = new Scanner(System.in, "iso8859-1");
        String input = "";
        System.out.print("Skriv nåt: ");
        
        while(sc.hasNextLine()){
            input = sc.nextLine();
            if (input.equalsIgnoreCase("bye")){
                System.exit(0);
            }
            
            System.out.println("Du sa: "+input);
            System.out.print("Skriv nåt: ");
        }
    }
    
    public static void main(String[] args){
        HärmApaLive h = new HärmApaLive();
    } 

}
