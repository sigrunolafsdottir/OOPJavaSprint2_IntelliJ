package ExceptionDemo;

public class ExceptionDemo {
    void method(String s) throws Exception {  
        int i = s.length();
        throw new Exception("Exception Occurred in method");  
    }  

    void firstMethod()throws Exception{  
       // throw new Exception("Exception Occurred");
            method(null);

    }
    
    
    public static void main (String args[])throws Exception{
        ExceptionDemo obj=new ExceptionDemo(); 
        try{
            obj.firstMethod(); 
            System.out.println("Stuff in try clause");
        }
        catch (Exception ae){
            ae.printStackTrace();
            System.out.println("Catch");
        }

        System.out.println("End Of Program");  
    }  
}
