package Arraylist;

import static com.sun.tools.javac.util.ArrayUtils.ensureCapacity;
import java.util.Arrays;

public class CustomArrayList<e> {

    // Private hide the variable from external use of classes

    private int size = 0;
    private Object[] arr;
    private static final int initialCapacity = 10;

    // Constructor
    // when we create a object of this class then this constructor get automatically call
    //eg: CustomArrayList<Integer> list = new CustomArrayList<>();


    public CustomArrayList() {
        arr = new Object[initialCapacity];
    }


    // Add Method
    public void add(Object e) {
        if (size == arr.length) {
            ensureCapacity();
        }
        arr[size++] = e;
    }

    // EnsureCapacity Method
    public void ensureCapacity() {
        int newCapacity = arr.length * 2;
        arr = Arrays.copyOf(arr, newCapacity);  // creates a double array and copies existing elements.
    }

    // Get element at particular index
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(("Index : " + index + "Size : " + index));
        }
        return (Object) arr[index];
    }


    // Remove Method
    public Object remove(int index) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Index : " + index + ",Size : " + index);
        }
        Object removedElement = arr[index];
        //Shifts all elements after the removed
        for (int i = index; i <= size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return removedElement;
    }


    // Display Method
    public void display() {
        System.out.println("Displaying List");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}