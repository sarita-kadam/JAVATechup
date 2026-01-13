package Arraay;

public class DescendingArray {

    public static void main(String[]args) {

        int[] arr = {7,3,1,8,5};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] > arr[j]){

                     int temp = arr[0];
                     temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;

                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
    }
}
