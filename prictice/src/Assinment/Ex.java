package Assinment;

class ClassA{

    public int numberofInstance;

    protected ClassA(int numberofInstance){

        this.numberofInstance = numberofInstance;
    }
}

public class Ex extends ClassA {

    private Ex(int numberofInstance){

        super(numberofInstance);
    }

    public static void main(String[] args) {

        Ex obj = new Ex(420);

        System.out.println(obj.numberofInstance);
    }
}
