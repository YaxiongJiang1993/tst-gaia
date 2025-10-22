package com.davih.tst.alogrithm.t2025;

public class A19RotateTest {

    public void rotate(int[][] matrix) {

        int n = matrix.length;

        int rowLen = n / 2;
        int colLen = (n + 1) / 2;
        for (int row = 0; row < rowLen; row++) {
            for (int col = 0; col < colLen; col++) {
                int t = matrix[row][col];
                matrix[row][col] = matrix[n - col - 1][row];
                matrix[n - col - 1][row] = matrix[n - row - 1][n - col - 1];
                matrix[n - row - 1][n - col - 1] = matrix[col][n - row - 1];
                matrix[col][n - row - 1] = t;
            }
        }
    }
}
