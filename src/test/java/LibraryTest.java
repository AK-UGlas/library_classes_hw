import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library lib;
    private Book book;

    @Before
    public void before() {
        lib = new Library(100);
        book = new Book("The Prince", "Niccolo Machiavelli", "non-fiction");
    }

    @Test
    public void canCountBooks() {
        lib.addBook(book);
        assertEquals(1, lib.bookCount());
    }

    @Test
    public void canCountBooksByGenre() {
        lib.addBook(book);
        assertEquals(1, lib.getGenreCount("non-fiction"));
    }
}
