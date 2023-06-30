package com.hyz.danxianglianbiao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.function.Consumer;

public class DanLianBiaoTest {
    @Test
    @DisplayName("测试头结点的添加")
    public void test001() {
        DanXiangLianBiao d = new DanXiangLianBiao();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        d.loop1(v -> System.out.println(v));
        d.loop2(v -> System.out.println(v));
    }


    @Test
    @DisplayName("测试空单链表的遍历")
    public void test002() {
        DanXiangLianBiao d = new DanXiangLianBiao();

        System.out.println("第一种");
//        d.loop1(v-> System.out.println(v));
        System.out.println("第二种");
//        d.loop2(v-> System.out.println(v));
        System.out.println("第三种");
        Iterator<Integer> iterator = d.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


    @Test
    @DisplayName("测试有值单链表的遍历")
    public void test003() {
        DanXiangLianBiao d = new DanXiangLianBiao();

        for (int i = 0; i < 10; i++) {
            d.addFirst(i + 1);
        }

        System.out.println("第一种");
        d.loop1(v -> System.out.println(v));
        System.out.println("第二种");
        d.loop2(v -> System.out.println(v));
        System.out.println("第三种");
        Iterator<Integer> iterator = d.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    @DisplayName("根据索引获取节点值")
    public void test004() {
        DanXiangLianBiao d = new DanXiangLianBiao();
//        System.out.println(d.get(0));

        for (int i = 1; i <= 10; i++) {
            d.addFirst(i);
        }

        for (int i = 0; i <= 10; i++) {
            int v = d.get(i);
            System.out.println(v);
        }
    }


    @Test
    @DisplayName("测试在单链表末尾添加节点")
    public void test005() {
        DanXiangLianBiao d = new DanXiangLianBiao();


        d.addFirst(1);
        for (int i = 2; i <= 10; i++) {
            d.addLast(i);
        }

        d.loop1(v -> System.out.println(v));
    }

    @Test
    @DisplayName("测试在单链表中删除头节点")
    public void test006() {
        DanXiangLianBiao d = new DanXiangLianBiao();

        for (int i = 1; i <= 10; i++) {
            d.addLast(i);
        }

        d.loop1(v -> System.out.println(v));
        d.removeFirst();
        d.loop1(v -> System.out.println(v));
    }

    @Test
    @DisplayName("测试在单链表中删除尾部节点")
    public void test007() {
        DanXiangLianBiao d = new DanXiangLianBiao();

        for (int i = 1; i <= 10; i++) {
            d.addFirst(i);
        }
        System.out.println("删除前");
        d.loop1(v -> System.out.println(v));
        d.removeLast();
        d.removeLast();
        d.removeFirst();
        System.out.println("删除后");
        d.loop1(v -> System.out.println(v));
    }

    @Test
    @DisplayName("测试在单链表中根据指定索引删除")
    public void test008() {
        DanXiangLianBiao d = new DanXiangLianBiao();
//        d.addFirst(1);
//        d.remove(11);

        for (int i = 1; i <= 10; i++) {
            d.addFirst(i);
        }
        System.out.println("删除前");
        d.loop1(new Consumer<Integer>() {
            int i = 0;

            @Override
            public void accept(Integer integer) {
                System.out.println(i + "->" + integer);
                i++;
            }
        });
        d.remove(2);
        System.out.println("删除后");
        d.loop1(new Consumer<Integer>() {
            int i = 0;

            @Override
            public void accept(Integer integer) {
                System.out.println(i + "->" + integer);
                i++;
            }
        });
    }

    @Test
    @DisplayName("测试在单链表中根据指定索引插入节点")
    public void test009() {
        DanXiangLianBiao d = new DanXiangLianBiao();
        d.insert(0, 1);
        d.insert(1, 2);
        d.insert(0, 3);
        d.insert(1, 4);
        d.insert(11,100);
        d.loop1(v -> System.out.println(v));

    }

}
