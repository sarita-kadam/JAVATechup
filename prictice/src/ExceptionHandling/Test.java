package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileInputStream obj = new FileInputStream("d:/abc.text");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("hello");


    }

}
