package Regest;

import java.util.regex.Pattern;

public class CurrencyValidation {

    public static void main(String[] args) {

        // For Indian Currency Validation : ^₹?\d+(\.\d{2})?$

        String regex = "^₹?\\d+(\\.\\d{2})?$";
        String amount = "₹8000.50";
        boolean result = Pattern.matches(regex, amount);
        System.out.println("Valid Currency: " + result);


        String regex1 = "^₹?\\d{1,3}(,\\d{3})*(\\.\\d{2})?$";
        String amount1 = "₹1,23,456.78";
        boolean result1 = Pattern.matches(regex1,amount1);
        System.out.println(result1);


       // For USA Currency Validation

        String regex2 = "^\\$?\\d{1,3}(,\\d{3})*(\\.\\d{2})?$";
        String amount2 = "$10,000.50";
        boolean result2 = Pattern.matches(regex, amount);
        System.out.println("Valid US Currency: " + result);


    }
}
