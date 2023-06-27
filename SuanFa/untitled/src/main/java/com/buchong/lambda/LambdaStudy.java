package com.buchong.lambda;

public class LambdaStudy {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("新的多线程启动了")).start();

        new Thread(() -> {System.out.println("hello world !!!");}).start();

    }


}
