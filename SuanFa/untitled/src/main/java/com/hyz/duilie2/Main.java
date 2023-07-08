package com.hyz.duilie2;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        DuiLie<String> duiLie = new DuiLie<>();
        duiLie.offer("I");
        duiLie.offer("love");
        duiLie.offer("you");
        duiLie.offer(",");
        duiLie.offer("China");
        duiLie.offer("!");

        duiLie.peek();

        Iterator<String> iterator = duiLie.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
