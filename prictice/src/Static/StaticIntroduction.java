package Static;

public class StaticIntroduction {

    String name = "java";

    int age = 10;  // non-static or instatnce variable

   static int salary = 20000;  // static variable

   void instancemathod(){
       System.out.println("non-static mathod");
   }

   static void staticmethod(){
       System.out.println("static method");
   }

    public static void main(String[] args) {

        StaticIntroduction obj = new StaticIntroduction();  // instance method calling using create object
        obj.instancemathod();
        System.out.println("instatnce method = " +obj.age);

        StaticIntroduction obj1 = new StaticIntroduction();
        obj.instancemathod();
        System.out.println("instatnce method = " +obj1.salary);



        StaticIntroduction.staticmethod(); // static method calling without create object but access using class name
        System.out.println("static method = " +StaticIntroduction.salary);



    }
}




// class student{
// String Name;
// int age;
// string address;
// int id;
// string department;              instance (chengable)

// string collegename;             static  (non-chengable)
// }


// class BankAccount{
// accountholdername;         instance
// accountnumber;
// accounttype;
// isfccode;
// address;
// balance;
//
// BankName;                    static       SBH(state bank of hedrabad) => SBI(state bank of india)
// }

