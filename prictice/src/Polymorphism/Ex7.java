package Polymorphism;

//In a class, One method has 4 overloaded forms. All have different access modifiers (private, default, protected and public). Is that method properly overloaded?

public class Ex7 {

    void show(int a){
       System.out.println("deafault access modifer");
   }

   public void show(int b , double c){
       System.out.println("public access modifer");
   }

   private void show(int D , float e){
       System.out.println("private access modifer");
   }

   protected void show(double f, String N){
       System.out.println("protected access modifer");
   }

    public static void main(String[] args) {

        Ex7 obj1 = new Ex7();
        obj1.show(10);


        Ex7 obj2 = new Ex7();
        obj2.show(10,1000);

        Ex7 obj3 = new Ex7();
        obj3.show(12,10.0);

        Ex7 obj4 = new Ex7();
        obj4.show(100000,"java");
    }

}
