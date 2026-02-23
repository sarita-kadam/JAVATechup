package Java9;

//In Java 9, interfaces can have private methods.
//These methods are used only inside the interface (mainly to avoid duplicate code in default methods).

import static sun.security.util.KeyUtil.validate;

interface PaymentService {

    default void payByCard() {
       // validate();
        System.out.println("Validating payment details...");
        System.out.println("Payment done using Card");
    }

    default void payByUPI() {
        //validate();
        System.out.println("Validating payment details...");
        System.out.println("Payment done using UPI");
    }

    /*// Private method (Java 9 feature)
    private void validate() {
        System.out.println("Validating payment details...");
    }*/
}
public class PrivateMethodsinInterface implements PaymentService {

    public static void main(String[] args) {

        PrivateMethodsinInterface p = new PrivateMethodsinInterface();
        p.payByCard();
        p.payByUPI();

    }
}
