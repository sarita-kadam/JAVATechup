package Collectors;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple" ,"banana", "Apple","Orange", "banana","Kiwi");

        //How do you find duplicate elements in a list using streams


        Set<String> stringSet = fruits.stream()
                .filter(f-> Collections.frequency(fruits,f) > 1)
                .collect(Collectors.toSet());
        System.out.println(stringSet);
    }
}
