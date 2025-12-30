package Collection;

import java.util.ArrayList;
import java.util.Collections;

class ComparatorPractice implements Comparable<ComparatorPractice> {

    private String name;
    private int age;
    private double salary;
    private String c_Name;

    public ComparatorPractice(String name, int age, double salary, String c_Name) {
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
    public int compareTo(ComparatorPractice o) {
        return Integer.compare(this.age, o.age);
    }

}

public class ComparableInterface {

    public static void main(String[] args) {

        ArrayList<ComparatorPractice> al = new ArrayList<ComparatorPractice>();
        al.add(new ComparatorPractice("sara", 2, 10, "TCs"));
        al.add(new ComparatorPractice("riya", 21, 12, "TDIT"));
        al.add(new ComparatorPractice("sanu", 26, 18, "TVS"));
        al.add(new ComparatorPractice("pari", 4, 20, "Infosys"));
        al.add(new ComparatorPractice("nia", 22, 3, "HP"));
        al.add(new ComparatorPractice("vira", 23, 19, "Mi"));

        System.out.println(al);
        System.out.println("           ");
        Collections.sort(al);
        System.out.println(al);

    }
}
