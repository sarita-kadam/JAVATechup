package IntermediateOperationJava8;

//limit(long maxSize)  = Get elements from stream based on given size

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LimitMethod {

    public static void main(String[] args) {

        //Print 1st 3 company

        List<String> stringList = Arrays.asList("City","Nice","TCS","Google","Wipro");
        stringList.stream()
                .limit(3)
                .forEach(System.out::println);

        //limit() with filter()

        List<Integer> integerList = Arrays.asList(20,10,40,50,30,70);
        integerList.stream()
                .filter(i-> i > 20)
                .limit(2)
                .forEach(System.out::println);

        //limit() with Sorted Data

        List<Integer> integerList1 = Arrays.asList(3,7,1,3,2,9,4,8);
        integerList1.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        //Find Top 3 Highest Salaries

        List<Integer> integerList2List = Arrays.asList(20000,50000,10000,30000,80000);
        integerList2List.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);
    }
}
