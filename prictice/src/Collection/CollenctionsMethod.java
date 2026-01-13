package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollenctionsMethod {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(20);
        list.add(10);

        System.out.println(list);

        //sort() :Sorts list in ascending order.(Asending order)
        Collections.sort(list);
        System.out.println(list);


        //reverse() : Reverses order of elements.(Descending order)
        Collections.reverse(list);
        System.out.println(list);

        //shuffle() : Randomly rearranges elements
        Collections.shuffle(list);
        System.out.println(list);

        //max() and min() : Finds largest & smallest element
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        //frequency() : Counts occurrences of element
        System.out.println(Collections.frequency(list,10));

        //binarySearch() : Search element in sorted list
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list,20));

        //swap() : Swaps two elements by index
        Collections.swap(list,0,2);
        System.out.println(list);

        //fill() : Replaces all elements with one value
        Collections.fill(list,5);
        System.out.println(list);

        //copy() : Copies one list into another
        System.out.println("copy elements");
        List<Integer> Ex = Arrays.asList(1,1,1,1,1);
        Collections.copy(Ex,list);
        System.out.println(Ex);



    }


}
