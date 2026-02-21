package TerminalOperation;

//count() Method : Returns total number of elements. Return type: long

import java.util.Arrays;
import java.util.List;

public class CountMethod {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(3,2,5,9,6,7,1);
        Long number = integerList.stream()
                .filter(n-> n > 5)
                .count();
        System.out.println(number);

        //Simple Count

        List<Integer> integerList1 = Arrays.asList(33,12,75,99,63,72,11);
        Long num = integerList1.stream().count();
        System.out.println(num);

        //Count with Filter

        List<Integer> integerList2 =Arrays.asList(2,1,3,7,5,4,8,9);
        Long Num = integerList2.stream()
                .filter(i-> i % 2 == 0)
                .count();
        System.out.println(Num);

    }
}
