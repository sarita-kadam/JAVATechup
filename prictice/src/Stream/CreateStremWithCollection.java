package Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStremWithCollection {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("sara");
        list.add("riya");
        list.add("Sita");

        list.stream().forEach(System.out::println);

    }


}
