package com.davih.tst.alogrithm.t2025;

public class RotateTest08 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        new RotateTest08().rotate(nums, 3);
        System.out.println(nums);
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[end];
            nums[end] = nums[start];
            nums[start] = tmp;
            start++;
            end--;
        }
    }
}
