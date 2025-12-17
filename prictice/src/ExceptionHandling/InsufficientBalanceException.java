package ExceptionHandling;

import java.util.Scanner;

public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException(String massage){

        super(massage);

    }

    public static void main(String[] args) {

        double balance = 10000.00;
        System.out.println("your current balance is  : " + balance);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount : ");

        double amount = sc.nextDouble();

        try{
            if(amount > balance){
                throw new InsufficientBalanceException("Insufficient balance ! " + balance);
            }
            else {
                balance -= amount;
            System.out.println("Successfully Withdraw ! Remaining balance : " + balance);
            }

        } catch (InsufficientBalanceException e){

            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using ATM ");
        }
    }
}
