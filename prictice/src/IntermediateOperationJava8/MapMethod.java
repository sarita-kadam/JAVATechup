package IntermediateOperationJava8;

// Map() Method : Used to Transform the stream Elements and return transformed Elements into new Stream.
//forEach(Consumer<T> c)    // to print stream  void accept()

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {

    private String name;
    private int age;
    private double salary;

    public MapMethod(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "MapMethod{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        // Convert string elements to uppercase Find length of each string element.
        List<String> stringList = Arrays.asList("sarita", "saru", "tara", "Ram");

        stringList.stream()
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s + " length :" + s.length()));

        stringList.stream()
                .map(s -> s.toUpperCase())
                .map(s -> s.length())
                .forEach(System.out::println);

        //Convert string elements to uppercase

        stringList.stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        //Find length of each string element.

        stringList.stream()
                .map(s -> s.length())
                .forEach(System.out::println);

        // Find length of name which starting with "s"

        stringList.stream()
                .filter(s -> s.startsWith("s"))
                .forEach(s -> System.out.println(s + " length : " + s.length()));

        //Print emp name with Emp Age whose salary is >= 50000 using stream

        List<MapMethod> mapMethodList = new ArrayList<>();
        mapMethodList.add(new MapMethod("sara", 21, 900000));
        mapMethodList.add(new MapMethod("riya", 22, 500000));
        mapMethodList.add(new MapMethod("mira", 20, 10000));
        mapMethodList.add(new MapMethod("nia", 34, 55000));
        mapMethodList.add(new MapMethod("sia", 13, 10000));
        mapMethodList.add(new MapMethod("ram", 43, 20000));

        mapMethodList.stream()
                .filter(emp -> emp.getSalary() >= 50000)
                .map(emp -> emp.getName() + " : " + emp.getAge())
                .forEach(emp -> System.out.println(emp));


        //Convert Names to Uppercase

        List<String> stringList1 = Arrays.asList("sarita", "kadam");
        stringList1.stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);


        //Square of Numbers

        List<Integer> integerList = Arrays.asList(2, 4, 3, 5, 7, 9);
        integerList.stream()
                .map(num -> num * num)
                .forEach(System.out::println);

        //Convert String to Length

        List<String> strings = Arrays.asList("java", "python");
        List<Integer> list = strings.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(list);


    }
}