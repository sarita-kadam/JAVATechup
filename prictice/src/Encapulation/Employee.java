package Encapulation;

public class Employee {

    private  int empid;    // data-hiding

   public void setEmpid(int empid){  // using setter method we can write and modify the data

       this.empid = empid;

   }

   public int getEmpid(){// using getter method we can view the data

       return empid;
   }

   public static void main(String[] args){

       Employee e = new Employee();
       e.setEmpid(123);
       System.out.println(e.getEmpid());

   }

}
