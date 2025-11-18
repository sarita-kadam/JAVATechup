package Assinment;

public class ArraySumAndAvg {

            public static void main(String[] args) {

                int[] Array = {2,1,6,8,6};

                int a = 0;

               int sum = Array.length;

                for (int i = 0; i < Array.length ; i++) {

                    a = a + Array[i];

                }

                System.out.println(a);

                int avg = a / sum;

                System.out.println("Result is " +avg);

            }
 }






