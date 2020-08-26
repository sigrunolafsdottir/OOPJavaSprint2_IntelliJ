package ÖvnUppg9b;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class LogicUtilTest {

    LogicUtil lu = new LogicUtil();

    Person p1 = new Person("Kalle", "Drottninggatan 1",
            "12345", 45, 89, 178);
    Person p2 = new Person("Mimmi", "Drottninggatan 2",
            "12345", 45, 89, 234);
    Person p3 = new Person("Anton", "Drottninggatan 3",
            "12345", 45, 89, 187);
    List<Person> testPersons = new ArrayList<>();
    List<Person> tallPersons = new ArrayList<>();

    @Test
    public final void getAllTallPersonsTest(){
        //snabbsätt att populera en lista
        testPersons = Arrays.asList(p1, p2, p3);
        tallPersons = lu.getAllTallPersons(testPersons);

        assertTrue(tallPersons.size() == 1);
        assertFalse(tallPersons.size() == 2);

        assertTrue(tallPersons.get(0).getName().equals("Mimmi"));
        assertTrue(tallPersons.get(0).getLength() == 234);
    }
}
