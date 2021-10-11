package LiveKodTallPeople;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class LiveKodTallPeopleTest {

        LiveKodTallPeople lk = new LiveKodTallPeople();
        Path path = Paths.get("test/LiveKodTallPeople/Personuppgifter.txt");
        Path pathSmall = Paths.get("test/LiveKodTallPeople/PersonuppgifterSmall.txt");
        Path outPath = Paths.get("test/LiveKodTallPeople/Output.txt");

        @Test
        void readAndFindTallPersonTest(){

            //System.out.println(lk.readAndFindTallPerson(path));

            assertTrue(lk.readAndFindTallPerson(pathSmall).equals("Rulle Rullson, Xvägen 3, 12345 Ystad\n"));
            assertFalse(lk.readAndFindTallPerson(pathSmall).equals("Kalle Nilsson, Xvägen 1, 12345 Ystad\n"));
        }

        @Test
        void printToFileTest() throws IOException {
            String s = "Sigrun Sigrunsson, Xvägen 3, 12345 Ystad\n" +
                    "Nisse Nilsson, Xvägen 6, 12345 Ystad\n";
            lk.printNames(s, outPath);
            String temp = "";
            String ackumulatedTest="";

            BufferedReader buf = Files.newBufferedReader(outPath);
            while((temp = buf.readLine()) != null){
                ackumulatedTest += temp+"\n";
            }
            System.out.println(s);
            System.out.println();
            System.out.println(ackumulatedTest);
            assertTrue(ackumulatedTest.equals(s));

        }


        @Test
    void findTallPersonTest(){
            int limit = 200;
            int length1 = 230;
            int length2 = 130;
            assertTrue(lk.findTallPerson(limit, length1));
            assertFalse(lk.findTallPerson(limit, length2));
        }

        @Test
    void getLengthTest(){
            String l1="56, 123, 188";
            int expected = 188;
            assertTrue(lk.getLength(l1) == expected);
            assertFalse(lk.getLength(l1) == 123);
        }

}