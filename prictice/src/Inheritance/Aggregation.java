package Inheritance;

//Aggregation (Weak) : The contained object can exist independently of the container.
// Example : A Library has Books, but books can exist without the library.

class Book {

    String title;

    Book(String title){
        this.title = title;

    }
}

class Library {

    Book book; // Aggregation (Library has-a Book)

    Library(Book book){
        this.book = book;
    }

    void showbook(){
        System.out.println("Library has a book: " + book.title);
    }
}


public class Aggregation {

    public static void main(String[] args) {

        Book b = new Book("java programming");

        Library lib = new Library(b);
        lib.showbook();

    }
}
