package com.hyz.singlelinkedlist;

import java.util.Iterator;
import java.util.function.Consumer;

public class SingleLinkedList implements Iterable<Integer> {
    private Node head = null;

    /**
     * 迭代器遍历
     *
     * @return
     */
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = head;

            @Override
            public boolean hasNext() {
                return p != null;
            }

            @Override
            public Integer next() {
                int value = p.value;
                p = p.next;
                return value;
            }
        };
    }


    private static class Node {
        int value;//存储数值
        Node next;//指向下一个节点的指针

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    /**
     * 首位添加元素
     *
     * @param value
     */
    public void addFirst(int value) {
        //链表为null
//        head = new Node(value, null);
        //链表不为null
        head = new Node(value, head);
    }

    /**
     * 向尾部添加元素
     *
     * @param value
     */
    public void addLast(int value) {
        Node last = findLastNode();
        if (last == null) {//单链表为null
            addFirst(value);
            return;
        }
        last.next = new Node(value, null);
    }

    /**
     * 删除第一个节点
     */
    public void deleteFirst(){
        Node p = head;
        if (p != null){
            head = p.next;
        }
    }

    /**
     * 删除指定索引的节点
     * @param index
     */
    public void delete(int index){
        if (index == 0){
            deleteFirst();
            return;
        }
        Node pre = loop3(index - 1);
        if (pre == null){
            throw getIllegalArgumentException(index);
        }
        pre.next = null;
    }

    /**
     * 在指定索引处插入节点
     * @param index
     * @param value
     */
    public void insert(int index,int value){
        if (index == 0){
            addFirst(value);
            return;
        }
        Node pre = loop3(index - 1);
        if (pre == null){
            throw getIllegalArgumentException(index);
        }
        pre.next = new Node(value,pre.next);
    }

    /**
     * 寻找最后一个元素
     *
     * @return
     */
    public Node findLastNode() {
        //寻找最后一个元素
        Node p = head;
        while (p != null) {
            if (p.next == null) {
                return p;
            }
            p = p.next;
        }
        return null;
    }

    /**
     * while遍历元素
     *
     * @param consumer
     */
    public void loop1(Consumer<Integer> consumer) {
        Node p = head;
        while (p != null) {
            consumer.accept(p.value);
            p = p.next;
        }
    }

    /**
     * for遍历元素
     *
     * @param consumer
     */
    public void loop2(Consumer<Integer> consumer) {
        for (Node p = head; p != null; p = p.next) {
            consumer.accept(p.value);
        }
    }

    /**
     * 根据索引获取节点值
     *
     * @param index
     * @return
     */
    public int get(int index) {
        Node node = loop3(index);
        if (node == null) {
            throw getIllegalArgumentException(index);
        }
        return node.value;
    }

    /**
     * 异常处理
     *
     * @param index
     * @return
     */
    private static IllegalArgumentException getIllegalArgumentException(int index) {
        return new IllegalArgumentException("输入参数'" + index + "'异常");
    }

    /**
     * 根据索引遍历元素
     *
     * @param index
     * @return
     */
    private Node loop3(int index) {
        int i = 0;
        for (Node p = head; p != null; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
    }

}
