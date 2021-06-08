import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addBook(Book book) {
        String msg = "Not enough space in library";
        if (canAddBook()) {
            this.books.add(book);
            msg = book.getTitle() + " added to library successfully";
        }
        System.out.println(msg);
    }

    public int bookCount() {
        return this.books.size();
    }

    public boolean canAddBook() {
        return this.books.size() < this.capacity;
    }

    // remove book from collection
    public boolean loanBook(Book book) {
        return this.books.remove(book);
    }
}
