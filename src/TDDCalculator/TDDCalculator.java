package TDDCalculator;


public class TDDCalculator {

    public int add(int a, int b){
        return a + b;
    }
    
    public int subtract(int a, int b){
        return a - b;
    }
    
    public int multiply(int a, int b){
        return a * b;
    }
    
    public int divide(int a, int b){
        return a / b;
    }
    
    public boolean verifyOperator(String op){
        if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")){
            return true;
        }
        return false;
    }
    
    public int calculate(int a, int b, String op) throws Exception {
        if (verifyOperator(op)){
            if (op.equals("+")){
                return add(a, b);
            }
            else if (op.equals("-")){
                return subtract(a, b);
            }
            else if (op.equals("*")){
                return multiply(a, b);
            }
            else if(op.equals("/")){
                return divide(a, b);
            }
        }
        else{
            Exception e = new Exception("Operator not valid");
            throw e;
        }
        //will never happen
        return -1;
    }
    
}
