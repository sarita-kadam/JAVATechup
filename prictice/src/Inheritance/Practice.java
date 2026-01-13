package Inheritance;

class ParentClass{

    void main(){
        System.out.println("Parent method..");
    }

}
class ChildClass extends ParentClass{

    @Override
    void main() {
        System.out.println("Overridden method of parent class");
    }

    void dummy(){
        System.out.println("child method..");
    }

}
public class Practice {

    public static void main(String[] args) {


        ParentClass obj = new ChildClass();
        obj.main();
       // obj.dummy();

    }
}
