package Arraay;

public class FindSmallestNumber {

    public static void main(String[] args) {

//        int[] number = {12,22,2,11,3};
//
//        int smallest = number[0];
//
//        for (int num : number){
//
//            if(num < smallest){
//
//                smallest = num;
//            }
//        }
//
//        System.out.println(smallest);


        int[] number = {11,2,44,7,99};

        int smallest = number[0];

        for (int i = 1; i < number.length; i++) {

            if(number[i] < smallest){

                smallest = number[i];
            }
        }

        System.out.println(smallest);
    }
}
