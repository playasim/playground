package com.softnero.IteratorTest;

import java.util.Iterator;

/**
 * @Author Martin Ma
 * @Date 2018/12/24
 **/
public class LinkList<E> implements Iterable<E> {

    Object[] o;

    int size;

    int cursor;

    public LinkList(int size) {
        o =  new Object[size];
        this.size = size;
        cursor = 0;
    }

    public void add(E e) {

        o[cursor++] = e;
    }

    public Iterator<E> iterator() {
        return new linkListIterator();
    }

    class linkListIterator<E> implements Iterator<E> {
        int pos = 0;
        @Override
        public boolean hasNext() {
            return pos < size;
        }

        @Override
        public E next() {
            if (hasNext())
                return (E) o[pos++];
            else
                return null;
        }
    }



}
