package com.davih.tst.alogrithm.t2025;

public class ProductExceptSelfTest11 {

    public int[] productExceptSelf(int[] nums) {

        int[] l = new int[nums.length];

        l[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            l[i] = l[i - 1] * nums[i - 1];
        }

        int r = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            l[i] = l[i] * r;
            r *= nums[i];
        }

        return l;
    }

    public int[] productExceptSelf0(int[] nums) {

        int[] l = new int[nums.length];
        int[] r = new int[nums.length];
        int[] answer = new int[nums.length];

        l[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            l[i] = l[i - 1] * nums[i - 1];
        }

        r[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            r[i] = r[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = l[i] * r[i];
        }

        return answer;
    }
}
