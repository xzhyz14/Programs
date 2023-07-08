package com.hyz.duilie2;

public interface Queue<E> {
    /**
     * 向队尾插入元素
     *
     * @param value 待插入值
     * @return 成功返回true，否则返回false
     */
    boolean offer(E value);

    /**
     * 从队头获取元素并移除
     *
     * @return 操作成功返回true，失败返回false
     */
    E poll();

    /**
     * 从队头获取元素，不移除
     *
     * @return 操作成功返回true，失败返回false
     */
    E peek();

    /**
     * 判断链表是否为空
     *
     * @return 空返回true, 否则返回false
     */
    boolean isEmpty();
}
