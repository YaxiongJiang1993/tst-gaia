package com.davih.tst.alogrithm.t2025;

public class MaxSubArrayTest {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSubArray = new MaxSubArrayTest().maxSubArray(nums);
        System.out.println(maxSubArray);
    }

    public int maxSubArray(int[] nums) {
        int pre = 0;
        int maxSubArray = nums[0];
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre+nums[i], nums[i]);
            maxSubArray = Math.max(maxSubArray, pre);
        }

        return maxSubArray;
    }
}
