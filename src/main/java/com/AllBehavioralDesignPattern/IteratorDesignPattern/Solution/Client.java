package com.AllBehavioralDesignPattern.IteratorDesignPattern.Solution;

import com.AllBehavioralDesignPattern.IteratorDesignPattern.Solution.Aggregate.Library;
import com.AllBehavioralDesignPattern.IteratorDesignPattern.Solution.Iterator.Book;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Book> list= Arrays.asList(

                new Book("Science", 100),
                new Book("Math", 200),
                new Book("GK", 200),
                new Book("SST", 400)
        );


        Library lin=new Library(list);
        Iterator iterator= (Iterator) lin.createIterator();

        while (iterator.hasNext())
        {
            Book book=(Book) iterator.next();
            System.out.println(book.getBookname());

        }
    }

}
