package Stream;

import java.util.*;
import java.util.stream.Collectors;


//An Intermediate Operation is an operation that processes a Stream and returns another Stream.
//produce a result immediately.
//These operations are executed only when a Terminal Operation is invoked.

public class IntermediateOperations {

    public static void main(String[] args) {

        //filter() : Selects elements based on a condition.

        List<Integer> list = List.of(10,15,20,25);
        list.stream()
                .filter(num -> num > 15)
                .forEach(System.out::println);


        //map() : Transforms each element.
        //Converts each element into its square

        List<Integer> list1 = List.of(2,4,6,8);
        list1.stream()
                .map(num -> num * num)
                .forEach(e -> System.out.println(e));
              //.forEach(System.out::println);

        //distinct() : Removes duplicate elements.
        //Removes duplicate values

        List<String> fruit = List.of("apple","Banana","Kiwi","apple","Kiwi");
        fruit.stream()
                .distinct()
                .forEach(System.out::println);

        // Find Duplicate and print Them
        List<String> name = Arrays.asList("sara","riya","sara","Nia");
        Set<String> duplicate = name.stream()
                .filter(f-> Collections.frequency(name,f) > 1)
                .collect(Collectors.toSet());
        System.out.println(duplicate);

        //sorted() : Sorts elements.  c c c
        // Sorts elements in ascending order.

        List<Integer> number = Arrays.asList(2,5,8,1,9,3);
        number.stream()
                .sorted()
                .forEach(System.out::println);



        //limit(size) : limit of number of element
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        numbers.stream()
                .limit(3)
                .forEach(System.out::println);

        //skip(n) : skip element
        List<Integer> num = List.of(1,2,3,4,5);
        num.stream()
                .skip(3)
                .forEach(System.out::println);

    }
}
