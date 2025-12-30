package Optionalclass;

import java.util.Optional;

//Optional is a container class introduced in Java 8 to avoid NullPointerException (NPE).

public class OptionalClass {


    public static Optional<String> getName(){

        String name = null;
        //System.out.println(name.length()); //NullPointerException
        return Optional.ofNullable(name);
    }


    public static void main(String[] args) {

        Optional<String> optional = Optional.of("java");
        Optional<String> nameoptional =  getName();
        System.out.println(nameoptional);
        // System.out.println(nameoptional.orElse("null return"));
        nameoptional.ifPresent(s -> System.out.println(s.length()));

        //  Stream<Objects> objectsStream = Stream.empty();

        /*String string = "sarita";
        if (string == null){
            System.out.println("this is null object");
        }else {
            System.out.println(string.length());
        }*/


        // String str = "java is easy language";
       /* String str = null;
        Optional<String> optional = Optional.ofNullable(str);
        //System.out.println(optional.isPresent());
       // System.out.println(optional.get()); // Throw NoSuchElementException
        System.out.println(optional.orElse("no value parent in object"));*/

    }
}
