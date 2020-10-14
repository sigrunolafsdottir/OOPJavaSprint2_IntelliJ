package StreamDemo;

import java.io.BufferedReader;
import java.io.FileReader;


public class StreamDemo {
    
    public static void main(String[] args){
        String tempLine = "";
        BufferedReader bufIn = null;
        FileReader fr = null;
        
        try {
            bufIn = new BufferedReader
                (new FileReader ("src/StreamDemo/Luka.txt"));
            while((tempLine = bufIn.readLine()) != null){

                System.out.println(tempLine);
            }
/*
            int tempInt;
            FileReader bufIn2 = new FileReader ("src/StreamDemo/Luka.txt");
            while((tempInt = bufIn2.read()) != -1){
                //System.out.println(tempInt);
                System.out.print((char) tempInt);
            }*/
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Could not read from file");
        }
    }
}


