package Encapulation;

import java.util.Date;

//How to Create a Custom Immutable Class in Java:-
//1.Make the class final
//2.Make all fields private and final
//3.Initialize fields using constructor only
//4.Provide only getter methods


public final class CustomImmutableClass {


    private final int id;
    private final String name;
    private final Date joiningDate;


    public CustomImmutableClass(int id, String name, Date joiningDate) {
        this.id = id;
        this.name = name;
        this.joiningDate = joiningDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    @Override
    public String toString() {
        return "CustomImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", joiningDate=" + joiningDate +
                '}';
    }

    public static void main(String[] args) {


        Date d = new Date();

        CustomImmutableClass customImmutableClass = new CustomImmutableClass(1, "sara", d);

        System.out.println(customImmutableClass);
    }
}