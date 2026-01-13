package String;

final class Student{

    private final String name;
    private final int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Immutablclass {

    public static void main(String[] args) {

        Student obj = new Student("saru",23);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());

        // not allowed - no setter method
        // obj.setName("saru"); // compile-time

        // cannot change value - field are final
        //obj.name = "sarita"; // compile time error
    }
}

