package Arraay;

public class OddEven {

    public static void main(String[] args) {

        int[] arr = {12,4,32,69,32,33,77};

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0 ){
                System.out.println(+arr[i]+" = number is Even");
            }
            else {
                System.out.println(+arr[i]+" = number is Odd");
            }
        }

//        OddEven scanner = new OddEven (System.in);
//
//        System.out.println("Enter the number = ");
//
//        int number = scanner.nextint();
//
//        if (number % 2 == 0){
//            System.out.println(number + "number is even");
//        }
//
//        else {
//            System.out.println(number + "number is odd");
//        }
//
//        scanner.close();
    }
}

