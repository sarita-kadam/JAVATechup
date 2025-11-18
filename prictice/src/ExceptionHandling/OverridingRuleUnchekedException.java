package ExceptionHandling;

//Unchecked exceptions can be thrown anytime.

class Parent {
    void show(){
        System.out.println("parent show method");
    }
}

class Child extends Parent {

    @Override
    void show() throws RuntimeException
    {
        System.out.println("child show method ");
        throw new RuntimeException("Unchecked exception in child");
    }
}
public class OverridingRuleUnchekedException {

    public static void main(String[] args) {

        Parent obj = new Child();
        obj.show();

    }

}
