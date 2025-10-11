package com.davih.tst.alogrithm.t2025;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumTest {

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3};
        int k=3;
        int count = new SubArraySumTest().subArraySum(nums, k);
        System.out.println(count);
    }

    public int subArraySum(int[] nums, int k) {

        Map<Integer, Integer> preCountMap = new HashMap<>();
        preCountMap.put(0, 1);

        int pre = 0;
        int count = 0;
        for (int num : nums) {
            pre += num;
            if (preCountMap.containsKey(pre - k)) {
                count += preCountMap.get(pre - k);
            }
            preCountMap.put(pre, preCountMap.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
