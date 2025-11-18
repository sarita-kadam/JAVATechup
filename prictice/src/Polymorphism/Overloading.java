package Polymorphism;

//It is process in which me create method in same class with same name
// but different argument list or different method signature.

// Method Signature => Method name + parameter list

class A{

    int add(int a, int b){
        System.out.println("overloading");
        return a + b;
    }

    double add(int aa,int bb,int cc){
        System.out.println();
        return aa + bb + cc;

    }

    public static void main(String[] args) {
        A obj = new A ();
        int result = obj.add(12,43);
        System.out.println(result);

    }
}


//1.	Compiler-Time or Method overloading or early binding or static binding