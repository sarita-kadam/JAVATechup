package String;

public class FormateMethod {

    public static void main(String[] args) {

        String name = "saru";
        String lastname = "kadam";
        int age = 30;


        String s = String.format("name: %s,age:%d", name,age);
        System.out.println(s);

        String s1 = String.format("name: %s, lastname: %s, age %d",name,lastname,age);
        System.out.println(s1);
    }

}
