package Operators;

public class RelationalOprators {


    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean checkequality = (a == b);                      //  false
        System.out.println("checkequality = " +checkequality);

        boolean checkeNotquality = (a != b);                     // true
        System.out.println("checkeNotquality = " +checkeNotquality);

        boolean CheckLessThan = (a > b);                           // false
        System.out.println("CheckLessThan = " + CheckLessThan);

    }
}
//-	Relational Operators are used to check for relations like equality, greater than, and less than.
//-	They return Boolean results after the comparison.