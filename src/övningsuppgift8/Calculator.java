package övningsuppgift8;


public class Calculator  {
    
    //Many operator function because students had questions about the logic
    
    protected boolean operatorSupported(String operator){
        if (operator.equals("+") 
                || operator.equals("-") 
                || operator.equals("*") 
                || operator.equals("/")){
            return true;
        }
        return false;
    }
    
    
    protected boolean operatorSupportedNotWorking(String operator){
        if (operator.equals("+") 
                && operator.equals("-") 
                && operator.equals("*") 
                && operator.equals("/")){
            return true;
        }
        return false;
    }
    
    protected boolean operatorSupportedAlt1(String operator){
        if (!(operator.equals("+") 
                || operator.equals("-") 
                || operator.equals("*") 
                || operator.equals("/"))){
            return false;
        }
        return true;
    }
    
    protected boolean operatorSupportedAlt2(String operator){
        if (!operator.equals("+") 
                && !operator.equals("-") 
                && !operator.equals("*") 
                && !operator.equals("/")){
            return false;
        }
        return true;
    }

    
    public double calculate(double a, double b, String operator) 
            throws OperatorNotSupportedException{
        
        if (!operatorSupported(operator)) {
            throw new OperatorNotSupportedException(
                    "Felaktig operator");
        }
        
        if (operator.equals("+")) return a+b;
        else if (operator.equals("-")) return a-b;
        else if (operator.equals("*")) return a*b;
        else return a/b;
    }

}
