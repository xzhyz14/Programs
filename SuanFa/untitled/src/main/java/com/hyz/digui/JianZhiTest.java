package com.hyz.digui;

import org.springframework.util.StopWatch;

import java.util.Arrays;

public class JianZhiTest {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch("剪枝优化测试");
        int n = 50;

        stopWatch.start("剪枝前");
        System.out.println(f1(n));
        stopWatch.stop();

        stopWatch.start("剪枝后");
        System.out.println(f2(n));
        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());

    }

    /**
     * 原始方法
     *
     * @param n
     * @return
     */
    private static int f1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return f1(n - 1) + f1(n - 2);
    }

    /**
     * 改进后的方法调用
     * @param n
     * @return
     */
    private static int f2(int n) {
        int[] nums = new int[n + 2];
        Arrays.fill(nums, -1);
        nums[0] = 0;
        nums[1] = 1;
        return f3(nums, n);
    }

    /**
     * 改进后的运算内核
     * @param nums
     * @param n
     * @return
     */
    private static int f3(int[] nums, int n) {
        if (nums[n] != -1) {
            return nums[n];
        }

        int a = f3(nums, n - 1);
        int b = f3(nums, n - 2);
        nums[n] = a + b;
        return nums[n];
    }
}
