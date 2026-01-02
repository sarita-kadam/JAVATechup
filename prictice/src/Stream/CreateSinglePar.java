package Stream;


import java.util.stream.Stream;

class Test{

}
public class CreateSinglePar {

    public static void main(String[] args) {

        Stream<Test> testStream = Stream.of(new Test());
        System.out.println(testStream.count());
    }

}
