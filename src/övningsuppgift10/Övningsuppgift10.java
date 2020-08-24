package övningsuppgift10;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;


public class Övningsuppgift10 {
    
    public Övningsuppgift10(){
        Videotape vt;
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Bandets längd?");
            int bandLength = sc.nextInt();
            System.out.println("Hittills använd tid på bandet?");
            int usedUpTime = sc.nextInt();
            vt = new Videotape(bandLength, usedUpTime);

            System.out.println("TV-programmets starttid?");
            LocalTime startTime = LocalTime.parse(sc.next());
            System.out.println("TV-programmets sluttid?");
            LocalTime endTime = LocalTime.parse(sc.next());
            Duration d = Duration.between(startTime, endTime);

            if (vt.hasEnoughTime(d)){
                System.out.println("Bandet räcker!");
            }
            else {
                System.out.println("Bandet räcker inte");
            }
        }
        catch (Exception e){
            System.out.println("Fel indata, ledig tid kunde inte beräknas");
        }
        
    }
    
    public static void main(String[] args) {
        Övningsuppgift10 ö = new Övningsuppgift10();
    }
}
