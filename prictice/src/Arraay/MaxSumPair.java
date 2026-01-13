package Arraay;

public class MaxSumPair {

    public static void main(String[] args) {

                int[] arr = {1, 7, 2, 5};

                int firstMax = Integer.MIN_VALUE;

                int secondMax = Integer.MIN_VALUE;

                for (int i = 0; i < arr.length; i++) {

                    if (arr[i] > firstMax) {

                        secondMax = firstMax;

                        firstMax = arr[i];

                    }
                    else if (arr[i] > secondMax) {

                        secondMax = arr[i];
                    }
                }

                System.out.println("Numbers with maximum sum: " + firstMax + " and " + secondMax);

                System.out.println("Maximum sum: " + (firstMax + secondMax));
            }
        }


