package String;

//clone() :To duplicate an object without creating it again using new.
// Useful when you want the same data in another independent object.
// must implement Cloneable interface
// Concept	Description
//clone() :Creates a copy of the object.
// Concept	Description
//clone()	Creates a copy of the object.
//Cloneable interface : Must be implemented; otherwise, CloneNotSupportedException occurs.
//super.clone() : Used to call the actual cloning logic in Object class.


class Stud implements Cloneable {

    int id;
    String name;

    Stud(int id,String name){
        this.id = id;
        this.name = name;

    }

    public Object clone() throws  CloneNotSupportedException {
        return super.clone();  // calls Object class's clone()
    }
}


public class CloneMethod  {

    public static void main(String[] args)  throws CloneNotSupportedException{

        Stud s1 = new Stud(101,"sarita");

        Stud s2 = (Stud) s1.clone();

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println( s1 == s2);

    }
}


//s2 is a copy of s1, but both are separate objects.