package com.companyname.school;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple Student object.
 */
public class TeacherTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void teacherBorrowBook()
    {
        //intialize book and create new books
        Book book1 =new Book();
        book1.AddBook("#id-1","Introduction to Maths",7);
        book1.AddBook("#id-2","Introduction to Biology",4);
        book1.AddBook("#id-3","Introduction to History",3);
        book1.AddBook("#id-4","Introduction to Physics",5);
        book1.AddBook("#id-5","Introduction to English",0);

        Teacher teacher=new Teacher("19cg026488","togun");

        assertEquals("Book not available currently",teacher.BorrowBook("#id-5"));
    }

    @Test
    public void teacherReturnBook()
    {
        //initialize student and create new students
        Book book2 =new Book();
        book2.AddBook("#id-1","Introduction to Maths",7);
        book2.AddBook("#id-2","Introduction to Biology",4);
        book2.AddBook("#id-3","Introduction to History",3);
        book2.AddBook("#id-4","Introduction to Physics",5);


        Student student=new Student("19cg026489","togun");
        String BookId="#id-1";
        assertEquals("Book successfully borrowed",student.BorrowBook(BookId));
        assertEquals("Book returned",student.ReturnBook(BookId));

    }

}
