package com.davih.tst.alogrithm.t2025;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveTest {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int length = new LongestConsecutiveTest().LongestConsecutiveTest(nums);
        System.out.println(length);
    }

    public int LongestConsecutiveTest(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        Set<Integer> numsSet = new HashSet<>(nums.length);
        for (int num : nums) {
            numsSet.add(num);
        }
        int longest = 0;
        for (int num : numsSet) {
            if (!numsSet.contains(num - 1)) {
                int numTmp = num;
                int length = 1;
                while (numsSet.contains(numTmp + 1)) {
                    numTmp++;
                    length++;
                }
                longest=Math.max(longest, length);
            }
        }
        return longest;
    }
}
