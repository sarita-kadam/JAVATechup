package ExceptionHandling;

public class HeapOutOfMemoryErrorTest {

    public static void main(String[] args) {

        //int[] lasrgeArray = new int[Integer.MAX_VALUE - 2];

        // GC =>  automatic System.gb(); => no guarantee

        try
        {
            int[] lasrgeArray = new int[Integer.MAX_VALUE - 2];
        }
        catch (OutOfMemoryError e)
        {
            System.out.println("caught OutOfMemoryError : " + e.getMessage());

        }
    }
}

// garbage collection responsible for the detecting objects thet are not being used or refrenced and collect them