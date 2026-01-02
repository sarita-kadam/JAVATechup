package Java8;

interface Anonymous{

    void show(int a);

    void display();
}

public class AnonymousClass {

    public static void main(String[] args) {

        Anonymous obj = new Anonymous() {
            @Override
            public void show(int a) {
                System.out.println("show method in interface");

            }

            @Override
            public void display() {
                System.out.println("display method in interface");

            }

        };


        obj.show(10);
        obj.display();
    }
}