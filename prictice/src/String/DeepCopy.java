package String;

class Address1{

    String city;

    Address1( String city){
        this.city = city;
    }
}

class Person1 implements Cloneable{

    String name;
    Address1 address;

    Person1(String name,Address1 address){
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Person1 obj = (Person1) super.clone(); // shallow copy first
        obj.address = new Address1(address.city); // deep copy of address

        return  obj;

    }
}

public class DeepCopy {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person1 p1 = new Person1("Sarita", new Address1("Pune"));

        Person1 p2 = (Person1) p1.clone(); // deep cop

        p2.address.city = "Mumbai";

        System.out.println(p1.name + " lives in " + p1.address.city);
        System.out.println(p2.name + " lives in " + p2.address.city);


    }
}
