package Collection;

import java.util.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Collections.frequency() Method : It is used to count how many times a specific element appears in a collection.
//Return Value : Returns an int representing the number of times the given element occurs in the collection.

public class FreqeuncyMethod {

    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        //Using Iterator

        int frequency = 0;

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){

            Integer value = iterator.next();

            if (value.equals(20)){
                frequency ++;
            }
        }

        System.out.println(frequency);

        //Using Collections.frequency()

        List<Integer> number = List.of(1, 2, 2, 3, 4, 4, 5);
        int count = Collections.frequency(number,4); // 2
        System.out.println("frequency of 2 : " + count);


        //Java 8 Stream Way

        List<String> fruit = List.of("Apple", "Banana", "Orange","Apple","Apple","Apple");
        Long duplicate = fruit.stream()
                .filter(f-> Collections.frequency(fruit,f) > 1)
                .count();
        System.out.println("frequency of Apple : " + duplicate);

        List<String> name = Arrays.asList("saru","Ram","shyam","sita","Ram","saru");
        Long freqency = name.stream()
                .filter(s-> s.equals("saru"))
                .count();
        System.out.println(freqency);



    }
}
