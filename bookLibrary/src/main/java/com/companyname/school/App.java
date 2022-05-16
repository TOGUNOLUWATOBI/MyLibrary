package com.companyname.school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //create and books to library
        Book book=new Book();
        book.AddBook("#id-1","Introduction to Maths",7);
        book.AddBook("#id-2","Introduction to Biology",4);
        book.AddBook("#id-3","Introduction to History",3);
        book.AddBook("#id-4","Introduction to Physics",5);


        //create students and initialize
        Student std1=new JuniorStudent("1234","std1");
        Student std2=new SeniorStudent("4567","std2");
        Student std3=new JuniorStudent("7890","std3");

        //create teacher and initialize
        Teacher th1=new Teacher("1234","th1");
        Teacher th2=new Teacher("4567","th2");
        Teacher th3=new Teacher("7890","th3");

        //arraylist for priorqueue
        ArrayList<Person> priorityQueue=new ArrayList<>();
        priorityQueue.add(std1);
        priorityQueue.add(std3);
        priorityQueue.add(th1);
        priorityQueue.add(th2);
        priorityQueue.add(std2);
        priorityQueue.add(th3);

        Collections.sort(priorityQueue,new SortbyStatus()  );

        Iterator iterator=priorityQueue.iterator();
        while (iterator.hasNext())
        {
            Person p= (Person) iterator.next();
            System.out.println(p.name);
        }
    }
    static class SortbyStatus implements Comparator<Person> {
        // Used for sorting in ascending order of
// name
        public int compare(Person a, Person b)
        {
            return a.statusLevel-(b.statusLevel);
        }
    }


}
