package Stream;

//Terminal Operations are the final operations of a stream.
//They produce a result or perform an action and close the stream.
//After a terminal operation, the stream cannot be reused.

import AccessModifer.p1.A;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {

    public static void main(String[] args) {

        //forEach() : Return Type(void) : iterate over element
        List<Integer> list = List.of(10,20,30);
        list.stream()
                .forEach(System.out::println);


        //collect() : Return Type(Collection/Map) : Converts stream to collection
        //Converts stream to List
        List<Integer> list1 = List.of(1,2,3,4,5);
        List<Integer> result =  list1
                .stream()
                .filter(n -> n % 2== 0)
                .collect(Collectors.toList());
        System.out.println(result);


        //count() : Return Type(long) :count number of element
        List<Integer> list2 = Arrays.asList(10,15,20,25);

        long evenCount =   list2.stream()
                .filter(n-> n % 2 == 0)
                .count();
        System.out.println(evenCount);


        //reduce() :Return Type(Optional / value) : Combines elements
        // Find Maximum number using reduce()

        List<Integer> list3 = Arrays.asList(20,22,76,90,100);
        int max = list3.stream()
                .reduce(Integer.MIN_VALUE,(a,b) -> a > b ? a : b);
        System.out.println(max);

        //String Concatenation using reduce()  T reduce(T identity, BinaryOperator<T> accumulator);

        List<String> list4 = List.of("java", "is" ,"easy");
        String sentence = list4.stream()
                .reduce(" " ,(a,b) -> a + " " + b);
        System.out.println(sentence.trim());

        //findAny() : Return Type(Optional) : Returns any element

        List<Integer> list5 = List.of(1,2,3,4,5,9,8,7,6);
        Optional<Integer> result1 = list5.stream()
                .findAny();
        result1.ifPresent(System.out::println);

        //findFirst() : Returns first element
        List<Integer> list6 = List.of(10,20,30);
        Optional<Integer> result2 = list6.stream()
                .findFirst();
        result2.ifPresent(System.out::println);

        //anyMatch(),allMatch(),noneMatch() Return Type(boolean) : Checks condition

        List<Integer> list7 = List.of(2,4,6,8);

        boolean anyEven = list7.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(anyEven);

        boolean allMatch = list7.stream()
                .allMatch(n-> n % 2 == 0);
        System.out.println(allMatch);

        boolean noneMatch = list7.stream()
                .noneMatch(n-> n < 0);
        System.out.println(noneMatch);


    //min()Return Type(Optional) :Finds minimum

        List<Integer> list8 = Arrays.asList(10,20,34,54,19);

        int minNumber = list8.stream()
                .min(Integer::compareTo)
                .get();
        System.out.println(minNumber);

        int maxNumber = list8.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(maxNumber);

        //Using Comparator (Lambda)

        int min = list8.stream()
                .min((a,b) -> a -b)
                .get();
        System.out.println(min);

        int maximum = list8.stream()
                .max((a,b) -> a -b)
                .get();
        System.out.println(maximum);


    //toArray() : Return Type(Object[])  : Converts stream element into array

        List<Integer> list9 = Arrays.asList(10,20,34,54,19);

        Object[] arr = list9.stream().toArray();

        System.out.println(Arrays.toString(arr));

        //Typed Array

        Integer[] array =
                list9.stream().toArray(Integer[]::new);

        System.out.println(Arrays.toString(array));

        // String
       List<String> list10 = Arrays.asList("sara","riya","mira");
       Object[] stringarray = list10.stream().toArray();
        System.out.println(Arrays.toString(stringarray));

        String[] arrays = list10.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(arrays));

    }
}
