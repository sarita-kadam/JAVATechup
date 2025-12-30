package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeInfo {

    public static void main(String[] args) {

        List<Employee> emplist = new ArrayList<>();
        emplist.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        emplist.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        emplist.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        emplist.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        emplist.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        emplist.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        emplist.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        emplist.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        emplist.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        emplist.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        emplist.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        emplist.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        emplist.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        emplist.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        emplist.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        emplist.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        emplist.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        //1. How many male and female employee
        System.out.println("----------------How many male and female employee------------------");
        Map<String, Long> map = emplist.stream()
                .collect(Collectors.groupingBy(emp -> emp.getGender(), Collectors.counting()));
        System.out.println(map);


        //2. Average age of male and female
        System.out.println("-----------------Average age of male and female-------------------");
        Map<Object, Double> mapage = emplist.stream()
                .collect(Collectors.groupingBy(emp -> emp.getGender(), Collectors.averagingDouble(em -> em.getAge())));
        System.out.println(mapage);


        //3. department name
        System.out.println("----------------department name-----------------");
        emplist.stream()
                .map(e -> e.getDepartment())
                .distinct()
                .forEach(e -> System.out.println(e));

        //4. details Max Salary
        System.out.println("---------------Details of Max Salary----------------");
        Employee empmax = emplist.stream().collect(Collectors.maxBy((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()))).orElse(null);
        System.out.println(empmax);

        System.out.println("-----------------Details of employee------------------");
        System.out.println(empmax.getName());
        System.out.println(empmax.getAge());
        System.out.println(empmax.getDepartment());
        System.out.println(empmax.getId());
        System.out.println(empmax.getYearOfJoining());
        System.out.println(empmax.getGender());
        System.out.println(empmax.getSalary());


        // details of min salary
        System.out.println("---------------Details of Min Salary----------------");

        Employee empmin = emplist.stream()
                .collect(Collectors.minBy(((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())))).orElse(null);
        System.out.println(empmin);

        //OR

        System.out.println(empmin.getId());
        System.out.println(empmin.getName());
        System.out.println(empmin.getGender());
        System.out.println(empmin.getDepartment());
        System.out.println(empmin.getAge());
        System.out.println(empmin.getYearOfJoining());
        System.out.println(empmin.getGender());
        System.out.println(empmin.getSalary());

        //5. after 2015 employee name
        System.out.println("---------------After 2015 employee name-----------------------");
        emplist.stream().filter(e -> e.getYearOfJoining() > 2015)
                .forEach(e -> System.out.println(e));

        //6.Count number of employee in each department
        System.out.println("--------------Average salary of each department---------------");
        Map map1 = emplist.stream().collect(Collectors.groupingBy(
                em -> em.getDepartment(),
                Collectors.counting()));

        System.out.println(map1);
    }
}