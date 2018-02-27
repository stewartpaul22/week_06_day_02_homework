import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(5);
        book = new Book("The Second Coming", "John Niven");
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




}
