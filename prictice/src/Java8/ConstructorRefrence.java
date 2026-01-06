package Java8;

class Bike{

    public Bike(){

        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);

                System.out.println("java.." + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public Bike(int a){
        try{
            for (int i = 1; i <= 5; i++){
                Thread.sleep(1000);

                System.out.println("Python..." + 1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    interface InterfaceTest{
        public Bike show();
    }
}


public class ConstructorRefrence {

    public static void main(String[] args) {


        Bike.InterfaceTest obj = () -> {
            return new Bike(12);
        };

        // Here Use Method reference...using method reference Create Bike Object.....
        Bike.InterfaceTest obj1 = Bike::new;
        obj1.show();

    }
}
