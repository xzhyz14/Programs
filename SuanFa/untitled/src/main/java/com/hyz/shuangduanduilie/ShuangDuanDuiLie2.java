package com.hyz.shuangduanduilie;

import java.util.Arrays;
import java.util.Iterator;

public class ShuangDuanDuiLie2<E> implements Iterable<E>, Queue<E> {
    private E[] array;
    private int head;
    private int tail;
    private int size;

    public ShuangDuanDuiLie2(int capacity) {
        array = (E[]) new Object[capacity];
    }


    /**
     * t
     * h
     * 0 1 2 3
     *
     */
    @Override
    public boolean offerFisrt(E value) {
        if (isFull()) {
            return false;
        }
        head = dec(head, array.length);
        array[head] = value;
        size++;
        System.out.println(Arrays.toString(array));
        return false;
    }

    @Override
    public boolean offerLast(E value) {
        if (isFull()) {
            return false;
        }
        array[tail] = value;
        tail = inc(tail, array.length);
        size++;
        return true;
    }

    @Override
    public E pollFirst() {
        if (isEmpty()) {
            return null;
        }
        E value = array[head];
        array[head] = null;
        head = inc(head, array.length);
        return value;
    }

    @Override
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        tail = dec(tail, array.length);
        E value = array[tail];
        array[tail] = null;
        return value;
    }

    @Override
    public E peekFirst() {
        if (isEmpty()) {
            return null;
        }
        E value = array[head];
        head = inc(head, array.length);
        return value;
    }

    @Override
    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        tail = dec(tail, array.length);
        E value = array[tail];
        return value;
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
        final int[] p = {head};
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return p[0] != tail;
            }

            @Override
            public E next() {
                E value = array[p[0]];
                p[0] = inc(p[0], array.length);
                return value;
            }
        };
    }
}
