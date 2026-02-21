package TerminalOperation;

//collect() Method : collect() is a terminal operation used to convert a Stream into a collection like List, Set, or Map.
// It is mainly used with the Collectors class.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectMethod {

    public static void main(String[] args) {

        //Converts stream into a List. collect(Collectors.toList())

        List<Integer> integerList = Arrays.asList(8,5,7,2,3,4,9,1);
        List<Integer> even = integerList.stream()
                .sorted()
                .filter(num-> num % 2 ==0)
                .collect(Collectors.toList());
        System.out.println(even);

        //Removes duplicate elements. collect(Collectors.toSet())

        List<String> stringList = Arrays.asList("java","python","Node js","java","mango db","python");
        Set<String> Duplicate = stringList.stream()
                .collect(Collectors.toSet());
        System.out.println(Duplicate);

        //Converts stream into a Map.collect(Collectors.toMap())

        List<String> strings = Arrays.asList("Mango","Apple","Orange","Strawberry") ;
        Map<String,Integer> map = strings.stream()
                .collect(Collectors.toMap(fruit-> fruit, fruit-> fruit.length()));
        System.out.println(map);

        //Groups elements based on condition. collect(Collectors.groupingBy())

        List<String> name = Arrays.asList("Ram","Shyam","Sita");
        Map<Integer, List<String>> grouped = name.stream()
                .collect(Collectors.groupingBy(n-> n.length()));
        System.out.println(grouped);


    }
}
