package String;

public class ToStringMethod {

    private String accountHolder;
    private double balance;
    private int pin;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public ToStringMethod(String accountHolder, double balance, int pin) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "AccountHolder: " + accountHolder +
                ", Balance: " + balance +
                ", PIN: " + pin;
    }

    public static void main(String[] args) {

        ToStringMethod obj = new ToStringMethod("saru",23000,7645);
        System.out.println(obj); //automatically calls toString()
    }
}
