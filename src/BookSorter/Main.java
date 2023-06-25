package BookSorter;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Yabancı", 110, "Albert Camus", 1981);
        Book book2 = new Book("Oliver Twist", 258, "Charles Dickens", 1837  );
        Book book3 = new Book("Kubbenin Altında", 1074, "Stephen King", 2009);
        Book book4 = new Book("Beyaz Gemi", 168, "Cengiz Aytmatov", 1974);
        Book book5 = new Book("Simyacı", 184, "Paulo Coelho", 1988);

        TreeSet<Book> bookSortedByName = new TreeSet<>();

        bookSortedByName.add(book1);
        bookSortedByName.add(book2);
        bookSortedByName.add(book3);
        bookSortedByName.add(book4);
        bookSortedByName.add(book5);

        System.out.println("List Sorted By Name");
        for (Book book: bookSortedByName){
            System.out.println(book);
        }
        System.out.println("---------------------------");

        Set<Book> bookSortedByTotalpage = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTotalPage() - o2.getTotalPage();
            }
        });
        bookSortedByTotalpage.add(book1);
        bookSortedByTotalpage.add(book2);
        bookSortedByTotalpage.add(book3);
        bookSortedByTotalpage.add(book4);
        bookSortedByTotalpage.add(book5);

        System.out.println("List Sorted By Page");

        for (Book book: bookSortedByTotalpage){
            System.out.println(book);
        }

    }
}
