package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book=new Book("Fekete párduc");
        System.out.println(book.getTitle());
        book.setTitle("Tüskevár");
        System.out.println(book.getTitle());
    }
}
