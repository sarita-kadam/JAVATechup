package Sorting;


import java.util.ArrayList;
import java.util.Collections;

class ComparatorExample implements Comparable<ComparatorExample>{

    private String name;
    private int age;
    private double salary;
    private String c_Name;

    public ComparatorExample(String name, int age, double salary, String c_Name) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.c_Name = c_Name;
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

    public String getC_Name() {
        return c_Name;
    }

    public void setC_Name(String c_Name) {
        this.c_Name = c_Name;
    }

    @Override
    public String toString() {
        return "ComparatorPractice{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", c_Name='" + c_Name + '\'' +
                '}';
    }


    @Override
    public int compareTo(ComparatorExample o) {
        return Integer.compare(this.age, o.age);
    }
}


public class ComparablePractice {

    public static void main(String[] args) {

        ArrayList<ComparatorExample> al = new ArrayList<ComparatorExample>();
        al.add(new ComparatorExample("sara", 2, 10, "TCs"));
        al.add(new ComparatorExample("riya", 21, 12, "TDIT"));
        al.add(new ComparatorExample("sanu", 26, 18, "TVS"));
        al.add(new ComparatorExample("pari", 4, 20, "Infosys"));
        al.add(new ComparatorExample("nia", 22, 3, "HP"));
        al.add(new ComparatorExample("vira", 23, 19, "Mi"));

        System.out.println(al);
        System.out.println("           ");
        Collections.sort(al);
        System.out.println(al);

        for ( ComparatorExample x : al ){
            System.out.println(x);
        }


    }
}
