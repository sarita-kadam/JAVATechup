package String;

class Address{
    String city;

    Address(String city){
        this.city = city;
    }
}

class Person implements Cloneable{

    String name;
    Address address;

    Person(String name , Address address){
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone(); // shallow copy
    }
}

public class ShallowCopy {

    public static void main(String[] args) throws CloneNotSupportedException {


        Address a1 = new Address("pune");

        Person p1 = new Person("sarita",a1);

        Person p2 = (Person) p1.clone();

        p2.address.city = "mumbai";

        System.out.println(p1.address.city);
    }
}

//Both share the same Address object, so change reflects in both. That’s shallow copy.