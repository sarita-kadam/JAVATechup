package Arraay;

public class DescendingArray {
    public static void main(String[] args) {

        int[] array = {7,3,1,8,5};


        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if (array[i] > array[j]){   // use logic < / >

                    int temp = array[0];

                     temp = array[i];

                     array[i] = array[j];

                     array[j] = temp;

                }

            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println( + array[i]);

        }
    }
}
