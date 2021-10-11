package PathDemo;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;


public class PathDemo {
    
    //Kräver filer som finns. 
    //Ligger de i samma katalog måste de skrivas enligt src\\PathDemo\\filnamn
    
    public static void main(String[] arg) throws IOException {
        /*
       // Path path = Paths.get("src\\PathDemo\\testFil1");

        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());

        */
        Path path = Paths.get("src/PathDemo/testFil1.txt");

        if (!Files.exists(path)){
            Files.createFile(path);
            //BufferedWriter writer =
            //  Files.newBufferedWriter(path, StandardCharsets.UTF_8);
            //writer.write("nu skriver vi i vår fil");
           // writer.flush();
            //writer.close();
        }

       Path path2 = Paths.get("src/PathDemo/filnamn2");
        //Files.copy(path, path2 );
        
        //Files.delete(path2);

        BufferedWriter writer = Files.newBufferedWriter(path2, StandardOpenOption.APPEND);

        writer.write("låt oss appenda ");
        writer.flush();
    }

}
