import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> privateCollection;
    private int bookLimit = 4;

    public Borrower(String name) {
        this.name = name;
        this.privateCollection = new ArrayList<>();
    }

    public void borrowBook(Book book, Library lib) {
        if (canBorrow() && lib.loanBook(book)) {
           this.privateCollection.add(book);
        }
    }

    public void returnBook(Book book, Library library) {
        if (this.privateCollection.remove(book)) {
            library.addBook(book);
        }
    }

    public boolean canBorrow() {
        return this.privateCollection.size() < bookLimit;
    }

    public int collectionCount() {
        return this.privateCollection.size();
    }
}
