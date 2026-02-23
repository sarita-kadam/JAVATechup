package Java9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableAndUnmodifiableCollection {

    public static void main(String[] args) {

        // 1. Immutable Collection: Cannot be changed after creation,No add, remove, update allowed,No internal modification possible

        List<String> list = List.of("Java", "Python");
        //list.add("C++"); // UnsupportedOperationException Created using List.of(), Set.of(), Map.of() No one can modify it
        System.out.println(list);

        // 2.Unmodifiable Collection : It is a read-only view of a collection,But original collection can still change

        List<String> original = new ArrayList<>();
        original.add("sarita");

        List<String> unmodifiable = Collections.unmodifiableList(original);

       // unmodifiable.add("kadam"); // UnsupportedOperationException


        original.add("kadam");
        System.out.println(unmodifiable);
    }
}
