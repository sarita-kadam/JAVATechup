package Static;

class Parent{

    void show(){

        System.out.println("parent method");
    }
}

class Child extends Parent{

    void display(){

        System.out.println("child method");
    }
}

public class Exam {

    public static void main(String[] args) {

        Parent obj = new Child();

        Child obj1 = (Child) obj;
        obj1.display();


    }
}
