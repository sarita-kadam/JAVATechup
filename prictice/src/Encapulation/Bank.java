package Encapulation;

class Account {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        if( amount > 0 ){
            balance = amount;
        }
        else {
            System.out.println("Invalid amount ! ");
        }
    }

}

public class Bank {

    public static void main(String[] args) {

        Account a = new Account();
        a.setBalance(12000.0);

        System.out.println("Balance " + a.getBalance());

    }
}

