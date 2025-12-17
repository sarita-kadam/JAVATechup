package Arraay;

public class DuplicateArray {

    public static void main(String[] args) {

        int[] A = {4, 5, 7, 1, 5, 6, 9, 7};

        for (int i = 0; i < A.length; i++) {

            for (int j = i + 1; j < A.length; j++) {

                if (A[i] == A[j]) {

                    System.out.println(A[i]);

                }

            }
        }
    }

}




