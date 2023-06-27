package com.hyz;


public class Main2 {
    public static void main(String[] args) {
        int[] nums = {7, 13, 21, 30, 38, 44, 52, 53};
        erFenChaZhao(nums, 5);
    }

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    private static int erFenChaZhao(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int middle = (left + right) >>> 1;
            if (target < nums[middle]) {
                right = middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
