package com.AllBehavioralDesignPattern.IteratorDesignPattern;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExploreIterator {

    public static void main(String[] args) {

        Set<Integer> ll=new LinkedHashSet<>();

        ll.add(34);
        ll.add(43);
        ll.add(23);
        ll.add(54);

        Iterator<Integer> iterable=ll.iterator();
        while (iterable.hasNext())
        {
            int val=iterable.next();
            System.out.println(val);
        }

    }
}
