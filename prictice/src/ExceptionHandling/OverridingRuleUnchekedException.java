package ExceptionHandling;

// Unchecked exceptions (i.e. subclasses of RuntimeException)
// The overriding method can throw any unchecked exception,
// Regardless of what the overridden method declares (or doesn’t declare).No restriction for unchecked exceptions.

// Even though Parent.show() didn’t declare any exception,
// Child.show() can still throw an unchecked (RuntimeException) without compiler error.

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
