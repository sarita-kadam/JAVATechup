package Stream;

import java.util.stream.Stream;

public class CreateStreamBuilder {

    public static void main(String[] args) {
        Stream<String> stream = Stream.<String>builder()
                .add("A")
                .add("B")
                .add("C")
                .build();
        stream.forEach(e-> System.out.println(e));
    }
}
