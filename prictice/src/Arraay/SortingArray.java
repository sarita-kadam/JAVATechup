package Arraay;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {

        int[] arr = {44,22,77,11,99};

        int temp;

        for (int i = 0; i < arr.length; i++){


            for (int j = 0; j < arr.length-1-i; j++){

                if(arr[j] > arr[j +1]){

                    temp = arr[j];

                    arr[j] = arr[j+1];

                    arr[j+1] = temp;

                   // flag = 1;

                }
            }
           // if (flag == 0){
           //     break;
           // }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}

// * Sorting Array

// - used for ascending array