package ExceptionHandling;

import java.util.Scanner;

public class MethodStack {


        Scanner sc = new Scanner(System.in);

        void test(){
            System.out.println("Enter First ");
            int num = sc.nextInt();
            System.out.println("Enter Second ");
            int num1 = sc.nextInt();
            int div = num / num1;
            System.out.println("Div is:"+ div);
        }

        void test1(){
            test();
        }

        void test2(){
            test1();
        }

    public static void main(String[] args) {

            MethodStack obj = new MethodStack();
            try{
                obj.test2();
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
    }
    }

