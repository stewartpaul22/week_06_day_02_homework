import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(5);
        book = new Book("Kill Your Friends", "John Niven", GenreType.COMEDY);
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
        Book book1 = new Book("Kill Your Friends", "John Niven", GenreType.COMEDY);
        Book book2 = new Book("The Second Coming", "John Niven", GenreType.COMEDY);
        Book book3 = new Book("Empire of the Sun", "J.G. Ballard", GenreType.DRAMA);
        Book book4 = new Book("The Old Man and the Sea", "Ernest Hemingway", GenreType.DRAMA);
        Book book5 = new Book("Neuromancer", "William Gibson", GenreType.SCIFI);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertTrue(library.checkIfStockFull());
    }

    @Test
    public void canIssueBook() {
        library.addBook(book);
        assertEquals(1, library.getStockCount());
        library.issueBook(book);
        assertEquals(0, library.getStockCount());
    }




}
