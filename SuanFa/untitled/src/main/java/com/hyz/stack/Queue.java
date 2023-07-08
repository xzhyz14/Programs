package com.hyz.stack;

public interface Queue<E> {

    /**
     * 将元素压入栈
     * @param value 待压入栈的元素
     * @return 操作成功返回true，操作失败返回false
     */
    boolean push(E value);

    /**
     * 移除栈顶元素，并返回栈顶元素的值
     * @return
     */
    E pop();

    /**
     * 获取栈顶元素值，不移除栈顶元素
     * @return
     */
    E peek();

    /**
     * 判断栈是否为空
     * @return  栈为空，返回true,否则，返回false
     */
    boolean isEmpty();

    /**
     * 判断栈是否已满
     * @return  栈已满，返回true，否则，返回false
     */
    boolean isFull();
}
