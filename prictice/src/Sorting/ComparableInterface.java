package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{

    private int id;
    private String name;
    private int rollNo;

    public Student(int id, String name, int rollNo) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
}


public class ComparableInterface {
    public static void main(String[] args) {

       Student student1 = new Student(5,"Ram",12);
        Student student2 = new Student(2,"Shyam",14);
        Student student3 = new Student(1,"Sita",11);
        Student student4 = new Student(3,"Mira",15);
        Student student5 = new Student(4,"Sara",13);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        System.out.println("Before Sorting... " + studentList);

        System.out.println("                            ");

        Collections.sort(studentList);

        System.out.println("After Sorting..." + studentList);


        for ( Student x : studentList ){
            System.out.println(x);
        }

    }
}
