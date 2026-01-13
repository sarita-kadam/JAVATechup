package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {

    int id;
    String name;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class SortById implements Comparator<Students>{

    @Override
    public int compare(Students o1, Students o2) {
        return Integer.compare(o1.id, o2.id);
    }
}

class SortByName implements Comparator<Students>{



    @Override
    public int compare(Students o1, Students o2) {
        return o1.name.compareTo(o2.name);
    }
}


public class ComparatorPractice {

    public static void main(String[] args) {

        List<Students> studentsList = new ArrayList<Students>();
        studentsList.add(new Students(2,"Riya"));
        studentsList.add(new Students(4,"Mira"));
        studentsList.add(new Students(6,"Nia"));
        studentsList.add(new Students(1,"jiya"));
        studentsList.add(new Students(3,"raha"));

        Comparator<Students> studentsComparator = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.id - o2.id;
            }
        };

        System.out.println(" Before Soring " + studentsList);

        Collections.sort(studentsList,studentsComparator);

        System.out.println("After sorting " + studentsList);

        for (Students x : studentsList){
            System.out.println(x);

        }

    }
}
