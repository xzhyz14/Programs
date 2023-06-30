package com.hyz.dongtaishuzu2;

public class DongTaiShuZu2 {
    private int size = 0;
    private int rongLiang = 8;
    private int[] array = {};

    /**
     * 获取数组有效长度
     * @return 数组有效长度
     */
    public int length(){
        return size;
    }


    /**
     * 向指定索引添加元素
     * @param index     指定索引
     * @param element   添加元素
     */
    public void add(int index,int element){
        checkRongLiang();
        array[index] = element;
        size++;
    }


    /**
     * 向数组末尾插入元素
     * @param element 插入元素
     */
    public void add(int element){
        checkRongLiang();
        array[size] = element;
        size++;
    }

    /**
     * 数组扩容
     */
    private void checkRongLiang() {
        if (size == 0){//懒加载
            array = new int[rongLiang];
        }
        if(size == rongLiang){//扩容
            rongLiang += rongLiang >> 2;
            int[] newArray = new int[rongLiang];
            System.arraycopy(array,0,newArray,0,size);
            array = newArray;
        }
    }

    /**
     * 删除指定索引的元素
     * @param index 指定索引
     * @return 被删除元素
     */
    public int delete(int index){
        if (index >= 0 && index < size){
            int delete = array[index];
            System.arraycopy(array,(index+1),array,index,(size-index-1));
            size--;
            return delete;
        }
        return -1;
    }

    /**
     * 遍历数组
     */
    public void forEach(){
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
    }

}
