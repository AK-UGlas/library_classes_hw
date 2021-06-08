import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private HashMap<String, Integer> genreCount;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.genreCount = new HashMap<>();
        this.capacity = capacity;
    }

    public void addBook(Book book) {
        String msg = "Not enough space in library";
        if (canAddBook()) {
            this.books.add(book);
            updateGenreCount(book.getGenre());
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

    public int getGenreCount(String genre) {
        return this.genreCount.getOrDefault(genre, 0);
    }

    public void updateGenreCount(String genre) {
        int count = getGenreCount(genre) + 1;
        this.genreCount.put(genre, count);
    }
}
