package Arraay;

public class FindLargestNumber {

    public static void main(String[] args) {

//        int[] number = {2,11,44,1};
//
//        int largest = number[0];
//
//        for (int i = 1; i < number.length; i++) {
//
//            if(number[i] > largest){
//
//                largest = number[i];
//            }
//        }
//
//        System.out.println(largest);


        int[] number = {22,5,77,8};

        int largest = number[0];

        for (int num : number) {

            if(num > largest){

                largest = num;

            }
        }

        System.out.println(largest);
    }
}
