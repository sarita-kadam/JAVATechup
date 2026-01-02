package Arraylist;

public class TestArrayList {

    public static void main(String[] args) {

        CustomArrayList<Object> customArrayList = new CustomArrayList<>();
        customArrayList.add(10);
        customArrayList.add("saru");
        customArrayList.add(4.5);
        customArrayList.add('a');
        customArrayList.add(true);


        //Display all elements in CustomArrayList
        customArrayList.display();
        System.out.println(customArrayList.get(0));

        // Remove element at index 0
        System.out.println(customArrayList.remove(0));

        // Display after remove element.
        customArrayList.display();

    }
}
