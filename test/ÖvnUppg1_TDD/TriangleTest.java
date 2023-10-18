package ÖvnUppg1_TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TriangleTest {

    //Triangeln är två Pytagoras trianglar "rygg i rygg" där sidornas mått är 3,4,5
    //Jag har valt dessa mått för att omkretsen blir lätt att hantera,
    // vi slipper oändliga decimaltal.

    Triangle t1 = new Triangle(3,8);

    @Test
    public final void testGetters(){
        assertTrue(t1.getHeight() == 3);
        assertTrue(t1.getBase() == 8);
        assertFalse(t1.getHeight() == 9);

        //samma som ovan, bara annat sätt att skriva
        assertEquals(t1.getHeight(),3);
        assertEquals(t1.getBase(),8);
        assertNotEquals(t1.getBase(), 34);
    }

    @Test
    public final void testSetters(){
        assertTrue(t1.getHeight() == 3);
        assertTrue(t1.getBase() == 8);

        t1.setHeight(5);
        t1.setBase(7);

        assertTrue(t1.getHeight() == 5);
        assertTrue(t1.getBase() == 7);
    }

    @Test
    public final void testArea(){
        assertTrue(t1.getArea() == 12);
        assertFalse(t1.getArea() == 23);
    }

    @Test
    public final void testCircumference(){
        assertTrue(t1.getCircumference() == 18);
        assertFalse(t1.getCircumference() == 23);
    }
}
