package com.hyz.shuanglianbiao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class Main {
    @Test
    @DisplayName("测试首结点添加以及遍历")
    public void test1() {
        ShuangLianBiao s = new ShuangLianBiao();
        s.addFirst(1);
        s.addFirst(2);
//        s.loop(v-> System.out.println(v));
//        s.loop2(v-> System.out.println(v));
        Iterator<Integer> iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    @DisplayName("获取节点值")
    public void test2() {
        ShuangLianBiao s = new ShuangLianBiao();
//        s.addFirst(1);
//        s.addFirst(2);
        System.out.println(s.get(-1));
    }

    @Test
    @DisplayName("在末尾添加节点")
    public void test3() {
        ShuangLianBiao s = new ShuangLianBiao();
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        s.loop(v -> System.out.println(v));
    }

    @Test
    @DisplayName("在任意位置添加节点")
    public void test4() {
        ShuangLianBiao s = new ShuangLianBiao();
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        s.insert(5, 6);
        s.loop(v -> System.out.println(v));
    }

    @Test
    @DisplayName("删除头结点")
    public void test5() {
        ShuangLianBiao s = new ShuangLianBiao();
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        System.out.println("删除前");
        s.loop(v -> System.out.println(v));
        System.out.println("删除中");
        System.out.println(s.removeFirst());
        System.out.println("删除后");
        s.loop(v -> System.out.println(v));
    }

    @Test
    @DisplayName("删除尾结点")
    public void test6() {
        ShuangLianBiao s = new ShuangLianBiao();
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);
        s.addLast(4);
        System.out.println("删除前");
        s.loop(v -> System.out.println(v));
        System.out.println("删除中");
        System.out.println(s.removeLast());
        System.out.println("删除后");
        s.loop(v -> System.out.println(v));
    }

    @Test
    @DisplayName("删除指定索引处的结点")
    public void test7() {
       removeIndex(0);
    }

    private static void removeIndex(int index) {
        ShuangLianBiao s = new ShuangLianBiao();
        s.addLast(1);
//        s.addLast(2);
//        s.addLast(3);
//        s.addLast(4);
        System.out.println("删除前");
        s.loop(v -> System.out.println(v));
        System.out.println("删除中");
        System.out.println(s.remove(index));
        System.out.println("删除后");
        s.loop(v -> System.out.println(v));
    }
}
