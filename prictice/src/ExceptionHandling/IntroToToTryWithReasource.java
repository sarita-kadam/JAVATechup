package ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class IntroToToTryWithReasource {

    public static void main(String[] args) throws IOException {

        /*Scanner obj = null;

        try
        {
            Scanner sc = new Scanner(new File("test.text"));
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        finally
        {
         if(obj != null)
         {
             obj.close();
         }
        }

        try(Scanner obj1 = new Scanner(new File("test.txt"))){
            while(obj1.hasNext()){
                System.out.println(obj1.nextLine());
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }*/


        BufferedReader br = null;

        try
        {
           Scanner sc = new Scanner (new File("intput.txt"));
        }
        catch (IOException e) {

        }
        finally {
            {
                if(br != null){
                    br.close();
                }
            }
        }
    }
}

// scanner implement closable interface
// closable implement Autocloseable interface