package com.davih.tst.common.test.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DavTest {

    public static void main(String[] args) {
        test2();
    }

    private static void test1() {

        LocalDate currentDate = LocalDate.now();
        currentDate = currentDate.plusDays(1L);
        System.out.println("currentDate: " + currentDate);
        LocalDate monday = currentDate.with(DayOfWeek.MONDAY);
        System.out.println("monday: " + monday);
    }

    private static void test2() {

        LocalDateTime now = LocalDateTime.now();
        now = now.minusDays(1L);

        // 获取本周一的 LocalDateTime
        LocalDateTime monday = now.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));

        System.out.println("当前时间: " + now);
        System.out.println("本周一时间: " + monday);

        LocalDateTime mondayDt = monday.minusWeeks(1L);
        System.out.println("本周一时间: " + mondayDt);
    }
}
