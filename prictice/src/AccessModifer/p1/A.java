package AccessModifer.p1;


class Test{

    protected double balance;

    protected void display(){

        System.out.println("Protected Access Modifer");
    }
}


public class A {

    public int age;

    public void show(){
        System.out.println("Public Access Modifer");
    }


}



// The public keyword is an access modifier.
//  - public => no restrictions → Accessible from anywhere in the project.