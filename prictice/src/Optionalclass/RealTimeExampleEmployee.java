package Optionalclass;

import java.util.Optional;

class Employee{

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class RealTimeExampleEmployee {

    public static void main(String[] args) {

        Optional<Employee> emp = Optional.of(new Employee("Sarita"));

        String name = emp
                .map(Employee::getName)
                .orElse("No Name");

        System.out.println(name);


        Optional<Employee> optional1 = Optional.of(new Employee(null));

        String name1 = optional1
                .map(Employee::getName)
                .orElse("No Name");

        System.out.println(name1);


    }
}
