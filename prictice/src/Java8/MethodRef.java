package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRef {

    public MethodRef() {
    }

    public static void show(String name){
        System.out.println(name);

    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("sara" , "Riya", "Mira");

       // list.forEach(x -> System.out.println(x));

       // list.forEach(System.out::println);

       // list.forEach(MethodRef::show);

        list.stream()
                .map(x-> x.toUpperCase())
                .forEach(MethodRef::show);


    }
}
