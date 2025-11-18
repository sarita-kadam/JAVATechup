package Arraay;

public class DummyArray {
    public static void main(String[] args) {

        int[] Array = {9,2,8,1,4,0};

        int[] dummy = new int[Array.length];

        for (int i = 0; i < Array.length; i++) {

            dummy[i] = Array[i];

        }

        for (int j = 0; j < Array.length; j++) {

            System.out.print( " " + dummy[j]);

        }


//        int[] a = {10,20,30,40};
//
//        int sum = 0;
//
//        for(int number : a){
//            sum = sum + number;
//        }
//
//        System.out.println(+ sum);

    }
}
