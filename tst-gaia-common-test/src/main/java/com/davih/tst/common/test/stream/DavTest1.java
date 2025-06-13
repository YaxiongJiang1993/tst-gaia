package com.davih.tst.common.test.stream;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DavTest1 {

    public static void main(String[] args) {
        List<Integer> nums = Lists.newArrayList(1, 2, 3, 4, 5);
        Set<Integer> res = nums.stream()
                .map(e -> {
                    System.out.println("map, thread: " + Thread.currentThread().getName() + ", num: " + e);
                    return e * 10;
                })
                .filter(e->{
                    System.out.println("filter, thread: "+Thread.currentThread().getName()+", num: "+e);
                    return e>100;
                })
                .collect(Collectors.toSet());
        System.out.println(res);
    }
}
