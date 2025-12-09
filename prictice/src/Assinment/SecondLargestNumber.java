package Assinment;

public class SecondLargestNumber {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i <= arr.length -1; i++){

            for (int j = i + 1; j <= arr.length-1; j++){

                if (arr[i] > arr[j]){

                    int temp = arr[i];

                    arr[i +1] = temp;

                    arr[i] = arr[i+1];
                }
            }
        }
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("second largest number is: " + arr[arr.length-2]);
    }
}
