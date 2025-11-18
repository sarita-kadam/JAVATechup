package Assinment;

public class FindLargestNumber {

        public static void main(String[] args) {

            int[] array = {12, 5, 8, 20, 15};

            int largest = Integer.MIN_VALUE;

            int secondLargest = Integer.MIN_VALUE;

            for (int num : array) {

                if (num > largest) {

                    secondLargest = largest;

                    largest = num;

                }
                else if (num > secondLargest && num != largest) {

                    secondLargest = num;
                }
            }

            System.out.println("Second Largest is a = " + secondLargest);
        }
    }


//        int[] number = {12, 5, 8, 20, 15};
//
//       int largest = number[0];
//
//
//        for (int num : number) {
//
//            if(num > largest){
//
//                largest = num;
//            }
//        }
//
//        System.out.println(largest);


 //   }
//  }

