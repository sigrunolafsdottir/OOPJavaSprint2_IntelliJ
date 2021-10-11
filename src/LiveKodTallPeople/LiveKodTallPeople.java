package LiveKodTallPeople;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LiveKodTallPeople {


    public final int limit = 200;
    Path path = Paths.get("src/LiveKodTallPeople/Personuppgifter.txt");
    Path outpath = Paths.get("src/LiveKodTallPeople/TallPeopleInfo.txt");

    public void printNames(String output, Path outPath){
        try(BufferedWriter buf = Files.newBufferedWriter(outPath)){
            buf.write(output);
            buf.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readAndFindTallPerson(Path path){
        String res = "";

        try(BufferedReader buf = Files.newBufferedReader(path);){
            String row1;
            String row2;
            int length = 0;

            while ((row1 = buf.readLine()) != null){
                row2 = buf.readLine();
                length = getLength(row2);
                if (findTallPerson(limit, length)){
                    res += row1+"\n";
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return res;
    }

    public boolean findTallPerson(int limit, int length){
        return length >= limit;
    }

    //numbers="56, 123, 188";
    public int getLength(String numbers){
        String[] arr = numbers.split(",");
        if(arr.length != 3){
            return -1;
        }
        return Integer.parseInt(arr[2].trim());
    }

    public void mainprogram(){
        printNames(readAndFindTallPerson(path), outpath);
    }

    public static void main(String[] args){
        LiveKodTallPeople lk = new LiveKodTallPeople();
        lk.mainprogram();
    }
}
