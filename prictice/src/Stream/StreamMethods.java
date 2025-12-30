package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

    public static void main(String[] args) {

        //filter(predicate) : boolean value function return true/false

        List<String> name = List.of("sara","riya","siya","sita","nia");

        List<String> newNames = name.stream()
                .filter(s -> s.startsWith("s")).collect(Collectors.toList());
                 System.out.println(newNames);


        // map(function) : element function return return value

        List<Integer> numberlist = List.of(2,4,11,76,6,8,9,10);
        List<Integer> newNumber = numberlist.stream()
                .map(integer -> integer * integer)
                .collect(Collectors.toList());
                 System.out.println(newNumber);


        // forEach() : forEach() used for travers collection
        numberlist.stream().forEach(integer ->
                System.out.println(integer));

                   // OR

        newNumber.stream().forEach(System.out::println);

        // sorted()
        numberlist.stream().sorted().forEach(System.out::println);


        // min() method
        List<Integer> numberlist1 = List.of(2,4,11,76,6,8,9,10);
        Integer integer =  numberlist.stream()
                .min((x,y) -> x.compareTo(y)).get();
        System.out.println(" Min = " + integer);


        // max() method
        List<Integer> numberlist2 = List.of(2,4,11,76,6,8,9,10);
        Integer integer1 = numberlist2.stream()
                .max((a,b) -> a.compareTo(b)).get();
        System.out.println( " max = "+ integer1);

    }
}
