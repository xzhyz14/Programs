package com.hyz.duilie;

public interface Queue<E> {

    /**
     * 向队尾插入值
     * @param value 待插入值
     * @return 插入成功返回true,插入失败返回false
     */
     boolean offer(E value);


    /**
     * 从队头获取值，并移除
     * @return 如果队列非空返回队头值，否则返回null
     */
     E poll();


    /**
     * 从队头获取值，不移除
     * @return  如果队列非空返回队头值，否则返回null
     */
    E peek();

    /**
     * 队列是否为空
     * @return  空返回true，否则返回false
     */
    boolean isEmpty();

}
