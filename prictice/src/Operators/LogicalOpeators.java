package Operators;

public class LogicalOpeators {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        boolean aa = a < b && b < c ;      // < less than
        System.out.println("check logical And = " + aa);  // return true when both condition are true

        boolean logicalOR = a > b || b < c ;
        System.out.println("check logical OR = " +logicalOR);  //return true when at leat 1 conditon is true

        boolean logicalNOT =  ! ((a > b) || (b > c)) ;
        System.out.println("check logical NOT = " +logicalNOT); // return true when condition is false

    }

}

//1.	(&&) Logical AND:  returns true when both conditions are true.
//2.	(||) Logical OR:          returns true if at least one condition is true.
//3.	(!) Logical NOT:        returns true when a condition is false and                      vice-versa
//           (This example demonstrates the use of logical operators (&&, ||, ! ) to perform boolean operations.)