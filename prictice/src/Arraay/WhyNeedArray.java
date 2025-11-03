package Arraay;

public class WhyNeedArray {
    public static void main(String[] args) {

//        int[] a = new int[10]; //  syntax 1 : datatype[] refrencename = newdatatype [size]
//        a [0] = 10;
//        a [1] = 20;
//        a [2] = 30;
//        a [3] = 40;
//
//        System.out.println(a);
//
//        //int[] arr = {2,4,9,8};           // datatype[] refrence name={value}
//
//        System.out.println(a.length);
//

//        int[] A = {1,3,5,6,7,9,5};
//        System.out.println(A.length);
//
//        int[] B = {4,22,5,43,88,122,5,0};
//        System.out.println(B.length);



//        int[] AA = new int[4];
//        AA[0] = 10;
//        AA[1] = 11;
//        AA[2] = 12;
//        AA[3] = 13;
////        AA[4] = 14;
////        AA[5] = 15;
//
//        System.out.println(AA[0]);  // Accessing element in array

        int [][] matrix = {
                {4,7,9,0},
                {1,4,8,1},
                {5,2,9,1},
                {3,9,4,1}

        };

        System.out.println(matrix[3][2]);

    }
}

// * Array

//-	array is allows us to store multiple values of the same data type.
//-	Fixed Size:   Once an array is created, its size cannot be changed.
//-	Indexed Access: Elements are accessed using a zero (0) based index.
// - Arrays are objects, so they are stored in the heap memory.

// Syntax :
//  Int [] A = new Int [10];
//  Int [] a = {2,4,9,8};

// * Types of Arrays

// 1] Single-Dimensional Array

// String[] name = {"ram","sita" 1};  // in array string are use for store multiple or diffrent type of element you can stored in array
// System.out.println(names[1]);      // o/p = sita (beacase array is start from 0 in java & 1 element at index is "sita" which is printed.

// 2] Multidimentional Array / Two- Dimentional Array

//          int[][] matrix = {
//                         {1,2,3},
//                         {4,5,6}
//                      };
//           System.out.println(matrix[1][2]);