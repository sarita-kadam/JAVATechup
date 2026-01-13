package JavaBasic;

//Wrapper Classes : Converting the primitive datatype in to objects.
// because collection, Generics,many APIs work with object not primitive datatype
// Ex : int -> Integer , double -> Double , char -> Character .


//AutoBoxing : Automatic converting the primitive in to Wrapper object
// Autoboxing uses valueOf() internally → Integer.valueOf(10)

//UnBoxing : Automatic converting the Wrapper object to primitive


public class WrapperClasses {

    public static void main(String[] args) {

        int a = 10;
        Integer obj = a;
        System.out.println(obj); // AutoBoxing

        Integer object = 20;
        int b = object;
        System.out.println(b); // UnBoxing


    }


}
