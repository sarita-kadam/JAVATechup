package IntermediateOperationJava8;

//Filter() Method : used to select elements based on a condition.
//  Stream<T> filter(Predicate<? super T> predicate); : boolean return

import java.util.Arrays;
import java.util.List;

public class FilterMethod {

    public static void main(String[] args) {

        //1. find element more than 50

        List<Integer> integerList = Arrays.asList(23,55,78,99,80,100,76,88,10,11,20);
        integerList.stream()
                .filter(i-> i > 50)
                .forEach(System.out::println);

        //2. Selecting names containing more than 5 characters

        List<String> stringList = Arrays.asList("saru","sarita","Rushi","Ram");
        stringList.stream()
                .filter(s-> s.length() >= 5)
                .forEach(System.out::println);


        List<String> strings = Arrays.asList("saru","sarita","Rushi","Ram");
        strings.stream()
                .filter(s-> s.startsWith("s"))
                .forEach(System.out::println);


        List<String> strings1 = Arrays.asList("saru","sarita","Rushi","Ram");
        strings1.stream()
                .map(s-> s.toUpperCase())
                .forEach(System.out::println);

        //sum of even numbers

        int[] arr = {2,3,4,5,6,7,8};
        int sum = Arrays.stream(arr)
                .filter(i-> i % 2==0)
                .sum();
        System.out.println(sum);



    }
}