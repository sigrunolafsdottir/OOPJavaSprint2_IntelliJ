package Övn9bLive_demo2022_distans;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOUtil {


    public List<Person> readFromPath(Path inPath) {

        List<Person> list = new ArrayList<>();
        String firstrow = "";
        String secondrow = "";

        try(Scanner sc = new Scanner(inPath)){

                while (sc.hasNextLine()) {
                    firstrow = sc.nextLine();
                    secondrow = sc.nextLine();

                    String[] firstArr = firstrow.split(",");
                    String[] secondArr = secondrow.split(",");

                    Person p = new Person(firstArr[0].trim(), firstArr[1].trim(), firstArr[2].trim(),
                            Integer.parseInt(secondArr[0].trim()),
                            Integer.parseInt(secondArr[1].trim()),
                            Integer.parseInt(secondArr[2].trim()));

                    list.add(p);

                }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
