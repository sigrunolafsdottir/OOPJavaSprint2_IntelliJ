package ExceptionDemo;

public class TestExceptionDemo {
    void method()throws TestException{  
       // throw new TestException("TestException Occurred");  
    }  

    void firstMethod()throws TestException{  
        throw new TestException("Error in firstMethod");
         //   method();
    }
    
    
    public static void main (String args[])throws Exception{
        TestExceptionDemo obj=new TestExceptionDemo(); 
        try{
            obj.firstMethod(); 
            System.out.println("Stuff in try clause");
        }
        catch (TestException t){
            System.out.println("Caught TestException in main");
            System.out.println(  t.s);
        }
        catch (Exception ae){
           // if( ae instanceof TestException){
           //     System.out.println("Caught TestException in main");
           //     System.out.println( ((TestException) ae).s);
           // }
            
            ae.printStackTrace();
            System.out.println("Catch");
        }
        finally{
            System.out.println("Finally");
        }
        System.out.println("End Of Program");  
    }  
}
