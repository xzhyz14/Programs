package com.hyz.twoweishuzu;

import org.springframework.util.StopWatch;

public class TwoWeiShuZu {
    public static void main(String[] args) {
        int rows = 9999;
        int columns = 100;
        int[][] array = new int[rows][columns];
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        ij(array,rows,columns);
        stopWatch.stop();

        stopWatch.start();
        ji(array,rows,columns);
        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());
    }

    public static void ij(int[][] array, int rows, int columns) {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void ji(int[][] array, int rows, int columns) {
        int sum = 0;
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }
}
