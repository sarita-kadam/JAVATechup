package Threading;

//Serialization:  it converts a Java object into a file, so the object's state can be stored permanently.

//Deserialization: Reverse process of serialization.
//FileOutputStream → Create/open a file to write bytes.
//ObjectOutputStream → Convert objects into byte format (serialization).

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationAndDeserialization {


    public static void main(String[] args) throws IOException {

        try {
            Student student = new Student("sarita", "saritakadan112@gmail.com", 23, "pune");

            FileOutputStream fos = new FileOutputStream("ob.text"); //This opens/creates a file named ob.text in your project folder.

            ObjectOutputStream oos = new ObjectOutputStream(fos); //This stream converts the Student object into binary format so it can be saved.

            oos.writeObject(student); //Save object to file

            oos.close();
            fos.close();

        System.out.println("Object Deserialized Successfully!");
        System.out.println(student);
    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


