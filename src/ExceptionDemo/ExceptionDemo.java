package ExceptionDemo;

import java.util.Scanner;

public class ExceptionDemo {
    void method(String s) throws Exception {
        int i = s.length();
        Scanner sc = new Scanner(System.in);

        while (true) {
                System.out.println("Skriv in nåt: ");
                try {
                    int itest = sc.nextInt();
                    System.out.println(itest);
                }
                catch(Exception e){
                    System.out.println("Fel format");
                    String clean = sc.next();
                    e.printStackTrace();
                }
        }


        //throw new Exception("Exception Occurred in method");
    }  

    void firstMethod() throws Exception{
        throw new Exception("Exception Occurred");
          //  method("hej");
          //method(null);
    }

    public static void main (String args[]) { //throws Exception{
        ExceptionDemo obj=new ExceptionDemo(); 
        try{
            obj.firstMethod(); 
            System.out.println("Later Stuff in try clause");
        }
        catch (Exception ae){
            ae.printStackTrace();
            System.out.println("Catch");
        }

        System.out.println("End Of Program");  
    }  
}
