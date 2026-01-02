package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Collections.frequency() Method : It is used to count how many times a specific element appears in a collection.
//Return Value : Returns an int representing the number of times the given element occurs in the collection.

public class FreqeuncyMethod {

    public static void main(String[] args) {

        List<Integer> number = List.of(1, 2, 2, 3, 4, 4, 5);
        int count = Collections.frequency(number,4); // 2
        System.out.println(count);


        List<String> fruit = List.of("Apple", "Banana", "Orange","Apple");
        Set<String> duplicate = fruit.stream()
                .filter(f-> Collections.frequency(fruit,f) > 1)
                .collect(Collectors.toSet());
        System.out.println(duplicate);



    }
}
