package Assinment;

public class RemoveDuplicateElement {

    public static void main(String[] args) {

        int[] arr = {10,20,20,50,50,30,40};

        int j = 0;

        for (int i= 0; i < arr.length; i++){

            if (arr[i] != arr[j]){
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }

            System.out.println(arr[i]);
        }
    }
}
