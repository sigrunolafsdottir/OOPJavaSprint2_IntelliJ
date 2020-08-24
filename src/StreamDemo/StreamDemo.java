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
            
            fr = new FileReader ("src\\StreamDemo\\Luka.txt");
            
         //   med BufferedReader kan vi läsa en rad i taget

         while((fromFile = fr.read()) != -1){
                System.out.println(fromFile);
            }
         
       //     vi slipper null på slutet
//            while((tempLine = bufIn.readLine()) != null){
//                System.out.println(tempLine);
//            }
            
            
//            FileReader fileIn = new FileReader(
//                    "src\\StreamDemo\\Luka.txt");
//            
//            while(tempInt != -1){
//                tempInt = fileIn.read();
//               // System.out.println(tempInt);
//               // Vi måste casta intarna till char
//                System.out.println((char)tempInt);
//            }
        }
        catch (Exception e){
            System.out.println("Could not read from file");
        }

    }
}


