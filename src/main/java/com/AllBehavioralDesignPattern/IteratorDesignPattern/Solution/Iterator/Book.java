package com.AllBehavioralDesignPattern.IteratorDesignPattern.Solution.Iterator;

public class Book {

    private String bookname;

    public Book(String bookname, int price) {
        this.bookname = bookname;
        this.price = price;
    }

    private int price;
    public String getBookname() {
        return bookname;
    }


    public int getPrice() {
        return price;
    }




}
