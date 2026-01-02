package Stream;

import java.util.*;

public class SecondHighest {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10);

        int SecondHighest = list.stream()
                .sorted(Comparator.reverseOrder()) // → 50, 40, 30, 20, 10
                .skip(1)   // → skip highest (50)
                .findFirst() // → second highest (40)
                .orElseThrow();
        System.out.println(SecondHighest);


        //Handle duplicates

        List<Integer> list1 = Arrays.asList(10,40,20,30,50,10,50,40,60,90,70);

        int secondHighest = list1.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
               .findFirst()
                .orElseThrow();
        System.out.println(secondHighest);

        //Using limit() (Alternative)

       List<Integer> list2  = Arrays.asList(10,20,60,40,30,90,70);

       int secondhighest = list2.stream()
               .sorted(Comparator.reverseOrder())
               .limit(2)
               .skip(1)
               .findFirst()
               .orElseThrow();
        System.out.println(secondhighest);

    }
}
