package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterators {


        public static void main(String[] args) {

            // List<String> fruits = new ArrayList<>();

           List<String> fruits = new CopyOnWriteArrayList<>();  // not throw concurrentModificationException

            fruits.add("Mango");
            fruits.add("Orange");
            fruits.add("Banana");
            fruits.add("Cherry");
            System.out.println(fruits);

            Iterator<String> iterable = fruits.iterator();

            while (iterable.hasNext()){

                String fruit = iterable.next();

                //System.out.println(fruit);
                if(fruit.equals("Banana")) {

                    fruits.remove("Banana");
                }
           if (!fruits.contains("Pineapple")){

               fruits.add("Pineapple");
            }
            }
            System.out.println(fruits);
        }
    }



