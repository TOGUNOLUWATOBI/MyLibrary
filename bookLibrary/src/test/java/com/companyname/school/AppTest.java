package com.companyname.school;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static Logger logger=Logger.getLogger(AppTest.class);

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAssertPriorityQyeue()
    {
        DOMConfigurator.configure("log4j.xml");


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

        Collections.sort(priorityQueue,new App.SortbyStatus()  );

//        Iterator iterator=priorityQueue.iterator();
//        while (iterator.hasNext())
//        {
//            Person p= (Person) iterator.next();
//            logger.info(p.name);
//        }

        ArrayList<Person> ExpectedPriorityQueue=new ArrayList<>();
        ExpectedPriorityQueue.add(th1);
        ExpectedPriorityQueue.add(th2);
        ExpectedPriorityQueue.add(th3);
        ExpectedPriorityQueue.add(std2);
        ExpectedPriorityQueue.add(std1);
        ExpectedPriorityQueue.add(std3);

        assertArrayEquals(ExpectedPriorityQueue.toArray(), priorityQueue.toArray() );
    }



}

