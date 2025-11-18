package Encapulation;

import java.util.Scanner;

class InvalidEnterAmount extends RuntimeException{

    public InvalidEnterAmount(String msg){
        super(msg);
    }
}

public class BankDetails {

    private String holderName;
    private double balance = 1000;
    private int id;
    private String ifsc;
    private String branch;
    private static String bankName = "SBI";

    Scanner sc = new Scanner(System.in);

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String bankName) {
        BankDetails.bankName = bankName;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

   public void addHolderInfo(){
       System.out.print("Enter Holder Name : ");
       holderName = sc.nextLine();

       System.out.print("Enter Invalid Balance : ");
       balance = sc.nextDouble();

       System.out.println("Enter ID : ");
       id = sc.nextInt();

       System.out.println("Enter IFSC : ");
       ifsc = sc.next();

       System.out.println("Enter Branch : ");
       branch = sc.next();

       System.out.println(" Account Created Successfully ! ");
       displayAccountInfo();

   }

   public void deposit(){
       System.out.println("Current Balance: " + balance);
       System.out.println("Enter Deposit Amount: ");
       double amount = sc.nextDouble();

       if(amount > 0){
           balance += amount;
           System.out.println("Deposited: " + amount);
           System.out.println("Updated Balance : " + balance);
       }
       else {
           System.out.println(" Invalid deposit amount ! ");
       }
   }

   public void withdraw()
   {
       System.out.println("Current Balance: " + balance);
       System.out.println("Enter Withdraw Amount: ");
       double amount = sc.nextDouble();

       if(amount <= 0)
       {

           throw new InvalidEnterAmount("Please Enter Valid Amount...");
       }
       if (amount > 0 && amount <= balance)
       {
           balance -= amount;
           System.out.println("Withdrawn: " + amount);
           System.out.println("Remaining Balance: " + balance);
       }
       else {
           System.out.println("Insufficient balance or Invalid amount ! ");
       }
   }

   public void displayAccountInfo(){
       System.out.println("Holder Name: " + holderName);
       System.out.println("Balance: " + balance);
       System.out.println("ID: " + id);
       System.out.println("IFSC: " + ifsc);
       System.out.println("Branch Name: " + bankName);
   }

}

