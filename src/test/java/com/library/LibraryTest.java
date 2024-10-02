package com.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBook() {
        Book book = new Book("Fun with Java", "Jane Doe");
        library.addBook(book);
        assertFalse(library.getAvailableBooks().isEmpty());
        assertEquals(1, library.getAvailableBooks().size());
    }

    @Test
    public void testLendBookSuccess() {
        Book book = new Book("Fun with Java", "Jane Doe");
        library.addBook(book);
        boolean result = library.lendBook("Fun with Java");
        assertTrue(result);
        assertTrue(book.isBorrowed());
    }

    @Test
    public void testLendBookFail() {
        Book book = new Book("Fun with Java", "Jane Doe");
        library.addBook(book);
        library.lendBook("Fun with Java");
        boolean result = library.lendBook("Fun with Java");
        assertFalse(result);
    }

    @Test
    public void testReturnBook() {
        Book book = new Book("Fun with Java", "Jane Doe");
        library.addBook(book);
        library.lendBook("Fun with Java");
        boolean result = library.returnBook("Fun with Java");
        assertTrue(result);
        assertFalse(book.isBorrowed());
    }


}
