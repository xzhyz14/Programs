package com.hyz.maopao;

import org.springframework.util.StopWatch;

import java.util.Arrays;

public class MaoPao {
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 6, 1, 5, 4, 7};
        int[] arr2 = {3, 2, 6, 1, 5, 4, 7};
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        f1(arr1, arr1.length - 1);
        stopWatch.stop();
        System.out.println(Arrays.toString(arr1));

        stopWatch.start();
        f2(arr2, arr2.length - 1);
        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());
        System.out.println(Arrays.toString(arr2));
    }

    private static void f1(int[] arr, int len) {
        if (len == 0) {
            return;
        }

        for (int i = 0; i < len; i++) {
            if (arr[i] > arr[i + 1]) {
                int t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            }
        }
        f1(arr, len - 1);
    }

    private static void f2(int[] arr, int len) {
        if (len == 0) {
            return;
        }

        int index = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] > arr[i + 1]) {
                int t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
               index = i;
            }
        }
        f2(arr, index);
    }
}
