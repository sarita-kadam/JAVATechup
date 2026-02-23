package Java21;

//Record Patterns : Record Patterns allow you to extract record values directly while pattern matching.
//No need to manually call getters.

record Customer(String name, String email, String city) {}

record Order(String orderId, Customer customer, double amount) {}


public class RecordPatterns {

    public static void main(String[] args) {


    }
}
