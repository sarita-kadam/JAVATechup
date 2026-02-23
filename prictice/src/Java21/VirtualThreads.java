package Java21;

//Virtual Threads : Lightweight threads for high scalability.
//Handle thousands/millions of threads
//Best for web servers, microservices

public class VirtualThreads {

    public static void main(String[] args) {

        //Before:

        Thread thread = new Thread(() -> {
            System.out.println("Hello");
        });
        thread.start();


        //Now (Java 21):

        Thread.startVirtualThread(() -> {
            System.out.println("Hello from Virtual Thread");
        });


    }
}
