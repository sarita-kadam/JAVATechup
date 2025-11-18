package ExceptionHandling;

// Login System

import java.util.Scanner;

public class InvalidLoginException  extends Exception{

    public InvalidLoginException(String massage){
        super(massage);

    }

    public static void main(String[] args) {

        String Username = "admin";
        String Password = "1234";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username : ");
        String User = sc.nextLine();

        System.out.println("Enter Password : ");
        String Pass = sc.nextLine();

        try{

            if(!User.equals(Username) || !Pass.equals(Password)){
                throw new InvalidLoginException("Invalid username and password : ");

            }
            else {
                System.out.println("Login successful!");
            }
        } catch (InvalidLoginException e) {
            System.out.println("Login Failed: " + e.getMessage());
        }

    }
}
