import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(5);
        book = new Book("Kill Your Friends", "John Niven");
    }

    @Test
    public void canGetStockCount__Empty() {
        assertEquals(0, library.getStockCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.getStockCount());
    }

    @Test
    public void checkStockIsFull__isFull() {
        Book book1 = new Book("Kill Your Friends", "John Niven");
        Book book2 = new Book("The Second Coming", "John Niven");
        Book book3 = new Book("Empire of the Sun", "J.G. Ballard");
        Book book4 = new Book("The Old Man and the Sea", "Ernest Hemingway");
        Book book5 = new Book("Neuromancer", "William Gibson");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(library.getCapacity(), library.getStockCount());
    }




}
