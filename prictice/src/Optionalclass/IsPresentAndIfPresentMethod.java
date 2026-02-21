package Optionalclass;

import java.util.Optional;

public class IsPresentAndIfPresentMethod {

    public static void main(String[] args) {

        //isPresent() : Checks if value is present. Returns: true or false

        Optional<String> optional = Optional.ofNullable(null);
        if (optional.isPresent()){
            System.out.println("value is parent");

        }else {
            System.out.println("value not parent");
        }

        //ifPresent() : Executes code only if value is present.

        Optional<String> optional1 = Optional.ofNullable(null);
        System.out.println(optional1.isPresent());

        //get() :Returns value if present.If empty → throws NoSuchElementException.

        Optional<String> optional2 = Optional.of("Sarita");
        System.out.println(optional2.get());

        //orElse() : Returns value if present, otherwise returns default value.

        Optional<String> optional3 = Optional.of("kadam");
        System.out.println(optional3.orElse("value not found"));

        Optional<Integer> optionalInteger = Optional.ofNullable(null);
        System.out.println(optionalInteger.orElse(0));

        Optional<Integer> optionalInteger1 = Optional.ofNullable(100);
        System.out.println(optionalInteger1.orElse(0));

        //map() :  Transforms value if present.

        Optional<String> optional4 = Optional.of("Sara");
        Optional<String> map = optional4.map(s-> s.toUpperCase());
        System.out.println(map);

        //flatMap() : Used when mapping function already returns Optional.Avoid nested Optional

        Optional<String> optional5 = Optional.of("java");
        Optional<Integer> flatmap = optional5.flatMap(s-> Optional.of(s.length()));
        System.out.println(flatmap);
    }
}
