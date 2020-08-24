package ExceptionDemo;


public class TestException extends Exception {
    
    String s = new String();
    
    public TestException(String s){
        this.s = s;
    }
    
    public TestException(){
        this.s = "";
    }
    
    public String getMessage(){
        return s;
    }
}
