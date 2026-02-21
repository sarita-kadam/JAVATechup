package TerminalOperation;

//forEach() : forEach() is terminal ,Used to perform action on each element.
//It does not return anything (return type is void).


import java.util.Arrays;
import java.util.List;

public class ForEachMethod {

    public static void main(String[] args) {

       //Simple Printing

        List<String> stringList = Arrays.asList("Ram","Shyam","Saru");
        stringList.stream()
                .forEach(System.out::println);


        //With Filter

        List<Integer> integerList = Arrays.asList(2,5,3,6,7,1,8);
        integerList.stream()
                .sorted()
                .filter(i-> i % 2==0)
                .forEach(System.out::println);

        // With Map

        integerList.stream()
                .map(num-> num * num)
                .forEach(System.out::println);
    }
}
