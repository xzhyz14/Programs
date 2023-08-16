package com.hyz.shuangduanduilie;

import java.util.Iterator;

public class ShuangDuanDuiLie2Test {
    public static void main(String[] args) {
        ShuangDuanDuiLie2<Integer> shuangDuanDuiLie2 = new ShuangDuanDuiLie2<>(5);

        shuangDuanDuiLie2.offerFisrt(1);
        shuangDuanDuiLie2.offerFisrt(2);
        shuangDuanDuiLie2.offerFisrt(3);
//
//        System.out.println(shuangDuanDuiLie2.peekFirst());
//        System.out.println(shuangDuanDuiLie2.peekFirst());
//        System.out.println(shuangDuanDuiLie2.peekFirst());


//        shuangDuanDuiLie2.offerLast(1);
//        shuangDuanDuiLie2.offerLast(2);
//        shuangDuanDuiLie2.offerLast(3);

        shuangDuanDuiLie2.pollLast();


        forEach(shuangDuanDuiLie2);

    }

    private static void forEach(ShuangDuanDuiLie2<Integer> shuangDuanDuiLie2) {
        Iterator<Integer> iterator = shuangDuanDuiLie2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
