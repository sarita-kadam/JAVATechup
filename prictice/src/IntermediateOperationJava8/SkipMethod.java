package IntermediateOperationJava8;

//skip(long n) : used to skip given number of elements from starting position of stream.

import java.util.Arrays;
import java.util.List;

public class SkipMethod {

    public static void main(String[] args) {

        //Skip 1st 3 Company

        List<String> stringList = Arrays.asList("City","Nice","TCS","Google","Wipro");
        stringList.stream()
                .skip(2)
                .forEach(System.out::println);

        //skip() with limit() (Very Important)

        List<Integer> integerList = Arrays.asList(3,5,7,1,9,2,11,44,12);
        integerList.stream()
                .skip(4)
                .limit(2)
                .forEach(System.out::println);




    }

}
