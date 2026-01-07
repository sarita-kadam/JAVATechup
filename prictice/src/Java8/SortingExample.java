package Java8;

import Collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class BookSort implements Comparable<BookSort>{
    private String title;
    private String author;
    private int pages;

    public BookSort(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "BookSort{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public int compareTo(BookSort o) {
        return o.getPages() - this.getPages();
    }
}

public class SortingExample {
    public static void main(String[] args) {

        ArrayList<BookSort> list = new ArrayList<>();
        BookSort obj1 = new BookSort("Java Basics", "James", 300);
        BookSort obj2 = new BookSort("Spring Boot", "Rod", 450);
        BookSort obj3 = new BookSort("Hibernate", "Gavin", 350);

        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


    }
}
