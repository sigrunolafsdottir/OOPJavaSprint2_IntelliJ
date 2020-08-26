package ÖvnUppg13_kalkylator;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest {
    
    Calculator c = new Calculator();
    
    @Test
    public final void operatorSupportedTest() {
        TestCase.assertTrue(c.operatorSupported("+"));
        TestCase.assertTrue(c.operatorSupported("-"));
        TestCase.assertTrue(c.operatorSupported("*"));
        TestCase.assertTrue(c.operatorSupported("/"));
        TestCase.assertFalse(c.operatorSupported("%"));
        TestCase.assertFalse(c.operatorSupported("5"));
        TestCase.assertFalse(c.operatorSupported("a"));
    }
    
    @Test
    public final void plusTest() throws OperatorNotSupportedException {
        TestCase.assertTrue(c.calculate(2,3,"+") == 5);
        TestCase.assertFalse(c.calculate(2,7,"+") == 5);
    }
    
    @Test
    public final void minusTest() throws OperatorNotSupportedException{
        TestCase.assertTrue(c.calculate(8,3,"-") == 5);
        TestCase.assertFalse(c.calculate(9,7,"-") == 5);
    }
    
    @Test
    public final void multiplyTest() throws OperatorNotSupportedException{
        TestCase.assertTrue(c.calculate(8,3,"*") == 24);
        TestCase.assertFalse(c.calculate(8,3,"*") == 5);
    }
    
    @Test
    public final void divisionTest() throws OperatorNotSupportedException {
        TestCase.assertTrue(c.calculate(8,2,"/") == 4);
        TestCase.assertFalse(c.calculate(8,2,"/") == 5);
    }
    
   

}
