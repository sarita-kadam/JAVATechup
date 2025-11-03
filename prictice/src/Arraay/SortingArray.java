package Arraay;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {


        // o/p = is a ascending array

        int [] a = {3,6,1,7};

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                if (a[i] > a[j]){

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
            for(int i =0; i<a.length;i++)
            {
            System.out.println(a[i] +" " );
            }
    }


}

// * Sorting Array

// - used for ascending array