package ExceptionHandling;

//IOException is the parent of FileNotFoundException.So Child throws a narrower checked exception
//readFile() in Child cannot override readFile() in Parent; overridden method does not throw Exception

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
