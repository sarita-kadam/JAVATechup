package Polymorphism;


class One{
    void show(String a1){
        show(a1, a1+a1);
    }

    void show(String a1,String a2 ){
        show(a1, a2, a1+a2);
    }

    void show(String a1, String a2,String a3){
        System.out.println(a1+a2+a3);
    }
}
public class Ex13 {

    public static void main(String[] args) {

        One obj = new One();

        obj.show("java ");
    }
}
