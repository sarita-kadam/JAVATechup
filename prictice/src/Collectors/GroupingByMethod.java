package Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employees{

    int id;
    String name;
    String Department;
    double salary;

    public Employees(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        Department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return Department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Department='" + Department + '\'' +
                ", salary=" + salary +
                '}';
    }
}


public class GroupingByMethod {

    public static void main(String[] args) {

        List<Employees> employeesList = new ArrayList<Employees>();
        employeesList.add(new Employees(100,"sara","IT",2000));
        employeesList.add(new Employees(102,"Riya","HR",10000));
        employeesList.add(new Employees(101,"Mira","IT",50000));
        employeesList.add(new Employees(103,"Ram","HR",4000));

        //Count Employees in Each Department

        Map<String,Long> count = employeesList.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment,Collectors.counting()));
        System.out.println(count);

        //Group by Department

         Map<String, List<Employees>> grouped =employeesList.stream()
                        .collect(Collectors.groupingBy(Employees::getDepartment));
         System.out.println(grouped);


         //Sum Salary by Department

        Map<String,Double> salary = employeesList.stream()
                .collect(Collectors.groupingBy(Employees::getDepartment,Collectors.summingDouble(emp-> emp.getSalary())));
        System.out.println(salary);
    }
}

