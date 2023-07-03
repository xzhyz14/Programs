package com.hyz.shuanglianbiao;

import java.util.Iterator;
import java.util.function.Consumer;

public class ShuangLianBiao implements Iterable<Integer> {
    private Node head;//带哨兵头结点
    private Node last;//带哨兵尾节点

    public ShuangLianBiao() {
        //初始化哨兵
        this.head = new Node(null, Integer.MAX_VALUE, null);
        this.last = new Node(null, Integer.MAX_VALUE, null);
        head.next = last;
        last.prev = head;
    }

    @Override
    public Iterator<Integer> iterator() {
        final Node[] p = {head.next};
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return p[0] != last;
            }

            @Override
            public Integer next() {
                Integer value = p[0].value;
                p[0] = p[0].next;
                return value;
            }
        };
    }


    private static class Node {
        private Node prev;//上一个
        private int value;//存储值
        private Node next;//下一个

        public Node(Node prev, int value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    /**
     * 添加首结点
     *
     * @param value
     */
    public void addFirst(int value) {
        Node prev = head;
        Node next = prev.next;
        Node insert = new Node(prev, value, next);
        prev.next = insert;
        next.prev = insert;
    }

    /**
     * 在末尾添加节点
     *
     * @param value
     */
    public void addLast(int value) {
        Node prev = last.prev;
        Node insert = new Node(prev, value, last);
        prev.next = insert;
        last.prev = insert;
    }

    /**
     * 在指定索引处添加节点
     *
     * @param index
     * @param value
     */
    public void insert(int index, int value) {
        Node prev = findNode(index - 1);
        nullException(index, prev);
        Node next = prev.next;
        Node insert = new Node(prev, value, next);
        prev.next = insert;
        next.prev = insert;
    }

    /**
     * 删除头结点
     */
    public int removeFirst() {
        Node prev = head;
        Node remove = head.next;
        Node next = remove.next;
        prev.next = next;
        next.prev = prev;
        return remove.value;
    }

    /**
     * 删除尾节点
     *
     * @return
     */
    public int removeLast() {
        Node remove = last.prev;
        Node prev = remove.prev;
        prev.next = last;
        last.prev = prev;
        return remove.value;
    }

    /**
     * 删除指定索引处的节点
     * @param index
     * @return
     */
    public int remove(int index) {
        Node prev = findNode(index - 1);
        nullException(index, prev);
        Node remove = prev.next;
        Node next = remove.next;
        nullException(index,next);
        prev.next = next;
        next.prev = prev;
        return remove.value;
    }

    /**
     * 获取节点存储值
     *
     * @param index
     * @return
     */
    public int get(int index) {
        Node node = findNode(index);
        nullException(index, node);
        return node.value;
    }


    /**
     * 寻找节点
     *
     * @param index
     * @return
     */
    private Node findNode(int index) {
        int i = -1;
        for (Node p = head; p != last; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
    }


    /**
     * 遍历链表
     *
     * @param consumer
     */
    public void loop(Consumer<Integer> consumer) {
        Node p = head.next;
        while (p != last) {
            consumer.accept(p.value);
            p = p.next;
        }
    }

    /**
     * 遍历链表
     *
     * @param consumer
     */
    public void loop2(Consumer<Integer> consumer) {
        for (Node p = head.next; p != last; p = p.next) {
            consumer.accept(p.value);
        }
    }

    /**
     * 空指向异常
     *
     * @param index
     * @param node
     */
    private static void nullException(int index, Node node) {
        if (node == null || index == -1) {
            throw new IllegalArgumentException("参数'" + index + "'异常");
        }
    }
}
