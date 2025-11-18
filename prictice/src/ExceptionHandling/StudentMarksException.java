package ExceptionHandling;

import java.util.Scanner;

public class StudentMarksException {

    static class IllegalArgumentException extends Exception{

        public IllegalArgumentException(String massage){
            super(massage);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");

        int Marks = sc.nextInt();

        try{
            if(Marks < 0 || Marks > 100){
                throw new IllegalArgumentException("Marks must be between 0 and 100");

            }else {
                System.out.println("Valid Marks : " + Marks);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Marks : "+ e.getMessage());

        }

    }
}
