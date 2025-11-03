package ExceptionHandling;

import java.util.Scanner;

class youngerException extends RuntimeException
{
    youngerException (String msg)
    {
        super(msg);
    }

}

class Voting
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");

        int age = sc.nextInt();
        try {
            if (age < 18) {

                throw new youngerException("you are not eligible vote");

            }

            else
            {
                System.out.println("you can vote successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}


public class Throw {
}
