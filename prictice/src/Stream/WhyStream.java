package Stream;

import java.util.ArrayList;
import java.util.List;

public class WhyStream {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java script");
        list.add("python");
        list.add("mongo db");
        list.add("HTMl");
        list.add("CSS");
        list.add("React js");
        list.add("JS");

        // collection print all element whose length is more than 5 or start with char J
       /* for (String element : list){

            if (element.length() >= 5 || element.startsWith("J")){
                System.out.println(element);
            }
        }*/

        list.stream().
                filter(s -> s.length() >= 5 || s.startsWith("J")).
                forEach(element -> System.out.println(element));
    }
}
