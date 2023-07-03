package com.hyz.digui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiGui {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(1);

        List<Integer> list2 = new ArrayList<>();
        list.add(1);


        System.out.println(Collections.addAll(list2));
    }
}
