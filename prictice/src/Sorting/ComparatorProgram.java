package Sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class WiproEmp{

    private String name;
    private String l_Name;
    private String address;
    private double salary;
    private int emp_id;

    public WiproEmp(String name, String l_Name, String address, double salary, int emp_id) {
        this.name = name;
        this.l_Name = l_Name;
        this.address = address;
        this.salary = salary;
        this.emp_id = emp_id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getL_Name() {
        return l_Name;
    }

    public void setL_Name(String l_Name) {
        this.l_Name = l_Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    @Override
    public String toString() {
        return "WiproEmp{" +
                "name='" + name + '\'' +
                ", l_Name='" + l_Name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", emp_id=" + emp_id +
                '}';
    }
}
class SortedId implements Comparator<WiproEmp>{


    @Override
    public int compare(WiproEmp o1, WiproEmp o2) {
        return o1.getEmp_id()- o2.getEmp_id();
    }
}

class SortedByName implements Comparator<WiproEmp>{


    @Override
    public int compare(WiproEmp o1, WiproEmp o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


public class ComparatorProgram {

    public static void main(String[] args) {

        WiproEmp wiproEmp1 = new WiproEmp("sara" , "kadam" , "latur",10000.0,4);
        WiproEmp wiproEmp2 = new WiproEmp("riya","sharma","pune",12000.0,2);
        WiproEmp wiproEmp3= new WiproEmp("sara" , "kadam" , "latur",10000.0,5);
        WiproEmp wiproEmp4 = new WiproEmp("sara" , "kadam" , "latur",10000.0,3);
        WiproEmp wiproEmp5 = new WiproEmp("sara" , "kadam" , "latur",10000.0,1);



        ArrayList<WiproEmp> arrayList = new ArrayList<>();
        arrayList.add(wiproEmp1);
        arrayList.add(wiproEmp2);
        arrayList.add(wiproEmp3);
        arrayList.add(wiproEmp4);
        arrayList.add(wiproEmp5);

        Comparator<WiproEmp> idcomprator = new Comparator<WiproEmp>() {
            @Override
            public int compare(WiproEmp o1, WiproEmp o2) {
                return o1.getEmp_id() - o2.getEmp_id();
            }
        };

        System.out.println("Before sorting " + arrayList);

        Collections.sort(arrayList,idcomprator);

        System.out.println("After sorting " + arrayList);

        for (WiproEmp x : arrayList){
            System.out.println(x);
        }

    }
}
