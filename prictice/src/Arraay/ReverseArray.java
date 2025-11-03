package Arraay;

public class ReverseArray {
    public static void main(String[] args) {


        int[] a = {6, 9, 2, 6, 3, 1,};

        for (int i = 0; i < a.length - 1; i++) {

            for (int j = i; j < a.length - 1; j++) {

                if (a[i] < a[j]) {

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}



// * Reverse Array
// - used for Descending order

//for (int j = arr.length-1; j >= 0; j--) {
/// /
/// /                if(arr[j] < arr[i]);
/// /                {
/// /
/// /                    int temp = arr[i];
/// /                    arr[i] = arr[j];
/// /                    arr[j] = temp;
/// /
/// /
