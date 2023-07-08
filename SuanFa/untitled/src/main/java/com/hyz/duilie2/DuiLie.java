package com.hyz.duilie2;

import java.util.Iterator;

public class DuiLie<E> implements Queue<E>, Iterable<E> {
    private Node<E> head;
    private Node<E> tail;

    public DuiLie() {
        Node<E> add = new Node<>(null, null);
        head = add;
        tail = add;
        add.next = add;
    }

    private static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    @Override
    public boolean offer(E value) {
        Node<E> add = new Node<>(value, head);
        tail.next = add;
        tail = add;
        return true;
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        Node<E> remove = head.next;
        Node<E> next = remove.next;
        head.next = next;
        return remove.value;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return head.next.value;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
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
}
