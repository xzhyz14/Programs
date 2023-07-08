package com.hyz.stack;

import com.hyz.duilie3.DuiLie;

import java.util.Iterator;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        forEach(stack);
        stack.peek();
        forEach(stack);

    }

    private static void forEach(Stack<Integer> stack) {
        System.out.println("=====开始=======");
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=====结束=======");
    }
}
