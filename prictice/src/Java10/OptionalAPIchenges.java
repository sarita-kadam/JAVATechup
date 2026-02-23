package Java10;

import java.util.Optional;

public class OptionalAPIchenges {

    public static void main(String[] args) {


        //🔸 Before Java 10 (Java 8 / 9) :You had to pass exception manually:

       Optional<String> optional = Optional.of("Java");

       String value = optional.orElseThrow(() ->
                new RuntimeException("Value not found"));
        System.out.println(value);

        /*Optional<String> optional1 = Optional.of(null);
        String value1 = optional.orElseThrow(() ->
                new RuntimeException("Value not found"));
        System.out.println(value1); // Throw NullPointerException*/



        //🔸 In Java 10 : You can call orElseThrow() without passing exception:
        //If value is present → returns value
        //If empty → throws NoSuchElementException

        Optional<String> optional2 = Optional.of("ReactJS");

        String value3 = optional2.orElseThrow();
        System.out.println(value3);
    }
}
