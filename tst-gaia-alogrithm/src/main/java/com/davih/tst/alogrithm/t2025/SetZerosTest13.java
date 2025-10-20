package com.davih.tst.alogrithm.t2025;

public class SetZerosTest13 {


    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean col0 = false;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                col0 = true;
            }
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = 1; j < n; j++) {
                if ((matrix[i][0] == 0) || (matrix[0][j] == 0)) {
                    matrix[i][j] = 0;
                }
            }
            if (col0) {
                matrix[i][0] = 0;
            }
        }

    }

    public void setZeroes1(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] rowFlag = new boolean[m];
        boolean[] colFlag = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowFlag[i] = true;
                    colFlag[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowFlag[i] || colFlag[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
