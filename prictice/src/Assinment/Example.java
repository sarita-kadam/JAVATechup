package Assinment;

public class Example {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7};
        int[] arr3 = {7, 8, 9, 10};


        int[] arr4 = new int[arr1.length + 2];

        int index = 0;

        for (int i = 0; i < arr1.length; i++)

        {
            boolean element = false;

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    element = true;
                    break;
                }
            }

            if (!element)
            {
                arr4[index] = arr1[i];
                index++;
            }
        }

        arr4[index++] = arr3[arr3.length - 2];
        arr4[index++] = arr3[arr3.length - 1];


        System.out.print("arr4 = ");

        for (int i = 0; i < index; i++)
        {
            System.out.print(arr4[i] + " ");
        }
    }
}
