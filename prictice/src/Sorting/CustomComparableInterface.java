package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employe implements Comparable<Employe> {

    private  int id;
    private String firstname;
    private String lastname;
    private  double salary;

    public Employe(int id, String firstname, String lastname, double salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employe o) {
        return Integer.compare(this.id,o.id);
    }
}

public class CustomComparableInterface {

    public static void main(String[] args) {

        Employe Sara = new Employe(3,"Sara","kadam",100000);
        Employe Riya = new Employe(2,"Riya","Patil",80000);
        Employe Mira = new Employe(4,"Mira","rathi",95000);
        Employe Nia = new Employe(1,"Nia","kadam",70000);


        List<Employe> employeList = new ArrayList<Employe>();
        employeList.add(Sara);
        employeList.add(Riya);
        employeList.add(Mira);
        employeList.add(Nia);

        System.out.println("Before sorting....");
        System.out.println(employeList);

        Collections.sort(employeList);

        System.out.println("                                    ");

        System.out.println("After sorting....");

        System.out.println(employeList);


        for (Employe x : employeList){
            System.out.println(x);
        }

    }
}
