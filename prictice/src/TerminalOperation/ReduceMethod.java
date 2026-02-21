package TerminalOperation;

//reduce() Method : Combines elements into single result.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethod {
    public static void main(String[] args) {


        //Sum of numbers

        List<Integer> integerList = Arrays.asList(2, 3, 7, 4, 9, 5);
        int sum = integerList.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);


       // reduce() for Multiplication

       List<Integer> integerList1 = Arrays.asList(3,8,9,5,4,1,2);
       int mul = integerList1.stream()
               .reduce(1,(a,b) -> a * b);
        System.out.println(mul);

        // reduce for string

        List<String> stringList = Arrays.asList("java","python","NodeJs");
        String string = stringList.stream()
                .reduce("", (a,b) -> a + b);
        System.out.println(string);


    }
}
