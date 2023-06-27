package com.hyz.dongtaishuzu;

public class DongTaiShuZu {
    private int rongLiang = 8;//容量
    private int size = 0;//长度
    private int[] array = new int[rongLiang];//静态数组

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
     * 遍历数组
     */
    public void forEach() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

}
