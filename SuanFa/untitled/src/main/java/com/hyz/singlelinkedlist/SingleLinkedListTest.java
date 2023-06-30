package com.hyz.singlelinkedlist;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.Iterator;

public class SingleLinkedListTest {

    @Test
    @DisplayName("添加首位")
    public void test001(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(3);
    }

    @Test
    @DisplayName("遍历元素")
    public void test002(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(2);
//        singleLinkedList.addFirst(3);
//        singleLinkedList.addLast(4);
//        singleLinkedList.addLast(5);
//        singleLinkedList.addLast(6);
        singleLinkedList.loop1(value -> System.out.println(value));
//        singleLinkedList.loop2(value -> System.out.println(value));
//        Iterator<Integer> iterator = singleLinkedList.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        System.out.println("============");
        singleLinkedList.insert(2,9);
        System.out.println("============");
        singleLinkedList.loop1(value -> System.out.println(value));



    }
}
