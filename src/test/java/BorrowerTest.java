import org.junit.Before;
import org.junit.Test;

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
        borrower.borrow(book, lib);
    }

}
