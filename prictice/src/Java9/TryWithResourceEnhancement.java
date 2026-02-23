package Java9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResourceEnhancement {

    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("file.txt");

        try(fos){
            fos.write("welcome to java world".getBytes());
            System.out.println("given string in written in the file successful");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
