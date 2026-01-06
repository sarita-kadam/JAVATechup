package Java8;

import java.lang.FunctionalInterface;
import java.util.Arrays;
import java.util.List;
import java.util.*;

@FunctionalInterface
 interface Consumer<T>{

    void accept(T t );
}

public class ConsumerInterface {

    public static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println("Hello " + s);

        consumer.accept("sarita");

        List<Integer> list = Arrays.asList(10,20,30,40);

        list.stream().forEach(System.out::println);

        Consumer<Integer> print = n -> System.out.println(n);
    }
}
