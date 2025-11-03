package Polymorphism;

// If a method cannot be inherited then it cannot be overridden. Ex: private methods in super class.


public class OverridingRule7 {

    private void show(){
        System.out.println("private method can access only same class / can not override");
    }

    public static void main(String[] args) {

        OverridingRule7 obj = new OverridingRule7();
        obj.show();

    }

}
