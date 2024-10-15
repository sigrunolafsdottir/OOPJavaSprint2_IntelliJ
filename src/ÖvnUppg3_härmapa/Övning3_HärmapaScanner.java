package ÖvnUppg3_härmapa;

import java.util.Scanner;


public class Övning3_HärmapaScanner {

    Övning3_HärmapaScanner(){
        Scanner sc = new Scanner(System.in);
       System.out.print("Write something: ");
       
        while (sc.hasNextLine()){
            String input = sc.nextLine();
            if (input.equals("bye")){
                System.exit(0);
            }
            System.out.println("You said: "+input);
            System.out.print("Write something: ");
        }


/*
//        //Variant
        Scanner sc2 = new Scanner(System.in);
        //reading a line at the time, not a word at the time
        //sc2.useDelimiter("\\n");
        System.out.print("Write something:  ");

        while (sc2.hasNext()){
            String input = sc2.next();
            if (input.equals("bye")){
                System.exit(0);
            }
            System.out.println("Du sa: "+input);
            System.out.print("Write something:  ");
        }

*/
    }

    public static void main(String[] args){
        Övning3_HärmapaScanner sc = new Övning3_HärmapaScanner();
    }
}
