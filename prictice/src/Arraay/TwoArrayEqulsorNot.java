package Arraay;

import java.util.Arrays;

public class TwoArrayEqulsorNot {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};
        int[] arr3 = {4,3,2,1};

        System.out.println(Arrays.equals(arr1,arr2)); // true
        System.out.println(Arrays.equals(arr1,arr3)); // false

    }
}
