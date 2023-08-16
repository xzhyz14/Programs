package com.hyz.youxianduilie;

import java.util.Arrays;
import java.util.Iterator;

public class YouXianDuiLie<E> implements Iterable<E>, Queue<E> {
    private LevelObject<E>[] array;
    private int size;

    private static class LevelObject<E> {
        private E value;
        private int level;

        public LevelObject(E value, int level) {
            this.value = value;
            this.level = level;
        }

    }

    public YouXianDuiLie(int capacity) {
        array = new LevelObject[capacity + 1];
    }

    @Override
    public boolean offer(E value, int level) {
        if (isFull()) {
            return false;
        }
        array[size++] = new LevelObject<>(value, level);
        return true;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        E value = array[findMaxLevelIndex()].value;
        return value;
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        int index = findMaxLevelIndex();
        E value = array[index].value;
        System.arraycopy(array, index + 1, array, index, size - index);
        size--;
        return value;
    }


    /**
     * 寻找优先级别最高的元素的索引
     */
    public int findMaxLevelIndex() {
        int index = 0;
        for (int i = 1; i < size; i++) {
            if (array[i].level > array[i-1].level){
                index = i;
            }
        }
        return index;
    }

    @Override
    public boolean isFull() {
        return array.length - 1 == size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int p = 0;

            @Override
            public boolean hasNext() {
                return p < size;
            }

            @Override
            public E next() {
                E value = array[p++].value;
                return value;
            }
        };
    }


}
