package ÖvnUppg1_TDD;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

public class CircleTest {

    Circle c1 = new Circle(3);

    @Test
    public final void testGetters(){
        assertTrue(c1.getRadius() == 3);
        assertFalse(c1.getRadius() == 5);
    }

    @Test
    public final void testSetters(){
        assertTrue(c1.getRadius() == 3);

        c1.setRadius(5);

        assertTrue(c1.getRadius() == 5);
        assertFalse(c1.getRadius() == 7);
    }

    @Test
    public final void testArea(){

        //rätt svar: 28.2743339
        assertTrue(c1.getArea() - 28.274 < 0.001);
        assertTrue(c1.getArea() - 28.274 > 0);
        assertTrue(c1.getArea() - 29 < 0);
    }

    @Test
    public final void testCircumference(){


        //rätt svar: 18.8495559
        assertTrue(c1.getCircumference() - 18.849 < 0.001);
        assertTrue(c1.getCircumference() - 18.849 > 0 );
        assertTrue(c1.getCircumference() - 19 < 0);
    }
}
