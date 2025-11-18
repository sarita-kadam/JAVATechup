package Assinment;

public class ReverceNumber {

    public static void main(String[] args) {

        int number = 12345;

        int rev = 0;

        while(number != 0){

            int num = number % 10;

            rev = rev * 10 + num;

            number = number / 10;

        }
        
        System.out.println("reverse number: " +rev);
    }
}

