package com.hyz.danxianglianbiao;

import java.util.Iterator;
import java.util.function.Consumer;

public class DanXiangLianBiao implements Iterable<Integer> {
    private Node head = null;//头结点

    private static class Node {
        private int value;//储存值
        private Node next;//指针

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

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
                if (head == null) {
                    runtimeException();
                }
                return p != null;
            }

            @Override
            public Integer next() {
                Integer v = p.value;
                p = p.next;
                return v;
            }
        };
    }


    /**
     * 添加头节点
     *
     * @param value
     */
    public void addFirst(int value) {
        //单链表为null
//        head = new Node(value,null);
        //单链表不为null
        head = new Node(value, head);
    }

    /**
     * 在单链表末尾添加节点
     *
     * @param value
     */
    public void addLast(int value) {
        //单链表为null
        if (head == null) {
            addFirst(value);
            return;
        }

        //单链表不为null
        if (head != null) {
            Node lastNode = findLastNode();
            lastNode.next = new Node(value, null);
        }
    }

    /**
     * 在指定索引处插入元素
     *
     * @param index
     * @param value
     */
    public void insert(int index, int value) {
        if (index == 0) {
            addFirst(value);
            return;
        }

        Node pre = findIndexNode(index - 1);
        if (pre == null) {
            throw getException(index);
        }
        pre.next = new Node(value, pre.next);
    }


    /**
     * 删除头结点
     *
     * @return 被删除头结点的值
     */
    public int removeFirst() {
        if (head == null) {
            runtimeException();
        }

        Node remove = head;//被删除的节点
        head = remove.next;
        return remove.value;
    }

    /**
     * 根据索引删除节点
     *
     * @param index 索引
     * @return 被删除的节点值
     */
    public int remove(int index) {
        if (head == null) {
            runtimeException();
        }

        if (index == 0) {
            return removeFirst();
        }

        Node pre = findIndexNode(index - 1);
        if (pre == null) {
            throw getException(index);
        }
        Node remove = pre.next;//被删除节点
        pre.next = remove.next;
        return remove.value;
    }

    /**
     * 删除最后一个节点
     *
     * @return
     */
    public int removeLast() {
        if (head == null) {
            runtimeException();
        }
        Node last2Node = findLast2Node();
        int remove = last2Node.next.value;
        last2Node.next = null;
        return remove;
    }


    /**
     * 遍历单链表
     *
     * @param consumer
     */
    public void loop1(Consumer<Integer> consumer) {
        if (head == null) {
            runtimeException();
        }
        Node p = head;
        while (p != null) {
            consumer.accept(p.value);
            p = p.next;
        }
    }

    /**
     * 遍历单链表
     *
     * @param consumer
     */
    public void loop2(Consumer<Integer> consumer) {
        if (head == null) {
            runtimeException();
        }
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
        if (head == null) {
            runtimeException();
        }
        Node indexNode = findIndexNode(index);
        if (indexNode == null) {
            throw getException(index);
        }
        return indexNode.value;
    }

    /**
     * 输入参数异常
     *
     * @param index
     * @return
     */
    private static IllegalArgumentException getException(int index) {
        return new IllegalArgumentException("输入参数'" + index + "'异常");
    }

    /**
     * 未定义节点异常
     */
    private static void runtimeException() {
        throw new RuntimeException("该单链表未定义节点");
    }


    /**
     * 根据索引寻找节点
     *
     * @param index
     * @return
     */
    private Node findIndexNode(int index) {
        int i = 0;
        for (Node p = head; p != null; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
    }

    /**
     * 寻找最后一个节点
     *
     * @return
     */
    private Node findLastNode() {
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
     * 寻找倒数第二个节点
     *
     * @return
     */
    private Node findLast2Node() {
        Node p = head;
        while (p != null) {
            if (p.next.next == null) {
                return p;
            }
            p = p.next;
        }
        return null;
    }


}


