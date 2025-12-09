package ExceptionHandling;

import java.io.Closeable;
import java.sql.SQLException;

public class Ex implements AutoCloseable {
    @Override
    public void close() throws SQLException {
        System.out.println("Inside close method");

    }

    void test(){
        System.out.println("test method");
    }

    public static void main(String[] args) throws Exception {

        /*Ex obj = null;
        try{
            obj = new Ex();
            obj.test();
        } catch (Exception e) {
            System.out.println(e);
        }finally {
           // obj.close();
        }*/

        try(Ex obj = new Ex()){
            obj.test();
        }
        catch (Exception e){
            System.out.println("go into exception block");
        }
    }
}
