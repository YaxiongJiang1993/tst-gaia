package com.davih.tst.alogrithm.t2025;

import java.util.ArrayList;
import java.util.List;

public class A17SpiralOrderTest {

    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = n - 1;
        int top = 0, bottom = m - 1;

        List<Integer> nums = new ArrayList<>(m * n);
        while (left <= right && top <= bottom) {

            for (int col = left; col <= right; col++) {
                nums.add(matrix[top][col]);
            }
            for (int row = top + 1; row <= bottom; row++) {
                nums.add(matrix[row][right]);
            }
            if (left < right && top < bottom) {
                for (int col = right - 1; col > left; col--) {
                    nums.add(matrix[bottom][col]);
                }
                for (int row = bottom; row > top; row--) {
                    nums.add(matrix[row][left]);
                }
            }

            left++;
            right--;
            top++;
            bottom--;
        }

        return nums;
    }

    public List<Integer> spiralOrder1(int[][] matrix) {

        List<Integer> nums = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];
        int total = m * n;

        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int direction = 0;
        int row = 0, col = 0;
        for (int i = 0; i < total; i++) {
            nums.add(matrix[row][col]);
            visited[row][col] = true;
            int nextRow = row + directions[direction][0];
            int nextCol = col + directions[direction][1];
            if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n || visited[nextRow][nextCol]) {
                direction = (direction + 1) % directions.length;
            }

            row += directions[direction][0];
            col += directions[direction][1];
        }

        return nums;
    }
}
