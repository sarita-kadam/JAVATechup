package Java8;

import java.util.*;
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

        //7. Average salary of each department
        Map<String,Double> everage = emplist.stream()
                .collect(Collectors.groupingBy(e-> e.getDepartment(),Collectors.averagingDouble(e-> e.getSalary())));
        System.out.println(everage);

        //8. Details  of youngest male employee int the product department
        System.out.println("--------Details  of youngest male employee int the product department-------------------");
        Optional<Employee> emp = emplist.stream().filter(n -> n.getGender() == "Male" && n.getDepartment() == "Product Development").collect(Collectors.minBy((o1, o2) -> o1.getAge() - o2.getAge()));
        System.out.println(emp);

        // 9. Who has the most working experience in the organization
        System.out.println("-----------------most working experience in the organization---------------");
        Optional<Employee> most = emplist.stream().collect(Collectors.minBy((o1, o2) -> o1.getYearOfJoining() - o2.getYearOfJoining()));
        System.out.println(most);

        //10. How many male and female employees are there in the sales and marketing team
        System.out.println("---------------male and female employees are there in the sales and marketing team--------------");
        Map<String, Long> malefemale = emplist.stream().filter(e -> e.getDepartment() == "Sales And Marketing").collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
        System.out.println(malefemale);

        //11.What is the average salary of male and female employees
        System.out.println("----------Average salary of male and female employees------------------------");
        Map<String,Double> averagesalary = emplist.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.averagingDouble(e -> e.getSalary())));
        System.out.println(averagesalary);

        //12. List down the names of all employees in each department?
        System.out.println("-------List down the names of all employees in each department-------------");
        Map<String,List<String>>department = emplist.stream().collect(Collectors.groupingBy(e ->e.getDepartment(),Collectors.mapping(e-> e.getName(),Collectors.toList())));
        System.out.println(department);

        //13. What is the average salary and total salary of the whole organization
        System.out.println("------ average salary and total salary of the whole organization-----------------");
        DoubleSummaryStatistics d = emplist.stream().collect(Collectors.summarizingDouble(e->e.getSalary()));
        System.out.println("Average salary : "+d.getAverage());
        System.out.println("Sum of a salary : "+d.getSum());

        Double avg = emplist.stream().collect(Collectors.averagingDouble(r -> r.getSalary()));
        System.out.println(avg);

        Double sum = emplist.stream().collect(Collectors.summingDouble(r -> r.getSalary()));
        System.out.println(sum);

        //14. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years
        System.out.println("25 years old employee");
        Map<Boolean,List<String>> year = emplist.stream().collect((Collectors.partitioningBy(e ->e.getAge()<=25,Collectors.mapping(r->r.getName(),Collectors.toList()))));
        System.out.println(year);



        //15. Who is the oldest employee in the organization? What is his age and which department he belongs to
        System.out.println("Oldest employee");
        Employee employee = emplist.stream().collect(Collectors.maxBy((e1,e2)->e1.getAge()-e2.getAge())).orElse(null);
        System.out.println("Age is : "+employee.getAge());
        System.out.println("Department is : "+employee.getDepartment());

    }
}
