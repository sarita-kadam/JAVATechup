package Polymorphism;

public class VarArgsExample {

    void show(int... number){
        System.out.println("Number of Argument: " + number.length);

        for (int n : number){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {

        VarArgsExample obj = new VarArgsExample();

        obj.show();                         // No arguments
        obj.show(10);              //One argument
        obj.show(12,13,14,15);     // multiple argument


    }
}
