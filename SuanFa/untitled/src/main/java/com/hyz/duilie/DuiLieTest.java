package com.hyz.duilie;

import java.util.Iterator;

public class DuiLieTest {
    public static void main(String[] args) {
        DuiLie<Integer> duiLie = new DuiLie<>();
        for (int i = 1; i <= 10 ; i++) {
            duiLie.offer(i);
        }
        Iterator<Integer> iterator = duiLie.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("================");
        System.out.println(duiLie.poll());
        System.out.println("================");
        Iterator<Integer> iterator2 = duiLie.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
