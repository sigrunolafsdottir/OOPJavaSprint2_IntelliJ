package ÖvnUppg13_kalkylator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    
    Calculator c = new Calculator();
    
    @Test
    public final void operatorSupportedTest() {
        assertTrue(c.operatorSupported("+"));
        assertTrue(c.operatorSupported("-"));
        assertTrue(c.operatorSupported("*"));
        assertTrue(c.operatorSupported("/"));
        assertFalse(c.operatorSupported("%"));
        assertFalse(c.operatorSupported("5"));
        assertFalse(c.operatorSupported("a"));
    }
    
    @Test
    public final void plusTest() throws OperatorNotSupportedException {
        assertTrue(c.calculate(2,3,"+") == 5);
        assertFalse(c.calculate(2,7,"+") == 5);
    }
    
    @Test
    public final void minusTest() throws OperatorNotSupportedException{
        assertTrue(c.calculate(8,3,"-") == 5);
        assertFalse(c.calculate(9,7,"-") == 5);
    }
    
    @Test
    public final void multiplyTest() throws OperatorNotSupportedException{
        assertTrue(c.calculate(8,3,"*") == 24);
        assertFalse(c.calculate(8,3,"*") == 5);
    }
    
    @Test
    public final void divisionTest() throws OperatorNotSupportedException {
        assertTrue(c.calculate(8,2,"/") == 4);
        assertFalse(c.calculate(8,2,"/") == 5);
    }
    
   

}
