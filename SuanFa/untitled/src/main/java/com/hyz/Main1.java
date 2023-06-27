package com.hyz;

public class Main1 {
    public static void main(String[] args) {
        int[] nums = {7, 13, 21, 30, 38, 44, 52, 53};
        erFenChaZhao(nums, 5);
    }

    /**
     * 普通版的二分查找，左闭右闭
     *
     * @param nums
     * @param target
     * @return
     */
    public static int erFenChaZhao(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) >>> 1;
            if (target < nums[middle]) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
