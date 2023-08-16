package com.hyz.shuangduanduilie;

import java.util.Iterator;

public class ShuangDuanDuiLie<E> implements Iterable<E>, Queue<E> {
    private int capacity;   //双端队列的容量
    private int size;       //双端队列储存的元素值
    private Node<E> head;   //双端队列的哨兵节点

    public ShuangDuanDuiLie(int capacity) {
        this.capacity = capacity;
        head = new Node<E>(null, null, null);
        head.prev = head;
        head.next = head;
    }

    @Override
    public boolean offerFisrt(E value) {
        if (isFull()) {
            return false;
        }
        Node<E> prev = head;
        Node<E> next = prev.next;
        Node<E> add = new Node<>(prev, value, next);
        prev.next = add;
        next.prev = add;
        size++;
        return true;
    }

    @Override
    public boolean offerLast(E value) {
        if (isFull()) {
            return false;
        }
        Node<E> prev = head.prev;
        Node<E> next = head;
        Node<E> add = new Node<>(prev, value, next);
        prev.next = add;
        next.prev = add;
        size++;
        return true;
    }

    @Override
    public E pollFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<E> prev = head;
        Node<E> remove = prev.next;
        Node<E> next = remove.next;
        prev.next = next;
        next.prev = prev;
        size--;
        return remove.value;
    }

    @Override
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        Node<E> next = head;
        Node<E> remove = next.prev;
        Node<E> prev = remove.prev;
        prev.next = next;
        next.prev = prev;
        size--;
        return remove.value;
    }

    @Override
    public E peekFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.next.value;
    }

    @Override
    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return head.prev.value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> p = head.next;

            @Override
            public boolean hasNext() {
                return p != head;
            }

            @Override
            public E next() {
                E value = p.value;
                p = p.next;
                return value;
            }
        };
    }

    private static class Node<E> {
        private Node<E> prev;
        private E value;
        private Node<E> next;

        public Node(Node<E> prev, E value, Node<E> next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }


}
