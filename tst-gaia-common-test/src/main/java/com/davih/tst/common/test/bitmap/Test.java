package com.davih.tst.common.test.bitmap;

import org.roaringbitmap.RoaringBitmap;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        RoaringBitmap rr = RoaringBitmap.bitmapOf(1, 2, 3, 1000);
        RoaringBitmap rr2 = new RoaringBitmap();
        rr.add(4000L, 4005L);
        // 第三个数值，索引从0开始
        int thirdvalue = rr.select(4);
        // 2这个值的排序，排序索引从1开始，如果不在是0
        int indexoftwo = rr.rank(2);

        System.out.println(thirdvalue);
        System.out.println(indexoftwo);

    }

    // Method to get a specific page from a RoaringBitmap
    public static List<Integer> getPage(RoaringBitmap bitmap, int pageSize, int pageNumber) {
        RoaringBitmap pageBitmap = new RoaringBitmap();

        // Calculate the starting index for the page
        int start = pageNumber * pageSize;

        // Calculate the ending index for the page
        int end = Math.min((pageNumber + 1) * pageSize, bitmap.getCardinality());

        // Find the rank of the starting index
        int rank = bitmap.rank(start);

        // Find the select of the ending index
        int select = bitmap.select(rank + 1); // rank + 1 to get the next set bit after the starting index

        // Add the range of elements to the pageBitmap
        pageBitmap.add(start, select);

        return null;
    }
}
