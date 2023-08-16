package com.hyz.youxianduilie;

public interface Queue<E> {

    /**
     * 在队列中插入元素
     *
     * @param value 待插入的元素值
     * @param level 待插入的元素的优先级,数值越大，优先级别越高
     * @return 插入结果/成功true/失败false
     */
    boolean offer(E value, int level);

    /**
     * 返回队列优先级别最高的元素
     */
    E peek();

    /**
     * 返回并删除队列优先级别最高的元素，
     */
    E poll();

    /**
     * 判断队列是否已存储满，若满，返回true，否则，返回false
     */
    boolean isFull();

    /**
     * 判断队列是否为空，若空，返回true，否则，返回false
     */
    boolean isEmpty();
}
