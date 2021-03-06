package ÖvnUppg1_TDD;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

public class SquareTest {

    Square s1 = new Square(3,6);

    @Test
    public final void testGetters(){
        assertTrue(s1.getLength() == 3);
        assertTrue(s1.getWidth() == 6);
        assertFalse(s1.getWidth() == 8);

        //samma som ovan, bara annat sätt att skriva
        assertEquals(s1.getLength(),3);
        assertEquals(s1.getWidth(),6);
        assertNotEquals(s1.getWidth(), 8);
    }

    @Test
    public final void testSetters(){
        assertTrue(s1.getLength() == 3);
        assertTrue(s1.getWidth() == 6);

        s1.setLength(5);
        s1.setWidth(7);

        assertTrue(s1.getLength() == 5);
        assertTrue(s1.getWidth() == 7);
    }

    @Test
    public final void testArea(){
        assertTrue(s1.getArea() == 18);
        assertFalse(s1.getArea() == 23);
    }

    @Test
    public final void testCircumference(){
        Square s1 = new Square(1,2);
        assertTrue(s1.getCircumference() == 6);
        assertFalse(s1.getCircumference() == 23);
    }
}
