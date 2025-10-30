package com.davih.tst.alogrithm.t2025;

/**
 * https://leetcode.cn/problems/search-a-2d-matrix/solutions/688117/sou-suo-er-wei-ju-zhen-by-leetcode-solut-vxui/
 */
public class A21SearchMatrixITest {


    public boolean searchMatrix(int[][] matrix, int target) {
        int num = searchNumBin(matrix, target);
        if (num < 0) {
            return false;
        }
        return true;
    }

    public int searchNumBin(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m * n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            int row = mid / n;
            int col = mid % n;
            int num = matrix[row][col];
            if (num == target) {
                return mid;
            } else if (num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public boolean searchMatrix1(int[][] matrix, int target) {
        int row = searchRow(matrix, target);
        if (row < 0) {
            return false;
        }
        int num = searchNum(matrix[row], target);
        if (num < 0) {
            return false;
        }
        return true;
    }


    public int searchRow(int[][] matrix, int target) {
        int low = -1, high = matrix.length - 1;
        while (low < high) {
            int mid = low + ((high - low + 1) >> 1);
            if (matrix[mid][0] <= target) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public int searchNum(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }


    public int searchLastLe(int[] nums, int target) {
        int low = -1, high = nums.length - 1;
        while (low < high) {
            int mid = low + ((high - low + 1) >> 1);
            if (nums[mid] <= target) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }


    public int searchFirstLt(int[] nums, int target) {
        int low = 0, high = nums.length;
        while (low < high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public int searchBin(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            int num = nums[mid];
            if (target == num) {
                return mid;
            } else if (num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

}
