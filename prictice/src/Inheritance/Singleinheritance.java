package Inheritance;


// - 1 parent class = 1 child class.
// - child class extend with parent class


public class Singleinheritance extends Parentclass{

    public static void main(String[] args) {

        Singleinheritance obj = new Singleinheritance();

        obj.show();

    }

}

class Parentclass{

    int a = 67;
    float b = 34;
    void show()
    {
        System.out.println("parent class " + a  + b  );
    }

}




// class Parent1{
// public int add(int aa, int bb){
//   system.out.println("heyy java");
//     return aa + bb ;
// }
// }

// public class singleinheritanceexample extends Parent1 {
// public static void main(String[]args){
// singleinheritanceexample obj = new singleinheritanceexample();
//  int result = obj.add(aa:12 , bb:23 );
//  system.out.println(result);
//
// }
//}