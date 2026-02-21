package Optionalclass;

//empty() Method : Creates empty Optional.empty() is a static method of the Optional class.
//It returns an empty Optional object (no value inside).
//When you want to return “no result” instead of returning null.
import java.util.List;
import java.util.Optional;

public class EmptyMethod {

    public static void main(String[] args) {

        Optional<String> optional = Optional.empty();

        System.out.println(optional);

        System.out.println(optional.isPresent());

        System.out.println(optional.orElse("No name"));

        Optional<String> optional1 = Optional.empty();
        String result = optional1.orElseThrow(() -> new RuntimeException("Value not found"));


    }
}
