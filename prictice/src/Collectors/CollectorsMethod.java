package Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsMethod {

    public static void main(String[] args) {

        //toList() : Collects stream elements into a List.

        List<String> name = Arrays.asList("sara" ,"riya","nia");

        List<String> stringList = name.stream()
                .map(n-> n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(stringList);

    //toSet() : Collects elements into a Set (removes duplicates)


    }
}
