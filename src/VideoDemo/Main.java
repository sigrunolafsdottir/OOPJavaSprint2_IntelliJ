package VideoDemo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange längd på videoband");
        String lengthVideo = sc.nextLine();
        int lengthVideoInt = Integer.parseInt(lengthVideo.trim());
        System.out.println("Ange inspelad tid på videoband");
        String takenVideo = sc.nextLine();
        int takenVideoInt = Integer.parseInt(takenVideo.trim());
        System.out.println("När börjar TV-programmet?");
        String tvStart = sc.nextLine();
        LocalTime ltStart = LocalTime.parse(tvStart.trim());
        System.out.println("När slutar TV-programmet?");
        String tvSlut = sc.nextLine();
        LocalTime ltSlut = LocalTime.parse(tvSlut.trim());
        
        Video v = new Video(lengthVideoInt, takenVideoInt);
        VideoUtil vu = new VideoUtil();
        
        boolean res = vu.willProgramFit(
                vu.getTVProgramLength(ltStart, ltSlut),
                v.getLengthLeft());
        
        System.out.println(vu.getMessage(res));
        
    }

}

