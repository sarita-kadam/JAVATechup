package IntermediateOperationJava8;

//distinct() :  To get Unique elements from stream.

import java.util.Arrays;
import java.util.List;

public class DistinctMethod {

    public static void main(String[] args) {


        //Selecting only unique names

        List<String> stringList = Arrays.asList("java","python","mango DB","java","python");
        stringList.stream()
                .distinct()
                .forEach(System.out::println);

        //  //Print Uniques elements

        List<Integer> integerList = Arrays.asList(2,3,2,4,5,3,7);
        integerList.stream()
                .distinct()
                .forEach(System.out::println);


    }

}
