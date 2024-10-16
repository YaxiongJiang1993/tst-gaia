package com.davih.tst.common.base.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DatetimeUtil {

    public static final String DEFAULT_DAY_PATTERN = "yyyy-MM-dd";
    public static final String DEFAULT_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String DATETIME_MILL_PATTERN = "yyyy-MM-dd HH:mm:ss.S";

    public static LocalDate long2LocalDate(long timestamp, String zoneOffset) {
        ZoneId zoneId = getZoneId(zoneOffset);
        return Instant.ofEpochMilli(timestamp)
                .atZone(zoneId)
                .toLocalDate();
    }

    public static String long2String(long timestamp, String zoneOffset) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DEFAULT_DATETIME_PATTERN);
        ZoneId zoneId = getZoneId(zoneOffset);
        return formatter.format(LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), zoneId));
    }

    public static String localDate2String(LocalDate localDate, String dayPattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dayPattern);
        return localDate.format(formatter);
    }

    public static String localDate2String(LocalDate localDate) {
        return localDate2String(localDate, DEFAULT_DAY_PATTERN);
    }

    public static LocalDate string2localDate(String localDateStr, String dayPattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dayPattern);
        return LocalDate.parse(localDateStr, formatter);
    }

    public static LocalDate string2localDate(String localDateStr) {
        return string2localDate(localDateStr, DEFAULT_DAY_PATTERN);
    }

    public static LocalDateTime long2LocalDateTime(long timestamp, String zoneOffset) {
        ZoneId zoneId = getZoneId(zoneOffset);
        return Instant.ofEpochMilli(timestamp)
                .atZone(zoneId)
                .toLocalDateTime();
    }

    public static long localDateTime2Long(LocalDateTime localDateTime, ZoneId zoneId) {
        return localDateTime.atZone(zoneId)
                .toInstant()
                .toEpochMilli();
    }

    public static long timeStr2Long(String timeStr, String zoneOffset) {
        return timeStr2Long(timeStr, DEFAULT_DATETIME_PATTERN, zoneOffset);
    }

    public static long timeStr2Long(String timeStr, String timeFormat, String zoneOffset) {
        ZoneId zoneId = getZoneId(zoneOffset);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(timeFormat);
        LocalDateTime localDateTime = LocalDateTime.parse(timeStr, formatter);
        return localDateTime.atZone(zoneId)
                .toInstant()
                .toEpochMilli();
    }

    public static ZoneId getZoneId(String zoneOffset) {
        String zoneOffsetStandard = getStandardZoneOffset(zoneOffset);
        return ZoneId.of(zoneOffsetStandard);
    }

    public static String getStandardZoneOffset(String zoneOffset) {
        if (!zoneOffset.startsWith("-") && !zoneOffset.startsWith("+")) {
            zoneOffset = "+".concat(zoneOffset);
        }
        String numberStr = zoneOffset.substring(1);
        String[] nums = numberStr.split("\\.");
        String firstNum = nums[0];
        if (firstNum.length() == 1) {
            firstNum = "0" + firstNum;
        }
        String secondNum = "";
        if (nums.length == 1) {
            secondNum = "00";
        } else {
            String secondTmp = nums[1];
            if ("5".equals(secondTmp)) {
                secondNum = "30";
            }
            if ("75".equals(secondTmp)) {
                secondNum = "45";
            }
        }
        return zoneOffset.charAt(0) + firstNum + ":" + secondNum;
    }

    public static LocalDateTime getMinTime(LocalDate localDate) {
        return localDate.atTime(LocalTime.MIN);
    }

    public static LocalDateTime getMaxTime(LocalDate localDate) {
        return localDate.atTime(LocalTime.MAX);
    }
}
