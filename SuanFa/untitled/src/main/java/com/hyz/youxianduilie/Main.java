package com.hyz.youxianduilie;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        YouXianDuiLie<Integer> youXianDuiLie = new YouXianDuiLie<>(5);
        youXianDuiLie.offer(1,1);
        youXianDuiLie.offer(2,2);
        youXianDuiLie.offer(3,5);
        youXianDuiLie.offer(4,4);
        youXianDuiLie.offer(5,5);
//        forEach(youXianDuiLie);
        System.out.println(youXianDuiLie.peek());
//        forEach(youXianDuiLie);
    }

    private static void forEach(YouXianDuiLie<Integer> youXianDuiLie) {
        System.out.println("开始");
        Iterator<Integer> iterator = youXianDuiLie.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("结束");
    }
}
