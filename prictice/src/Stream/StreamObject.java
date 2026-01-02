package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {

        // way of creating stream

        // 1. blank stream
        /*Stream<Objects> objectsStream = Stream.empty();
        objectsStream.forEach(e ->{
            System.out.println(e);
        });*/


        // 2. array,collections
        /* String[]  names = {"sara" ,"riya" , "siya","mira"};
       Stream<String> stringStream = Stream.of(names);
       stringStream.forEach(e ->{
           System.out.println(e);
       });*/


        // 3.Using Stream.builder()
        Stream<Object> sreambuilder = Stream.builder().build();


        //4
      /* IntStream stream =  Arrays.stream(new int[] {1,2,3,4,5});
       stream.forEach(value -> {
           System.out.println(value);
       });*/

       //4

        List<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(35);

        Stream<Integer> stream = list.stream();
        stream.forEach(integer -> {
            System.out.println(integer);
        });

    }
}
