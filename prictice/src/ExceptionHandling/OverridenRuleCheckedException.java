package ExceptionHandling;

//Checked exceptions:Must be same or subclass of parent’s exception You cannot throw new or broader checked exceptions

import java.io.IOException;
import java.sql.SQLException;

class Parent1 {
    void readfile() throws IOException , SQLException {
        System.out.println(" parent reading file ");
    }

}

class Chil1 extends Parent1 {

    @Override
    void readfile() throws IOException  {
        System.out.println("child reading file ");
    }
}

public class OverridenRuleCheckedException {

    public static void main(String[] args) throws IOException, SQLException {

        Parent1 obj = new Chil1();
        obj.readfile();
    }
}

