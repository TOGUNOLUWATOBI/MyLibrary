package com.companyname.school;

import java.util.ArrayList;

//create class Book
public class Book {
    //declare properties of book
    public int quantity;
    public String ID;
    public String Name;

    //create an arraylist of books
    public static ArrayList <Book>booklist=new ArrayList();

    //book constructor
    public Book(){}

    //method to addbook or initialize book properties
    public void AddBook(String id,String name, int qty)
    {
        //create new of object of type book and intialize its properties
        Book book=new Book();
        book.ID=id;
        book.quantity=qty;
        book.Name=name;

        //add book to booklist
        booklist.add(book);
    }

    // check if bookId supplied is correct
    public Boolean CheckBookId(String BookId)
    {
        for(Book book:booklist)
        {
            if(BookId.equals(book.ID))
            {
                return true;
            }
        }
        return false;
    }

    //increase book quantity if book is returned
    public Boolean book_return(String BookId)
    {
        for(Book book:booklist) {
            //check if book id supplied is in the list
            if (BookId.equals(book.ID)) {
                //increase quantity of book
                book.quantity++;
                return true;
            }
        }

        return false;
    }

    //decrease quantity of book if borrowed
    public boolean book_borrow(String BookId) {
        //check if book id supplied is in the list
        for (Book book : booklist) {
            //check if bookid supplied is in list
            if (BookId.equals(book.ID)) {

                if (book.quantity > 0) {
                    //reduce quantity of book if available
                    book.quantity--;
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        return false;
    }

    public void print_books()
    {
        for (Book book :booklist)
        {
            System.out.println(book.ID);
        }
    }

}
