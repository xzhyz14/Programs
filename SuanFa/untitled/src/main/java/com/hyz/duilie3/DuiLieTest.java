package com.hyz.duilie3;

import java.util.Iterator;

public class DuiLieTest {
    public static void main(String[] args) {
        DuiLie<Integer> duiLie = new DuiLie<>(6);

        duiLie.offer(1);
        duiLie.offer(2);
        duiLie.offer(3);
        duiLie.offer(4);
        duiLie.offer(5);
        duiLie.offer(6);


        forEach(duiLie);

        duiLie.poll();

        forEach(duiLie);



    }

    private static void forEach(DuiLie<Integer> duiLie) {
        System.out.println("=====开始=======");
        Iterator<Integer> iterator = duiLie.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=====结束=======");
    }
}
