package ExecutorFramework;

import java.util.concurrent.*;

public class CallableAndFutureInterface {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () ->{
            System.out.println("Calculating...");
            return  10 * 10;
        };

        Future<Integer> result = service.submit(task);

        System.out.println("Result: " + result.get());

        service.shutdown();

    }
}
