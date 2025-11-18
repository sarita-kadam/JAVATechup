package Encapulation;

import java.util.Scanner;

public class TestBank {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        BankDetails bank = new BankDetails();
        int choice;

        do{
            System.out.println("==== Bank Menu ====");
            System.out.println(" 1. Add Holder Information");
            System.out.println(" 2. Deposit");
            System.out.println(" 3. withdraw");
            System.out.println(" 4. Display Account Info");
            System.out.println(" 5. Exit");
            System.out.println("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    bank.addHolderInfo();
                    break;

                case 2:
                    bank.deposit();
                    break;

                case 3:
                    bank.withdraw();
                    break;

                case 4:
                    bank.displayAccountInfo();
                    break;

                case 5:
                    System.out.println(" Exiting .... Thank you !");
                    break;
                default:
                    System.out.println(" Invalid choice, try again.");
            }
        } while(choice != 5);
    }
}
