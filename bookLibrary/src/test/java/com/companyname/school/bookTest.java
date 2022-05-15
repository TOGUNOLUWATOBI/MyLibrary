package com.companyname.school;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple Student object.
 */
public class bookTest {
/**
 * Rigorous Test :-)
 */
    @Test
    public void CheckBookIdTest()
    {
        Book book =new Book();
        book.AddBook("#id-1","Introduction to Maths",7);
        book.AddBook("#id-2","Introduction to Biology",4);
        book.AddBook("#id-3","Introduction to History",3);
        book.AddBook("#id-4","Introduction to Physics",5);

        assertTrue(book.CheckBookId("#id-1") && book.CheckBookId("#id-2") && book.CheckBookId("#id-3") && book.CheckBookId("#id-4"));
    }

    @Test
    public void AddBookTest()
    {
        Book book =new Book();
        book.AddBook("#id-1","Introduction to Maths",7);
        book.AddBook("#id-2","Introduction to Biology",4);
        book.AddBook("#id-3","Introduction to History",3);
        book.AddBook("#id-4","Introduction to Physics",5);

        assertTrue(book.CheckBookId("#id-1") && book.CheckBookId("#id-2") && book.CheckBookId("#id-3") && book.CheckBookId("#id-4"));
    }

    @Test
    public void ReturnBookTest()
    {
        Book book =new Book();
        book.AddBook("#id-1","Introduction to Maths",7);
        book.AddBook("#id-2","Introduction to Biology",4);
        book.AddBook("#id-3","Introduction to History",3);
        book.AddBook("#id-4","Introduction to Physics",5);

        assertTrue(book.book_return("#id-1"));
    }

    @Test
    public void BookBorrowTest()
    {
        Book book =new Book();
        book.AddBook("#id-1","Introduction to Maths",7);
        book.AddBook("#id-2","Introduction to Biology",4);
        book.AddBook("#id-3","Introduction to History",3);
        book.AddBook("#id-4","Introduction to Physics",0);
        book.AddBook("#id-5","Introduction to English",0);
        assertTrue(book.book_borrow("#id-1"));
        assertFalse(book.book_borrow("#id-5"));
    }
}