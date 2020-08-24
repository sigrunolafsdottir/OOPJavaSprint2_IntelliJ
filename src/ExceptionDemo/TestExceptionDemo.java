package ExceptionDemo;

public class TestExceptionDemo {
    void method()throws TestException{  
       // throw new TestException("TestException Occurred");  
    }  

    void firstMethod()throws TestException{  
        throw new TestException();
         //   method();
    }
    
    
    public static void main (String args[])throws Exception{
        TestExceptionDemo obj=new TestExceptionDemo(); 
        try{
            obj.firstMethod(); 
            System.out.println("Stuff in try clause");
        }
        catch (Exception ae){
            if( ae instanceof TestException){
                
            }
            
            ae.printStackTrace();
            System.out.println("Catch");
        }
        finally{
            System.out.println("Finally");
        }
        System.out.println("End Of Program");  
    }  
}
