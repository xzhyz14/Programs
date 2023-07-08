package com.hyz.stack;

import java.util.Iterator;


public class Stack<E> implements Iterable<E>, Queue<E> {
    private Node<E> head;   //哨兵节点
    private int capacity;   //栈的容量
    private int size;       //栈内元素的个数


    private static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    public Stack(int capacity) {
        this.head = new Node<E>(null, null);
        this.capacity = capacity;
    }

    @Override
    public boolean push(E value) {
        if (isFull()){
            return false;
        }
        head.next = new Node<E>(value,head.next);
        size++;
        return true;
    }

    @Override
    public E pop() {
        if (isEmpty()){
            return null;
        }
        Node<E> remove = head.next;
        head.next = remove.next;
        size--;
        return remove.value;
    }

    @Override
    public E peek() {
        if (isEmpty()){
            return null;
        }
        return head.next.value;
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
                return p != null;
            }

            @Override
            public E next() {
                E value = p.value;
                p = p.next;
                return value;
            }
        };
    }
}
