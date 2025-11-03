package Polymorphism;

class AB {
    void show(){
        System.out.println(1);
    }
}

class AC extends AB {
    void show(){
        System.out.println(2);
    }
}

class AD extends AC{
    void show(){
        System.out.println(3);
    }
}

public class Ex11 {

    public static void main(String[] args) {

        AB obj = new AB();
//      obj.show(); o/p = 1

        obj = new AC();

        obj = new AD();
    }
}
