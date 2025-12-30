package MethodRefrence;

import Abstraction.Interface;

public class Demo {

    public static void main(String[] args) {

        System.out.println("learning method reference");

        //provide the implementation of workInter

       /* WorkInter workInter = () -> {
            System.out.println("this is do task new method");
        };

        workInter.dowork();*/

        WorkInter workInter = MethodRef ::dotest;
        workInter.dowork();

        MyInter myInter = MyClass ::new;
        myInter.get();

    }

}
