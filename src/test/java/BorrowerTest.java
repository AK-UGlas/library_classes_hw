import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library lib;
    private Book book;

    @Before
    public void before() {
        borrower = new Borrower("Allen");
        lib = new Library(100);
        book = new Book("Crime & Punishment", "Fyodor Dostoyevsky", "fiction");

        lib.addBook(book);
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBook(book, lib);
        assertEquals(0, lib.bookCount());
        assertEquals(1, borrower.collectionCount());
    }

    @Test
    public void canReturnBook() {
        borrower.borrowBook(book, lib);
        borrower.returnBook(book, lib);
        assertEquals(0, borrower.collectionCount());
        assertEquals(1, lib.bookCount());
    }
}
