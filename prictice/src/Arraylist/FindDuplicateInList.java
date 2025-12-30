package Arraylist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInList {

    public static void main(String[] args) {

        // Step 1: Create a List with duplicate elements
        List<String> list = Arrays.asList("java", "python","java","css"); //Arrays.asList() : Converts an array into a fixed-size List

        // Step 2: Create a Set to store unique elements
        Set<String> set = new HashSet<>();

        for (String element : list){

            // If add() returns false → element already exists
            if (!set.add(element)){
                System.out.println(element);

            }
        }
    }
}
