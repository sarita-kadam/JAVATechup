package Polymorphism;


class Bank {
    double getInterestRate(){
        return 2.0;
    }
}

class SBI extends Bank{

    @Override
    double getInterestRate() {
        return 3.0;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 4.0;
    }
}

public class RealExampleOfOverriding {

    public static void main(String[] args) {

        Bank obj = new SBI(); //parent reference child object upcasting
        System.out.println("SBI Interest : " + obj.getInterestRate());

        Bank obj1 = new HDFC();
        System.out.println("HBFC Interest : " + obj1.getInterestRate());
    }
}
