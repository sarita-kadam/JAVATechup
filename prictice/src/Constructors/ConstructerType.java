
//Constructer: = initialize objects

//When you create an object using the "new" keyword, the constructor gets called automatically.

// 1. Class name and constructer name is same
// 2. No return type (Constructors don’t have a return type, not even void.)
// 3. Called automatically (When you create an object, the constructor runs without explicitly calling it.)


//    Type Of Constructer
//1.Default Constructer (Created automatically by Java if you don’t define any constructor.)
//2.No-argument Constructor (explicit)
//3.Parameterized Constructor (takes arguments)


package Constructors;

import javax.xml.namespace.QName;

public class ConstructerType {

     ConstructerType() {
        System.out.println("no-argument constructer");  // Default Constructer / no-argument constructer type
    }

    public ConstructerType(int age,String name){
        System.out.println("2 parameterized constructer"); // parameterized constructer tyep

    }
    public ConstructerType(String a, String b, long c ){
        System.out.println("3 parameterized constructer ");

    }

    public static void main(String[] args) {

        //ConstructerType obj = new ConstructerType();

        //ConstructerType obj1 = new ConstructerType(10,"java");

        ConstructerType obj2 = new ConstructerType("java","c++",10);
    }

}
