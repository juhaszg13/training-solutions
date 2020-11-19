package objects;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {
        Book book = new Book();
        new Book();
        System.out.println(new Book());
        Book emptyBook = new Book();
        System.out.println(emptyBook);
        emptyBook = null;
        System.out.println(emptyBook);
        System.out.println(emptyBook == null);
        Book anotherBook = new Book();
        System.out.println(book == anotherBook);
        anotherBook = book;
        System.out.println(anotherBook == book);
        System.out.println(anotherBook instanceof Book);

        Book[] book1 = new Book[]{new Book(), new Book(), new Book()};
        List<Book> books2 = new ArrayList<>();
        books2.add(new Book());
        books2.add(new Book());
        books2.add(new Book());
    }
}
