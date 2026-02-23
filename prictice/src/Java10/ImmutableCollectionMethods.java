package Java10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImmutableCollectionMethods {

 //ImmutableCollectionMethods
 //1. List.copyOf()
 //2. Set.copyOf()
 //3. Map.copyOf()
 //4.Collectors.toUnmodifiableList()
 //5.Collectors.toUnmodifiableSet()
 //6.Collectors.toUnmodifiableMap()


    public static void main(String[] args) {

        var list = new ArrayList<Integer>();
        list.add(10);
        list.add(8);
        list.add(39);
        list.add(99);

       List<Integer> result = list.stream()
                .filter(i-> i % 2==0)
                .collect(Collectors.toUnmodifiableList());
      // result.add(100); //UnsupportedOperationException
        System.out.println(result);

        List<Integer> result1 = List.copyOf(list);
        result1.add(500);
        System.out.println(result1);


    }
}
