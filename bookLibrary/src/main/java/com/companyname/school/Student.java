package com.companyname.school;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

//Class Teacher inheriting class Person
public class Student extends Person {

    public static Logger log= Logger.getLogger(Student.class);



    public Student(String id, String name)
    {
        this.ID=id;
        this.name=name;

    }

    //overriding abstract method BorrowBook
    @Override
    public String BorrowBook(String BookId) {

        DOMConfigurator.configure("log4j.xml");
        String message="Book successfully borrowed";
        Book book=new Book();
        Library library=new Library();

        //Check if you have not borrowed a book previously
        // you can only one book at once
        if(this.borrow_book && book.CheckBookId(BookId) )
        {
            message="You cant borrow book return previous book";
            log.warn(message);
            return message;
        }
        //check if book is in library and it is available
        if(book.CheckBookId(BookId) ) {
            if(book.book_borrow(BookId)==false)
            {
                message="Book not available currently";
                log.info(message);
                return message;
            }
            //check that person has borrowed book
            this.borrow_book = true;
            log.info(message);
            return message;

        }
        else{
            message="book doesn't exist";
            log.error(message);
            return message;
        }

    }

    //override abstract class ReturnBook
    @Override
    public String ReturnBook(String BookId) {
        DOMConfigurator.configure("log4j.xml");

        Library library=new Library();

        /*check if book to be returned is in library and increase the quantity by 1
         */
        if(library.ReturnBorrowedBook(BookId)) {
            String message = "Book returned";
            this.borrow_book = false;
            log.info(message);
            return message;
        }
        else
        {
            String message="book doesn't exist";
            log.error(message);
            return message;
        }
    }



}
