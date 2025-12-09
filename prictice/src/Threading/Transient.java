package Threading;

import java.io.*;

// Transient : We use transient when some data should not be saved,(like Passwords ,Sensitive information )

class students implements Serializable {

    String name;
    transient String password;

    students(String name,String password){
        this.name=name;
        this.password = password;
    }
}

public class Transient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        students s1 = new students("saru","1234");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
        oos.writeObject(s1);
        oos.close();

        // Deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
        Student s2 = (Student) ois.readObject();
        ois.close();

        System.out.println(s2.getName());      //
        System.out.println(s2.password);  // Output: null (because transient)

    }
}
