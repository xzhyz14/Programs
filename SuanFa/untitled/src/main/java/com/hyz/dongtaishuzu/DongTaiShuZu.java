package com.hyz.dongtaishuzu;

import java.util.function.Consumer;

public class DongTaiShuZu {
    private int rongLiang = 8;//容量
    private int size = 0;//长度
    private int[] array = {};//静态数组

    /**
     * 向数组末尾添加元素
     *
     * @param element 待添加元素
     */
    public void addLast(int element) {
        add(size, element);
    }

    /**
     * 向指定索引添加元素
     *
     * @param index   指定索引
     * @param element 待添加元素
     */
    public void add(int index, int element) {

        checkRongLiang();

        if (index >= 0 && index < size) {
            System.arraycopy(array, index, array, (index + 1), (size - index));
            array[index] = element;
            size++;
        } else if (index == size) {
            array[size] = element;
            size++;
        }
    }

    /**
     * 容量检查
     */
    private void checkRongLiang() {
        if (rongLiang == 0) {
            array = new int[rongLiang];
        } else if (rongLiang == size) {
            rongLiang += rongLiang >> 2;
            int[] newArray = new int[rongLiang];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    /**
     * 遍历数组
     */
    public void forEach(Consumer<Integer> integerConsumer) {
        for (int i = 0; i < size; i++) {
            integerConsumer.accept(array[i]);
        }
    }

    /**
     * 根据索引删除元素
     *
     * @param index 索引
     * @return 被删除元素
     */
    public int remove(int index) {
        int remove = array[index];//被删除元素
        System.arraycopy(array, index + 1, array, index, size - index);
        size--;
        return remove;
    }

}
