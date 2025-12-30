package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProgram {

    public static void main(String[] args) {

      // List<Integer>  list =  List.of(10,15,20,25,30,35);
        // list.add(40);   // Exception "UnsupportedOperationException" because of List.of() method create immutable list
      //  System.out.println(list);

       // List<Integer> list = Arrays.asList(10,15,20,25,30,35);
       // list.add(40);   // Exception "UnsupportedOperationException" because of Array.asList() method create fixed sizes immutable list
      //  System.out.println(list);


        // without stream  find Even Number
        /*List<Integer> list = Arrays.asList(10,15,20,25,30,35);
        List<Integer> list1 = new ArrayList<>();

        for (Integer i : list){

            if (i % 2 == 0 ){
                System.out.println(i);
            }
        }*/


        //Using Stream
       /* List<Integer> list = Arrays.asList(10,15,20,25,30,35);
        Stream<Integer> stream = list.stream();
         List<Integer> newList =  stream
          .filter(i -> i % 2 == 0 )
          .collect(Collectors.toList());
          System.out.println(newList);
         */

       /* List<Integer> list = Arrays.asList(10,15,20,25,30,35);
        List<Integer> newList = list.stream()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());
                 System.out.println(newList);*/

        List<Integer> list = Arrays.asList(10,15,20,25,30,35,55,60,70,80);
        List<Integer> newList =  list.stream()
                .filter(integer -> integer > 50)
                .collect(Collectors.toList());
                 System.out.println(newList);

    }
}
