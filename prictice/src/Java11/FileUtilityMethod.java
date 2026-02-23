package Java11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtilityMethod {


    //File Utility Methods in Java (Java 11 Feature) :These methods make file reading & writing very simple.


    public static void main(String[] args) throws IOException {

        //Before Java 11

        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));


        //After Java 11

        Files.readString(Path.of("abc.txt"));


        // File Utility Method : java.nio.file.Files

       // 1.readString() : Reads entire file as String.
        Path filepath = Paths.get("student.txt");
        String result = Files.readString(filepath);
        System.out.println(result);


        // 2.writeString() : Writes String directly into file.

        Files.writeString(Path.of("abc.txt"), "Hello Java 11");
    }
}
