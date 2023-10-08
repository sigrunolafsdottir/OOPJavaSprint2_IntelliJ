package Övn9bLive_demo2022_distans;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class IOUtilTest {

    IOUtil iou = new IOUtil();
    Path inPath = Paths.get("test/Övn9bLive_demo2022_distans/Personuppgifter.txt");
    //List<Person> readFromFile(Path inPath)

    @Test
    public void readFromPathTest(){
        List<Person> res = iou.readFromPath(inPath);

        System.out.println("size" + res.size());

        assert(res.size() == 8);
        assert(res.size() != 0);
        assert(res.get(0).getLength()==175);
        assert(res.get(0).getName().equals("Kalle Nilsson"));
        assert(res.get(1).getLength()==169);
        assert(res.get(1).getName().equals("Mimmi Mattsson"));

    }



}
