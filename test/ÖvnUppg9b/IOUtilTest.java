package ÖvnUppg9b;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IOUtilTest {

    IOUtil ioUtil = new IOUtil();

    String outFile = "test/ÖvnUppg9a/TallPeopleInformation.txt";
    String inFile = "test/ÖvnUppg9a/Personuppgifter.txt";


    @Test
    public final void readDataFromFileTest(){
        List<Person> persons = ioUtil.readDataFromFile(inFile);
        assertTrue(persons.size() == 8);
        assertFalse(persons.size() == 5);
    }

    public final int countLinesInFile(String fileToCount){
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileToCount));) {
            while (reader.readLine() != null) lines++;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return lines;
    }

    @Test
    public final void writeDataToFileTest(){
        Person p1 = new Person("Kalle", "Drottninggatan 1",
                "12345", 45, 89, 178);
        Person p2 = new Person("Mimmi", "Drottninggatan 2",
                "12345", 45, 89, 234);
        Person p3 = new Person("Anton", "Drottninggatan 3",
                "12345", 45, 89, 187);
        List<Person> testPersons = Arrays.asList(p1, p2, p3);
        List<Person> controlList = new ArrayList<>();

        ioUtil.writeDataToFile(outFile, testPersons);
        assertTrue(countLinesInFile(outFile) == 3);
        assertFalse(countLinesInFile(outFile) == 5);

    }
}
