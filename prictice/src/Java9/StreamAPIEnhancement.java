package Java9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIEnhancement {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(6,1,3,2,4,9,7);

        List<Integer> result = list.stream()
                .filter(num-> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(result);


        //takeWhile()
        List<Integer> result1 = list.stream()
                .takeWhile(num-> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(result1);


        //doWhile
        List<Integer> result3 = list.stream()
                .dropWhile(num-> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(result3);

       // Stream.iterate(1, x -> x + 1).forEach(System.out::println);
        Stream.iterate(100, x-> x + 1).limit(10).forEach(System.out::println);

    }
}
