package ÖvnUppg9a;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertFalse;

public class ÖvnUppg9aTest {

    //Vi måste läsa in en rad från en fil
    //VI måste parsa upp raderna i bitar
    //Måtten måste göras om till integers
    //VI måste jämföra längden och se att en person är över 2 meter
    //Vi måste skriva ut de personer som är längre än 2 meter
    //vi sk INTE skriva de som är kortare än 2 meter

    ÖvnUppg9a x = new ÖvnUppg9a();

    @Test
    public final void getLengthTest(){
        String line = "25, 80, 175";
        assertTrue(x.getLength(line) == 175);
        assertFalse(x.getLength(line) == 80);
    }

    @Test
    public final void isMoreThanTwoMeterTest(){
        int i1 = 202;
        int i2 = 200;
        int i3 = 178;
        assertTrue(x.isMoreThanTwoMeter(i1));
        assertTrue(x.isMoreThanTwoMeter(i2));
        assertFalse(x.isMoreThanTwoMeter(i3));
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
    public final void readTwoLinesWriteToFileTest(){
        String readFilePath = "test/ÖvnUppg9a/Personuppgifter_oneTallGuy.txt";
        String writeFilePath = "test/ÖvnUppg9a/TallPeopleInformation.txt";
        try(Scanner sc = new Scanner(Paths.get(readFilePath));
            PrintWriter w = new PrintWriter(
                Files.newBufferedWriter(Paths.get(writeFilePath))); ) {
            x.readTwoLinesWriteToFileIfTall(sc,w );
        }
        catch (Exception e){
            e.printStackTrace();
        }

        assertTrue(countLinesInFile(writeFilePath) == 2);
    }

    @Test
    public final void readTwoLinesNOTWriteToFileTest(){
        String readFilePath = "test/ÖvnUppg9a/Personuppgifter_oneShortGuy.txt";
        String writeFilePath = "test/ÖvnUppg9a/TallPeopleInformation.txt";
        try(Scanner sc = new Scanner(Paths.get(readFilePath));
            PrintWriter w = new PrintWriter(
                    Files.newBufferedWriter(Paths.get(writeFilePath))); ) {
            x.readTwoLinesWriteToFileIfTall(sc,w );
        }
        catch (Exception e){
            e.printStackTrace();
        }

        assertTrue(countLinesInFile(writeFilePath) == 0);
        assertFalse(countLinesInFile(writeFilePath) == 5);
    }

}
