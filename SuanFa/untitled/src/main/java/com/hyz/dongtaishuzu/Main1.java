package com.hyz.dongtaishuzu;


public class Main1 {
    public static void main(String[] args) {
        DongTaiShuZu dongTaiShuZu = new DongTaiShuZu();
//        dongTaiShuZu.addLast(1);
//        dongTaiShuZu.addLast(2);
//        dongTaiShuZu.addLast(3);
//
//        dongTaiShuZu.forEach(integer-> System.out.println(integer));
//        int remove = dongTaiShuZu.remove(2);
//        System.out.println("被删除的元素为：" + remove);
//        System.out.println("元素删除后：");
//        dongTaiShuZu.forEach(integer-> System.out.println(integer));


        for (int i = 1; i <= 33; i++) {
            dongTaiShuZu.add((i-1),i);
        }

        dongTaiShuZu.forEach(i-> System.out.println(i));
    }
}
