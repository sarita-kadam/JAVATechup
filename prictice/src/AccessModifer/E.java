
// Access direct in same package
//     - in Diffrent package access only subclass (child class)
package AccessModifer;


public class E {

    protected void add(){
        System.out.println(" parent class");
    }
}

 class ProtectedAccessModifer {

    public static void main(String[] args) {

        E obj = new E ();
        obj.add();
    }

}

