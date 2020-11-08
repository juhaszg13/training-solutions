package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> titles = new ArrayList<>();


    public void add(String title) {
        titles.add(title);
    }

    public List<String> findAllByPrefix(String prefix) {
        List<String> found = new ArrayList<>();

        for (String title : titles) {
            if (title.startsWith(prefix)) {
                found.add(title);
            }
        }
        return found;
    }

    public static void main(String[] args) {
        Books books = new Books();
        books.add("Egy Kutya");
        books.add("Hat cica");
        books.add("Kilenc macska");
        books.add("Hat kecske");
        System.out.println();
        System.out.println(books.findAllByPrefix("Hat"));
    }


}
