package Java8;
import java.lang.FunctionalInterface;
import java.util.*;
import java.util.stream.Collectors;

// Write a Java program to implement a lambda expression to find the sum of two integers.

@FunctionalInterface
interface Addition{
    void addition();
}

// Write a Java program to implement a lambda expression to check if a given string is empty.

@FunctionalInterface
interface ChekStringIsEmpty{
    void check(String name);
}

// Write a Java program to implement a lambda expression to filter out even and
// odd numbers from a list of integers.

@FunctionalInterface
interface EvenOddNumber{
    void evenOddNumber();

}

// Write a Java program to implement a lambda expression to sort a list of
// strings in alphabetical order.

@FunctionalInterface
interface SortedString{
    void sorted();
}

// Write a Java program to implement a lambda expression to find the average of a list of doubles.

@FunctionalInterface
interface AverOfList{
    void average();
}

// Write a Java program to implement a lambda expression to remove duplicates
// from a list of integers.

@FunctionalInterface
interface RemoveDuplicate{
    void DuplicateElement();
}
public class LambdaExpressionCoding {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Addition addition = () -> {
            System.out.println("Enter First Number : ");

            int first = scanner.nextInt();

            System.out.println("Enter Second Number : ");

            int second = scanner.nextInt();

            int add = first + second ;

            System.out.println("Addition " + add);

        };
       // addition.addition();

        ChekStringIsEmpty chekStringIsEmpty = (name) -> {

            if (name.isEmpty()){
                System.out.println("Name is Empty");
            }

            System.out.println("name is uppercase " + name.toUpperCase());
           System.out.println("name is toLowercase " + name.toLowerCase());
        };
       // chekStringIsEmpty.check("sara");

        EvenOddNumber evenOddNumber = () -> {
            System.out.println("Enter Number : ");

            int num = scanner.nextInt();

            if (num % 2 == 0){
                System.out.println("Number is Even");
            }else {
                System.out.println("Number is Odd");
            }
        };
       // evenOddNumber.evenOddNumber();

        SortedString sortedString = () -> {
            List<String> list = new ArrayList<>();
            list.add("Sara");
            list.add("riya");
            list.add("Nia");
            list.add("sona");
            list.add("mona");
            list.add("rahi");

            System.out.println("Original String....");
            System.out.println(list);

            list.sort((s1,s2) -> s1.compareTo(s2));
            System.out.println("Sorted List....");

            System.out.println(list);

        };
       // sortedString.sorted();

        RemoveDuplicate removeDuplicate = () ->{

            List<Integer> integerList = new ArrayList<>();
            integerList.add(20);
            integerList.add(20);
            integerList.add(10);
            integerList.add(40);
            integerList.add(50);
            integerList.add(10);

            Set set = new HashSet<>(integerList);
            System.out.println( " Remove Duplicate Element " + set);
        };
       // removeDuplicate.DuplicateElement();

      /*  AverOfList averOfList = () ->
                Arrays.asList(20.0, 55.0, 22.0, 10.0)
                        .stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(0);
        System.out.println(averOfList.average());*/

    }

}
