package com.davih.tst.alogrithm.t2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeTest {

    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        int[][] intervals1=new MergeTest().merge(intervals);
        System.out.println(intervals1);
    }

    public int[][] merge(int[][] intervals) {
        if (null == intervals || intervals.length == 0) {
            return new int[0][2];
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> merged=new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            int l=intervals[i][0];
            int r=intervals[i][1];
            if(i==0||merged.get(merged.size()-1)[1]<l){
                merged.add(intervals[i]);
            }else{
                int[] interval=merged.get(merged.size()-1);
                interval[1]=Math.max(interval[1], r);
            }
        }

        return merged.toArray(new int[merged.size()][2]);
    }
}
