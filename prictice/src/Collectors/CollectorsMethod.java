package Collectors;

import Java8.Employee;

import java.util.*;
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

        List<Integer> number = Arrays.asList(1,2,3,1,2,5);

        Set<Integer> integerList = number.stream()
                .collect(Collectors.toSet());
        System.out.println(integerList);

   //toMap() :Collect elements into a Map(Convert List → Map)

        List<String> stringList1 = Arrays.asList("sara" ,"riya","nia");

        Map<String,Integer> map = stringList1.stream()
                .collect(Collectors.toMap(
                        n -> n,
                        n-> n.length()
                ));
        System.out.println(map);


        //counting() : Count number of elements

        List<Integer> list3 = Arrays.asList(2,3,4,5,1,7);

        long count  = list3.stream()
                .collect(Collectors.counting());
        System.out.println(count);


        //groupingBy() :Group elements based on a condition (Return map)

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));


        //1. How many male and female employee
        Map<String,Long> emplist = employeeList.stream()
                .collect(Collectors.groupingBy(emp-> emp.getGender(),Collectors.counting()));
        System.out.println(emplist);

         employeeList.stream()
                 .filter(e-> e.getYearOfJoining() > 2012)
                 .forEach(System.out::println);
    }
}
