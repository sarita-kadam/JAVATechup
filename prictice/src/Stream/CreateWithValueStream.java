package Stream;

import java.util.stream.Stream;

public class CreateWithValueStream {

    Stream<String> valueStream=Stream.of("saru","Riya");
    long a = valueStream.count();
     //   System.out.println(a);

}
