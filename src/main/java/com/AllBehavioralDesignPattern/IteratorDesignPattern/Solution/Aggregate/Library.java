package com.AllBehavioralDesignPattern.IteratorDesignPattern.Solution.Aggregate;

import com.AllBehavioralDesignPattern.IteratorDesignPattern.Solution.Iterator.Book;
import com.AllBehavioralDesignPattern.IteratorDesignPattern.Solution.Iterator.BookIterator;

import java.util.Iterator;
import java.util.List;

//AggreateConcerate Implimation
public class Library implements AggregateInterface {

    private List<Book> booklist;

    public Library(List<Book> booklist) {
        this.booklist = booklist;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(booklist);
    }
}
