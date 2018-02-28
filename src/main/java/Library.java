//import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity) {
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (checkIfStockFull() == false) {
            this.stock.add(book);
        }
    }

    public boolean checkIfStockFull() {
        if (this.getStockCount() < this.capacity) {
            return false;
        }
        return true;
    }

    public Book issueBook(Book book) {
        this.stock.remove(book);
        return book;

    }
}
