package com.davih.tst.alogrithm.t2025;

public class A20SearchMatrixTest {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            int num = matrix[row][col];
            if (num == target) {
                return true;
            } else if (num > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    public boolean searchMatrix1(int[][] matrix, int target) {
        for (int[] nums : matrix) {
            int searchIndex = search(nums, target);
            if (searchIndex >= 0) {
                return true;
            }
        }
        return false;
    }

    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = ((high - low) >> 1) + low;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                high = high - 1;
            } else {
                low = low + 1;
            }
        }

        return -1;
    }
}
