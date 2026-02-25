package Regest;

import java.util.regex.Pattern;

public class EmailValidation {

    public static void main(String[] args) {

        //Email Validation : ^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String email = "sarita@gmail.com";
        boolean result = Pattern.matches(regex,email);
        System.out.println(result);


        // invalid emailId

        String regex1 = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String email1 = "@sarita.com";
        boolean result1 = Pattern.matches(regex1,email1);
        if (Pattern.matches(regex1,email1)){
            System.out.println("valid email id");
        }else {
            System.out.println("invalid email id");
        }


    }
}
