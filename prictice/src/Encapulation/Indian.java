package Encapulation;

public class Indian {

    private String name;
    private int age;
    private double salary;
    private String address;
    private int panCard;
    private int aadharCard;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPanCard() {
        return panCard;
    }

    public void setPanCard(int panCard) {
        this.panCard = panCard;
    }

    public int getAadharCard() {
        return aadharCard;
    }

    public void setAadharCard(int aadharCard) {
        this.aadharCard = aadharCard;
    }

    public static void main(String[] args) {

        Indian i = new Indian();
        i.setName("riya");
        i.setAge(23);
        i.setSalary(10000.00);
        i.setAddress("pune");
        i.setPanCard(23421);
        i.setAadharCard(2231225);

        System.out.println("Get sarita's details as Name is "+i.getName() + " Age is "+ i.getAge() + " And Salary is " + i.getSalary());
        i.setSalary(11000.00);


        Indian ii = new Indian();
        ii.setName("siya");
        ii.setAge(21);
        ii.setAddress("mumbai");
        ii.setSalary(120000);
        ii.setPanCard(7564867);
        ii.setAadharCard(44332226);

        System.out.println(" Name "+ ii.getName() + " Age is " + ii.getAge() + " salary is " + ii.getSalary());

    }
}


