package com.library;

import java.time.LocalDate;

public class BorrowHistory {
    private Book book;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public BorrowHistory(Book book) {
        this.book = book;
        this.borrowDate = LocalDate.now();
    }

    public void markReturned() {
        this.returnDate = LocalDate.now();
    }

    public LocalDate getBorrowedDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public Book getBook() {
        return book;
    }
}
