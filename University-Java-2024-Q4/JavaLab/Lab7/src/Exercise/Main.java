package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book(2004, "Title1", Book.BookGenre.ACTION));
        books.add(new Book(2007, "Title2", Book.BookGenre.FANTASY));
        books.add(new Book(2010, "Title3", Book.BookGenre.THRILLER));
        books.add(new Book(2001, "Title4", Book.BookGenre.ROMANCE));
        books.add(new Book(2000, "Title5", Book.BookGenre.ACTION));

        System.out.println("\n Books: ");
        books.stream().forEach(book -> System.out.println(book));

        List<Book> sortedByYear = books.stream()
                .sorted((book1, book2) -> Integer.compare(book1.getReleaseYear(), book2.getReleaseYear()))
                .toList();

        System.out.println("\n Books by year: ");
        for(Book a : sortedByYear){
            System.out.println(a);
        }

        List<String> titles = books.stream().map(book -> book.getTitle()).toList();

        System.out.println("\n Book titles: ");
        System.out.println(titles);

        Map<Book.BookGenre, List<Book>> booksGroupedByGenre = books.stream()
                .collect(Collectors.groupingBy(b1 -> b1.getBookGenre()));

        System.out.println("\n Books grouped by genre: ");
        System.out.println(booksGroupedByGenre);

    }
}
