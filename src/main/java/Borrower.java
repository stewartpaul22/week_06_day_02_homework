import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> bookCase;
    private Book book;

    public Borrower(String name) {
        this.name = name;
        this.bookCase = new ArrayList<>();
    }

    public void borrowBook(Library library) {
        this.bookCase.add(library.issueBook(book));
    }

    public int getBookCount() {
        return bookCase.size();
    }

}
