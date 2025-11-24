package Encapulation;

class Encapsulation{

    private int ATMpin;

    public int getATMpin() {
        return ATMpin;
    }

    public void setATMpin(int ATMpin) {
        if(ATMpin <= 0){
            throw new RuntimeException("Atm pin must be grater than 0 ");
        }
        this.ATMpin = ATMpin;
    }
}

public class IntruducationToEncapsulation {

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        obj.setATMpin(100);

       // int atm = obj.getATMpin();
        System.out.println("Atm pin is " + obj.getATMpin());

    }
}
