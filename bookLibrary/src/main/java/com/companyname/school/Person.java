package com.companyname.school;

// Abstract class person for people Teacher and student
public abstract class Person {
    //class properties declaration
    public String ID = null;
    public String name = null;
    public boolean borrow_book= false;

    //property status to know your level
    /*
    1-Teacher
    2-senior student
    3-Junior student
     */
    public int statusLevel;


    //class methods declaration
    public abstract String BorrowBook(String BookId) ;
    public abstract String ReturnBook(String BookId);
}
