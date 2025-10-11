package com.davih.tst.alogrithm.t2025;

public class MaxAreaTest {

    public static void main(String[] args) {
        int[] nums = new int[]{1,8,6,2,5,4,8,3,7};
        int length = new MaxAreaTest().maxArea(nums);
        System.out.println(length);
    }

    public int maxArea(int[] height) {

        int i = 0, j = height.length - 1;
        int maxArea = 0;
        while (i < j) {
            int area = (j - i) * Math.min(height[i], height[j]);
            maxArea = Math.max(area, maxArea);
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }

        return maxArea;
    }
}
