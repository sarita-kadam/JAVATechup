package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Comparable (Interface) : Comparable is a functional interface in java.lang
//Comparable is an interface used to define the natural ordering of objects.
//A class can implement only one Comparable
//It has one method → compareTo()


class Student implements Comparable<Student>{

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return this.id - s.id; // id by id
    }
}


public class ComparableExample {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(3,"riya"));
        list.add(new Student(1,"sara"));
        list.add(new Student(2,"Nia"));

        Collections.sort(list);
        System.out.println(list);

    }
}
