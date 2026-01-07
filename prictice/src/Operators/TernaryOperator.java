package Operators;

public class TernaryOperator {

    public static void main(String[] args) {

        int num = 7;
        String result = (num % 2== 0) ? "Even" : "Odd";
        System.out.println(" Result = " + result);


        int marks = 36;
        String status = (marks >= 40) ? "Pass" : "fail";
        System.out.println(" status = " + status);


        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println(" Maximum = " + max);

        int age = 28;
        String vote = (age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println("Vote Status = " + vote);



    }
}
