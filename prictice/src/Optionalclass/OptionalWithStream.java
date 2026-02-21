package Optionalclass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalWithStream {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("java","python","MangoDB","javascript");
        Optional<String> optional = stringList.stream()
                .filter(name-> name.startsWith("m"))
                .findFirst();
        System.out.println(optional.orElse("Not found"));
    }

}
