package Arraay;

public class SumofArray {

    public static void main(String[] args) {
        int[] Array = {2,1,6,8,6};

        int a = 0;

        for (int i = 0; i < Array.length; i++) {

            a = a + Array[i];

        }

        System.out.println("Result is " +a);
    }
}
