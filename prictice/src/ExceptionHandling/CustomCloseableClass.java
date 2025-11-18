package ExceptionHandling;

public class CustomCloseableClass implements AutoCloseable {

    public static void main(String[] args) {

        try(CustomCloseableClass obj = new CustomCloseableClass())
        {
            obj.test();
        }
        catch (Exception e)
        {
            System.out.println("Got into exception block ");
        }
    }

void test()

{
    System.out.println("test method ");
}

    @Override
    public void close() throws Exception {
        System.out.println("When this method will get called ?");
    }
}



//try{
//     CustomCloseableClass obj = new  CustomCloseableClass();
//     obj.test();
//     obj.close();
//    }
//    catch (Exception exception)
//    {
//      System.out.println("Got into exception block ");
//    }
//    finally
//        {
//            //close the resource
//        }

