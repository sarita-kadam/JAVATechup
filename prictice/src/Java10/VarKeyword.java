package Java10;

//var Keyword : Introduced in Java 10, var allows local variable type inference.
//The compiler automatically decides the variable type based on the assigned value.
//Only for Local Variables
//Must Initialize Immediately
//Cannot Use for Method Return Type


import java.util.ArrayList;

public class VarKeyword {

    public static void main(String[] args) {

        var list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");

        list.forEach(System.out::println);
    }

    }

