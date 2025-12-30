package Stream;

import java.util.Arrays;
import java.util.List;

class Employee{

    String Name;
    int Age;
    int EmpId;
    double Salary;

    public Employee(String name, int age, int empId, double salary) {
        Name = name;
        Age = age;
        EmpId = empId;
        Salary = salary;
    }
}


public class FilterOperation {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("sru",21,101,10000),
                new Employee("neha",22,102,9000.0),
                new Employee("nia",23,103,50000),
                new Employee("riya",14,104,120000.0)
        );

        employeeList.stream()
                .filter(e -> e.Salary > 11000.0)
                .forEach(e -> System.out.println(e.Name));
    }
}
