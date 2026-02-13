package Java8;

//Method Reference = A short way to call a method using ::
//A Method Reference in Java is a shorthand way to refer to
// an existing method without executing it immediately.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employees{

   private String name;
   private double salary;

    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class MethodRefCode {

    public static void main(String[] args) {

        List<Employees> list = Arrays.asList(
                new Employees("Ram", 50000),
                new Employees("Shyam",100000),
                new Employees("saru", 20000)
        );

        //Sorting using Method Reference
        list.sort(Comparator.comparing(Employees::getSalary));

        // Printing using Method Reference

        list.forEach(employees -> System.out.println(employees.getName() + employees.getSalary())
        );



    }
}
