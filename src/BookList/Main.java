package BookList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> book = new ArrayList<>();

        book.add(new Book("Kitap 1", "Yazar 1", 10, 1990));
        book.add(new Book("Kitap 2", "Yazar 2", 20, 1991));
        book.add(new Book("Kitap 3", "Yazar 3", 30, 1992));
        book.add(new Book("Kitap 4", "Yazar 4", 40, 1993));
        book.add(new Book("Kitap 5", "Yazar 5", 50, 1994));
        book.add(new Book("Kitap 6", "Yazar 6", 60, 1995));
        book.add(new Book("Kitap 7", "Yazar 7", 70, 1996));
        book.add(new Book("Kitap 8", "Yazar 8", 80, 1997));
        book.add(new Book("Kitap 9", "Yazar 9", 90, 1998));


        Map<String, String> bookAuthor = new HashMap<>();

        book.forEach(b -> bookAuthor.put(b.getName(), b.getAuthorName()));


        bookAuthor.entrySet().stream().forEach(x -> System.out.println(x.getKey() + " - " + x.getValue()));

        List<Book> bookPage = book.stream().filter(b -> b.getPage() > 50).collect(Collectors.toList());

        bookPage.forEach(books -> System.out.println(books.getPage() + " - " + books.getAuthorName() + " - " + books.getPage() + " - " + books.getYear()));
    }
}
