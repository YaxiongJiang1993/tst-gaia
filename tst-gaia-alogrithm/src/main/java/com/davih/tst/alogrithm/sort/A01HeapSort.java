package com.davih.tst.alogrithm.sort;

public class A01HeapSort {


    public static void main(String[] args) {
        int[] nums = new int[]{53, 17, 78, 9, 45, 65, 87, 32};
        new A01HeapSort().heapSort(nums);
        System.out.println(nums);
    }

    public void heapSort(int[] nums) {
        buildMaxHeap(nums);
        for (int i = nums.length; i > 1; i--) {
            swap(nums, 0, i - 1);
            headFirstV1(nums, 1, i - 1);
        }
    }

    public void buildMaxHeap(int[] nums) {
        for (int i = nums.length / 2; i > 0; i--) {
            headFirstV1(nums, i, nums.length);
        }
    }

    public void headFirstV1(int[] nums, int k, int len) {
        int tmp = nums[k - 1];
        for (int i = k * 2; i <= len; i = i * 2) {
            if (i < len && nums[i - 1] < nums[i]) {
                i++;
            }
            if (tmp >= nums[i - 1]) {
                break;
            } else {
                nums[k - 1] = nums[i - 1];
                k = i;
            }
        }
        nums[k - 1] = tmp;
    }

    public void heapSort(int[] nums, int len) {
        buildMaxHeap(nums, len);
        for (int i = len; i > 1; i--) {
            swap(nums, 1, i);
            headFirst(nums, 1, i - 1);
        }
    }

    public void buildMaxHeap(int[] nums, int len) {
        for (int i = len / 2; i > 0; i--) {
            headFirst(nums, i, len);
        }
    }

    public void headFirst(int[] nums, int k, int len) {
        nums[0] = nums[k];
        for (int i = k * 2; i <= len; i = i * 2) {
            if (i < len && nums[i] < nums[i + 1]) {
                i++;
            }
            if (nums[0] >= nums[i]) {
                break;
            } else {
                nums[k] = nums[i];
                k = i;
            }
        }

        nums[k] = nums[0];

    }

    public void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      