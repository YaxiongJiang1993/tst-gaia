package com.davih.tst.common.test.bitmap;

import com.google.common.collect.Lists;
import org.roaringbitmap.longlong.Roaring64NavigableMap;

import java.util.List;
import java.util.Random;

public class BitmapDeepOffsetTest {

    public static void main(String[] args) {
        Roaring64NavigableMap bitmap = new Roaring64NavigableMap();
        bitmap.add(1L);
        bitmap.add(3L);
        bitmap.add(2L);
        for (int i=0; i<bitmap.getLongCardinality(); i++){
            System.out.println(bitmap.select(i));
        }
        System.out.println("end");

    }

    private static void testSelect(){
        Roaring64NavigableMap bitmap = new Roaring64NavigableMap();
        Random r = new Random();
        for (long i = 0L; i < 100L * 10000; i++) {
            bitmap.addLong(i * r.nextInt(1000));
        }
        long cardinality = bitmap.getLongCardinality();
        System.out.println("cardinality: " + cardinality);
        long start = System.currentTimeMillis();
        System.out.println("start: " + start);
        List<Long> nums = Lists.newArrayList();
        for (long j = cardinality - 1000; j < cardinality; j++) {
            nums.add(bitmap.select(j));
        }
        /*for (long j = 0; j < 1000; j++) {
            nums.add(bitmap.select(j));
        }*/
        System.out.println("waste: " + (System.currentTimeMillis() - start));
        System.out.println("nums: " + nums);
    }
}
