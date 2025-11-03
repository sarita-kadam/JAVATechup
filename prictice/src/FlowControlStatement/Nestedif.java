package FlowControlStatement;

public class Nestedif {

    public static void main(String[] args) {
        int i = 10;

        if (i == 10 || i < 15) {


            // Outer if statement
            if (i < 15) {
                System.out.println("i is smaller than 15");

                // Nested if statement
                if (i < 12) {
                    System.out.println("i is exactly 10");


                } else {
                    System.out.println("i is greter than 15");
                }
            }
        }


//        int number = 17;
//
//            if (number > 0)
//            {
//                System.out.println(number + "number is positive");
//            }
//            else if (number < 0) {
//                System.out.println(number + "number is negative");
//
//            }
//             else {
//                System.out.println(number + "is zero");
//            }
        }
    }

