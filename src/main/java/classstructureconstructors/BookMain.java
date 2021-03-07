package classstructureconstructors;

import org.w3c.dom.ls.LSOutput;

public class BookMain {
    public static void main(String[] args) {
        Book book=new Book("Juhász Gábor","A Hold");
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        book.register("23456");
        System.out.println(book.getRegNumber());
    }

}
