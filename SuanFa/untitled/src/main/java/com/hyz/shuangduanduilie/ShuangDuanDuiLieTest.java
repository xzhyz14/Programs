package com.hyz.shuangduanduilie;

import java.util.Iterator;

public class ShuangDuanDuiLieTest {
    public static void main(String[] args) {
        ShuangDuanDuiLie<Integer> shuangDuanDuiLie = new ShuangDuanDuiLie<>(10);
        shuangDuanDuiLie.offerFisrt(1);
        shuangDuanDuiLie.offerFisrt(2);
        shuangDuanDuiLie.offerFisrt(3);
        shuangDuanDuiLie.offerFisrt(4);
        shuangDuanDuiLie.offerFisrt(5);


//        shuangDuanDuiLie.offerLast(1);
//        shuangDuanDuiLie.offerLast(2);
//        shuangDuanDuiLie.offerLast(3);
//        shuangDuanDuiLie.offerLast(4);
//        shuangDuanDuiLie.offerLast(5);
        forEach(shuangDuanDuiLie);
        System.out.println(shuangDuanDuiLie.pollFirst());
        System.out.println(shuangDuanDuiLie.pollLast());
        forEach(shuangDuanDuiLie);

    }

    private static void forEach(ShuangDuanDuiLie<Integer> shuangDuanDuiLie) {
        Iterator<Integer> iterator = shuangDuanDuiLie.iterator();
        System.out.println("=======开始==========");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=======结束==========");
    }
}
