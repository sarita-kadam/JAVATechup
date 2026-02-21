package Optionalclass;

import java.util.Optional;

//Optional.ofNullable() : It is used to create an Optional object that may contain null value.
//If value is NOT null → returns Optional containing the value
//If value is null → returns Optional.empty() , It does NOT throw exception
public class OfNullable {

    public static Optional<String> getEmil(){

        //String email = "sarita@gmail.com";
        String email = null;
        return Optional.ofNullable(email);
    }
    public static void main(String[] args) {

        /*//Value is not null

        Optional<String> optional = Optional.ofNullable("sarita");
        System.out.println(optional.get());*/

        //Value is null
        Optional<String> optional1 = Optional.ofNullable(null);
        System.out.println(optional1.isPresent());

        System.out.println(getEmil().orElse("No email found"));


    }
}
