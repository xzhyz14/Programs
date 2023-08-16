package com.hyz.shuangduanduilie;

public interface Queue<E> {
    /**
     * 双端队列索引越界问题解决方案-加法
     * @param index
     * @param len
     * @return
     */
    default int inc(int index, int len){
        if (index+1 >= len){
            return 0;
        }
        return index+1;
    }

    /**
     * 双端队列索引越界问题解决方案-减法
     * @param index
     * @param len
     * @return
     */
    default int dec(int index, int len){
        if (index-1 < 0){
            return len-1;
        }
        return index-1;
    }

    /**
     * 在队列头部插入元素
     *
     * @param value 待插入元素
     * @return 操作成功，true，否则，false
     */
    boolean offerFisrt(E value);


    /**
     * 在队列尾部插入元素
     *
     * @param value 待插入元素
     * @return 操作成功，true，否则，false
     */
    boolean offerLast(E value);

    /**
     * 获取头部元素值，并移除
     *
     * @return 若队列为空，返回null,否则,返回头部元素
     */
    E pollFirst();

    /**
     * 获取尾部元素值，并移除
     *
     * @return 若队列为空，返回null,否则,返回尾部元素
     */
    E pollLast();

    /**
     * 获取队列头部元素，不移除
     *
     * @return 若队列为空，返回null,否则,返回头部元素
     */
    E peekFirst();

    /**
     * 获取队列尾部元素，不移除
     *
     * @return 若队列为空，返回null,否则,返回尾部元素
     */
    E peekLast();

    /**
     * 判断双端队列是否为空
     *
     * @return 空，true，非空，false
     */
    boolean isEmpty();

    /**
     * 判断双向队列是否已满
     *
     * @return 若满，true，若没满，false
     */
    boolean isFull();
}
