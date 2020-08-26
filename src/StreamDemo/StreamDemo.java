package StreamDemo;

import java.io.BufferedReader;
import java.io.FileReader;


public class StreamDemo {
    
    public static void main(String[] args){
        String tempLine = "";
        int tempInt = 0;
        BufferedReader bufIn = null;
        FileReader fr = null;
        int fromFile;
        
        try {
            bufIn = new BufferedReader
                (new FileReader ("src\\StreamDemo\\Luka.txt"));
            

            while((tempLine = bufIn.readLine()) != null){
                System.out.println(tempLine);
            }
        }
        catch (Exception e){
            System.out.println("Could not read from file");
        }
    }
}


