package Optionalclass;

// Optional.of() : Used to create Optional with non-null value.If value is null → throws NullPointerException.
//Use when you are sure value is not null.

import java.util.Optional;

public class OfMethod {

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("sarita");
       // Optional<String> optional1 = Optional.of(null);   If value is null, it throws NullPointerException.
        System.out.println(optional.get());

    }
}
