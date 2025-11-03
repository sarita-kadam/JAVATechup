package ExceptionHandling;

public class WhatIsExceptionHandling {

    public static void main(String[] args) {

//        int a = 100/0;
//        System.out.println("text massage ");

try
{
    String name = null;
    System.out.println(name.length());

} catch (Exception e)
{

    System.out.println(e);
}
    }

}


