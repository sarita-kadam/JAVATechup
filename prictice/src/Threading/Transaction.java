package Threading;

import java.util.Scanner;

class Account1 extends Thread {

     double balance = 10000;
     double amount ;

     Scanner sc = new Scanner(System.in);


    @Override
  synchronized  public void run() {

        System.out.println("Enter Deposited Amount : ");

            amount = sc.nextDouble();

            balance = balance + amount;

            System.out.println(Thread.currentThread().getName() + " Deposited. current balance : " + balance);

        }
    }

class Account2 extends Thread{

     double balance = 10000;
     double amount;

     Scanner sc = new Scanner(System.in);

    @Override
    public void run() {

            amount = sc.nextDouble();

            if (balance >= amount) {

                balance = balance - amount;

                System.out.println(Thread.currentThread().getName() + " Withdraw successfully :" + balance);


            } else {
                System.out.println("Insufficient balance : ");
            }

        }
    }


public class Transaction {

    public static void main(String[] args) {

        Account1 t1 = new Account1();
        t1.start();

        Account2 t2 = new Account2();
        t2.start();



    }
}
