package Assinment;

import java.util.Scanner;

public class LargestAndSecondLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size : ");

        int size=sc.nextInt();

       int[] array = new int[size];

        for (int i = 0; i < 5; i++) {

            array[i]=sc.nextInt();

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
}
