package Stream;

import Java8.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeList {

    public static void main(String[] args) {

        List<Employe> emplist = new ArrayList<Employe>();
        emplist.add(new Employe(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        emplist.add(new Employe(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        emplist.add(new Employe(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        emplist.add(new Employe(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        emplist.add(new Employe(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        emplist.add(new Employe(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        emplist.add(new Employe(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        emplist.add(new Employe(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        emplist.add(new Employe(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        emplist.add(new Employe(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        emplist.add(new Employe(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        emplist.add(new Employe(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        emplist.add(new Employe(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        emplist.add(new Employe(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        emplist.add(new Employe(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        emplist.add(new Employe(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        emplist.add(new Employe(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


     /*   //How many male and female employee
        Map<String,Long> MaleAndFemale = emplist.stream()
                        .collect(Collectors.groupingBy(Employe::getGender,Collectors.counting()));
        System.out.println(MaleAndFemale);


        //Print the name of all departments in the organization?
       Map<String,Long> departments = emplist.stream()
               .collect(Collectors.groupingBy(Employe::getDepartment,Collectors.counting()));
        System.out.println(departments);

        emplist.stream()
                .map(emp-> emp.getDepartment())
                .distinct()
                .forEach(System.out::println);


        //What is the average age of male and female employees?

        Map<String,Double> averageage = emplist.stream()
                .collect(Collectors.groupingBy(Employe::getGender,Collectors.averagingInt(Employe::getAge)));
        System.out.println(averageage);




        //Get the details of highest paid employee in the organization?

        Optional<Employe> highestPaidEmployee = emplist.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employe::getSalary)));
        System.out.println(highestPaidEmployee);

*/
        //4. details Max Salary

        Employe empmax = emplist.stream()
                .collect(Collectors.maxBy((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())))
                .orElse(null);
        System.out.println(empmax);

        System.out.println(empmax.getName());
        System.out.println(empmax.getAge());
        System.out.println(empmax.getDepartment());
        System.out.println(empmax.getId());
        System.out.println(empmax.getYearOfJoining());
        System.out.println(empmax.getGender());
        System.out.println(empmax.getSalary());

        //max age of employee

        Employe maxage = emplist.stream()
                .collect(Collectors.maxBy((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge())))
                .orElse(null);
        System.out.println(maxage);


    }
}
