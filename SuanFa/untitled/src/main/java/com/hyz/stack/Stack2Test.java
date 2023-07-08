package com.hyz.stack;

import java.util.Iterator;

public class Stack2Test {
    public static void main(String[] args) {
        Stack2<Integer> stack = new Stack2<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        forEach(stack);
        System.out.println(stack.pop());
        forEach(stack);

    }

    private static void forEach(Stack2<Integer> stack) {
        System.out.println("=====开始=======");
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=====结束=======");
    }
}
