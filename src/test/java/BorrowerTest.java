import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;

    @Before
    public void before() {
        borrower = new Borrower("Paul");
        library = new Library(5);
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBook(library);
        assertEquals(1, borrower.getBookCount());
    }
}
