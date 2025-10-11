package com.davih.tst.alogrithm.t2025;

public class MoveZeroesTest {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        new MoveZeroesTest().moveZeroes(nums);
        System.out.println(nums);
    }

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int i = 0, j = 0;
        while (j < nums.length) {
            if (i >= j) {
                j++;
                continue;
            }
            if (nums[i] != 0) {
                i++;
                continue;
            }
            if (nums[j] == 0) {
                j++;
                continue;
            }
            nums[i] = nums[j];
            nums[j] = 0;

        }
    }
}
