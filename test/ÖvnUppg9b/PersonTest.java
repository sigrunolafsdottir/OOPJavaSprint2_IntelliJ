package ÖvnUppg9b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Person p = new Person("Kalle", "Drottninggatan",
            "12345", 45, 89, 178);

    @Test
    public final void getLengthTest(){
        assertTrue(p.getLength() == 178);
        assertFalse(p.getLength() == 89);
    }

    @Test
    public final void getNameTest(){
        assertTrue(p.getName().equals("Kalle"));
        assertFalse(p.getName().equals("Nisse"));
    }
}
