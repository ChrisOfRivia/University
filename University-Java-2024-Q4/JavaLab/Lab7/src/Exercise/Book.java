package Exercise;

public class Book {
    private int releaseYear;
    private String title;
    private BookGenre bookGenre;

    public enum BookGenre{
        NOVEL,
        ROMANCE,
        ACTION,
        HORROR,
        THRILLER,
        FANTASY
    }



    public Book(int releaseYear, String title, BookGenre genre) {
        this.releaseYear = releaseYear;
        this.title = title;
        this.bookGenre = genre;
    }

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.getTitle() + "[" + "] -> " + this.getReleaseYear();
    }
}
