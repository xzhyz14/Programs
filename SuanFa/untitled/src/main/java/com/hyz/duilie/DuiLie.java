package com.hyz.duilie;


import java.util.Iterator;

public class DuiLie<E> implements Queue<E>, Iterable<E> {
    private Node<E> head;//头指针
    private Node<E> tail;//尾指针

    public DuiLie() {
        head = new Node<E>(null, null);
        tail = head;
        tail.next = head;
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
        Node<E> prev = head;
        Node<E> remove = prev.next;
        Node<E> next = remove.next;
        prev.next = next;
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

    private static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }


}
