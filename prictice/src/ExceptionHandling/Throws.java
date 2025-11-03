package ExceptionHandling;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite
{
   void readfile() throws FileNotFoundException
   {
       FileInputStream obj = new FileInputStream("d:/abc.txt");

   }

   void savefile() throws FileNotFoundException
   {
       FileOutputStream obj = new FileOutputStream("d:/abc.txt");
   }
}


public class Throws {
    public static void main(String[] args) {

        ReadAndWrite obj = new ReadAndWrite();
        try {
            obj.readfile();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }


}
