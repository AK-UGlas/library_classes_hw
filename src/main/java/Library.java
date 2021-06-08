import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public String addBook(Book book) {
        if (canAddBook()) {
            this.books.add(book);
            return "Book added to library successfully";
        }
        return "Not enough space in library";
    }

    public int bookCount() {
        return this.books.size();
    }

    public boolean canAddBook() {
        return this.books.size() < this.capacity;
    }

    // remove book from collection
    public void loanBook(Book book) {
        
    }
}
