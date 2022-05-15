package com.companyname.school;


// class Library acting as Librarian
public class Library {
    //constructor Library
    public Library()
    {

    }

    //Method to return borrowed book
    public Boolean ReturnBorrowedBook( String BookId)
    {
        Book book=new Book();
        //check if book is registered
        if(book.CheckBookId(BookId)) {
            //if book is found call method book return in book class
            if(book.book_return(BookId)) {
                return true;
            }
        }
        return false;

    }

    public Boolean BorrowBook( String BookId)
    {
        Book book=new Book();
        if(book.CheckBookId(BookId)) {


            if(book.book_borrow(BookId)) {
                return true;
            }

        }
        return false;

    }



}
