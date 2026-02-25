package Regest;

import java.util.regex.Pattern;

public class PhoneNumberValidation {

    public static void main(String[] args) {

        //Regex Pattern for Phone Number : ^\d{10}$
        //The number must contain exactly 10 digits only

        String regex = "^\\d{10}$";

        String phone = "9067446022";

        boolean result = Pattern.matches(regex,phone);

        System.out.println(result);


        //^[0-9]{10}$

        String regex1 = "^[0-9]{10}$";

        String phone1 = "9022446744";

        boolean result1 = Pattern.matches(regex1,phone1);

        if (Pattern.matches(regex1,phone1)){
            System.out.println("Valid Phone Number");
        }else {
            System.out.println("Invalid Phone Number");
        }

        //USA : ^(\\(?[2-9][0-9]{2}\\)?[- ]?[0-9]{3}[- ]?[0-9]{4})$

        String regex2 = "^(\\(?[2-9][0-9]{2}\\)?[- ]?[0-9]{3}[- ]?[0-9]{4})$";

        String phone2 = "(212) 555-7890";

        boolean result2 = Pattern.matches(regex2,phone2);

        System.out.println(result2);
    }
}
