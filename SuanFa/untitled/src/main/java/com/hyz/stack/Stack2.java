package com.hyz.stack;

import java.util.Iterator;

public class Stack2<E> implements Iterable<E>, Queue<E> {
    private E[] array;      //储存栈的数组
    private int size;       //栈储存的元素个数

    public Stack2(int capacity) {
        this.array = (E[]) new Object[capacity];
    }

    @Override
    public boolean push(E value) {
        if (isFull()){
            return false;
        }
        array[size++] = value;
        return true;
    }

    @Override
    public E pop() {
        if (isEmpty()){
            return null;
        }
        return array[--size];
    }

    @Override
    public E peek() {
        if (isEmpty()){
            return null;
        }
        return array[--size];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == array.length;
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int p = size;

            @Override
            public boolean hasNext() {
                return p > 0;
            }

            @Override
            public E next() {
                return array[--p];
            }
        };
    }
}
