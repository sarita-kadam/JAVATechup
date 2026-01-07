package Operators;

public class UnaryOperators {

    // used for increment(++) decrement(--)


    public static void main(String[] args) {
         int a = 2;

         boolean t = false;                              // ! , Inverts a boolean value

       /* System.out.println("post-increment = " + a++);   //Uses value first, then increments //3
        System.out.println(a);
        System.out.println("pre-increment = " + ++a);    //Increments first, then uses value. //3
        System.out.println(a);*/

        System.out.println("post-decrement = " + a--);    // Uses value first, then decrements.
        System.out.println(a);
        System.out.println("pre-decrement = " + --a);    //Decrements first, then uses value.
        System.out.println(a);

        System.out.println(!t);


    }
}

//•	(++) Increments by 1.
//   Post-Increment:  Uses value first, then increments.
//   Pre-Increment:   Increments first, then uses value.
//
//•	(--) Decrements by 1.
//    Post-Decrement: Uses value first, then decrements.
//    Pre-Decrement: uses decrement, then decrements.
//
//•	(! ) Inverts a Boolean value. (value is true than print false & value is false than print true)