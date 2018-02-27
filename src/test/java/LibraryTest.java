import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;

    @Before
    public void before() {
        library = new Library(5);
    }

    @Test
    public void canGetStockCount__Empty() {
        assertEquals(0, library.getStockCount());
    }




}
