package Collection;


import java.util.ArrayList;
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
    public int compare(WiproEmp e1, WiproEmp e2) {
        return e1.getEmp_id()-e2.getEmp_id();
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

        ArrayList<WiproEmp> arrayList = new ArrayList<>();
        arrayList.add(new WiproEmp("sara" , "kadam" , "latur",10000.0,1));
        arrayList.add(new WiproEmp("riya","sharma","pune",12000.0,2));
        arrayList.add(new WiproEmp("sita","patil","mumbai",13000.0,3));
        arrayList.add(new WiproEmp("siya","patil","mumbai",15000.0,4));
        arrayList.add(new WiproEmp("nia","biradar","nager",90000.0,5));

        arrayList.sort(new SortedByName());
        System.out.println(arrayList);

        arrayList.sort(new SortedId());
        System.out.println(arrayList);

    }
}

