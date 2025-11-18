package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingFileExample {

    public static void main(String[] args) throws FileNotFoundException {

        try(BufferedReader br = new BufferedReader(new FileReader("data.text"))) {
            String line;

            while ((line=br.readLine()) != null) {
            }
        }
        catch (IOException e) {
            System.out.println("Error reading file : " + e.getMessage());
        }
    }
    }

