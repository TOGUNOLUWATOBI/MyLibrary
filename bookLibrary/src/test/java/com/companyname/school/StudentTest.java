package com.companyname.school;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple Student object.
 */
public class StudentTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void studentBorrowBook()
    {
        Book book =new Book();
        book.AddBook("#id-1","Introduction to Maths",7);
        book.AddBook("#id-2","Introduction to Biology",4);
        book.AddBook("#id-3","Introduction to History",3);
        book.AddBook("#id-4","Introduction to Physics",5);


        Student student=new JuniorStudent("19cg026489","togun");

        assertEquals("Book successfully borrowed",student.BorrowBook("#id-1"));
    }

    @Test

    public void studentReturnBook()
    {
        Book book =new Book();
        book.AddBook("#id-1","Introduction to Maths",7);
        book.AddBook("#id-2","Introduction to Biology",4);
        book.AddBook("#id-3","Introduction to History",3);
        book.AddBook("#id-4","Introduction to Physics",5);


        Student student=new SeniorStudent("19cg026489","togun");
        String BookId="#id-1";
        assertEquals("Book successfully borrowed",student.BorrowBook(BookId));
        assertEquals("Book returned",student.ReturnBook(BookId));

    }

}
