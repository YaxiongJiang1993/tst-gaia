package com.davih.tst.common.test.crontab;

import cn.hutool.core.util.StrUtil;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author david
 * @Date 2022/5/24 15:33
 */
public class ParamUtil {
    private final Pattern BLANK_PATTERN = Pattern.compile("\\s+");
    private final Pattern PARAM_PATTERN = Pattern.compile("\\$\\{([^}]*)\\}");
    private final String BLANK = " ";
    private final String OP_ADD = "+";
    private final String OP_SUB = "-";
    private Map<String, DateTimeFormatter> validParamNames = new HashMap<>();
    private Long HOUR_MILIS = 3600000L;

    public void init() {
        DateTimeFormatter HOUR = DateTimeFormatter.ofPattern("yyyyMMddHH");
        DateTimeFormatter DAY = DateTimeFormatter.ofPattern("yyyyMMdd");
        DateTimeFormatter WEEK = DateTimeFormatter.ofPattern("yyyyMMdd");
        DateTimeFormatter MON = DateTimeFormatter.ofPattern("yyyyMM");
        DateTimeFormatter DAY10 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter WEEK10 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter MON7 = DateTimeFormatter.ofPattern("yyyy-MM");

        validParamNames.put("hour", HOUR);
        validParamNames.put("dt", DAY);
        validParamNames.put("week", WEEK);
        validParamNames.put("mon", MON);
        validParamNames.put("dt10", DAY10);
        validParamNames.put("week10", WEEK10);
        validParamNames.put("mon7", MON7);
        validParamNames.put("mt", DAY);

        /*
         * 时间戳， ts表示今天0点的时间戳， 获取+/- n个小时后的时间戳
         * 比如： 昨天早上8点  ts - 16
         * 比如： 昨天早上8点  ts + 8
         * */
        validParamNames.put("ts", DAY10);
    }

    private String trim(String param) {
        return BLANK_PATTERN.matcher(param.trim()).replaceAll(BLANK);
    }

    public boolean validateParam(String paramStr) {
        if (StrUtil.isBlank(paramStr)) {
            return true;
        }
        Matcher matcher = PARAM_PATTERN.matcher(paramStr);
        while (matcher.find()) {
            String paramName = matcher.group(1);
            paramName = paramName.replace(BLANK, "");
            if (paramName.contains("+")) {
                String[] split = paramName.split("\\+");
                paramName = split[0];
            } else if (paramName.contains(OP_SUB)) {
                String[] split = paramName.split(OP_SUB);
                paramName = split[0];
            }
            if (!validParamNames.containsKey(paramName)) {
                return false;
            }
        }
        return true;
    }

    public String parseParams(String paramStr, LocalDateTime time) {
        if (StrUtil.isBlank(paramStr)) {
            return "";
        }
        Matcher matcher = PARAM_PATTERN.matcher(paramStr);
        while (matcher.find()) {
            String paramName = matcher.group(1);
            String paramValue = parseSingleParam(paramName, time);
            paramStr = paramStr.replace(matcher.group(), paramValue);
        }
        return paramStr;
    }

    private String parseSingleParam(String param, LocalDateTime time) {
        param = param.replace(BLANK, "");
        if (StrUtil.isBlank(param)) {
            return "";
        }
        String op = OP_ADD;
        Long opNumber = 0L;
        DateTimeFormatter formatter = null;
        String type = param;
        if (param.contains(OP_ADD)) {
            String[] split = param.split("\\+");
            formatter = validParamNames.get(split[0]);
            type = split[0];
            opNumber = Long.valueOf(split[1]);
        } else if (param.contains(OP_SUB)) {
            String[] split = param.split(OP_SUB);
            op = OP_SUB;
            formatter = validParamNames.get(split[0]);
            type = split[0];
            opNumber = Long.valueOf(split[1]);
        } else {
            formatter = validParamNames.get(param);

        }
        String value = getParamValue(type, op, opNumber, formatter, time);
        return value;
    }

    private String getParamValue(String type, String op, Long opNumber, DateTimeFormatter formatter, LocalDateTime now) {
        if (now == null) {
            now = LocalDateTime.now();
        }
        if (Objects.equals("ts", type)) {
            return tsFormat(now, op, opNumber);
        }
        if (opNumber > 0) {
            switch (type) {
                case "hour":
                case "hour13":
                    now = Objects.equals(op, OP_ADD) ? now.plusHours(opNumber) : now.minusHours(opNumber);
                    break;
                case "dt":
                case "dt10":
                    now = Objects.equals(op, OP_ADD) ? now.plusDays(opNumber) : now.minusDays(opNumber);
                    break;
                case "week":
                case "week10":
                    now = now.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
                    now = Objects.equals(op, OP_ADD) ? now.plusWeeks(opNumber) : now.minusWeeks(opNumber);
                    break;
                case "mon":
                case "mon7":
                    now = Objects.equals(op, OP_ADD) ? now.plusMonths(opNumber) : now.minusMonths(opNumber);
                    break;
                case "mt":
                    LocalDate today = now.toLocalDate();
                    LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
                    now = firstDayOfMonth.atStartOfDay();
                    break;
                default:
                    System.out.println("Invalid Param Name");
            }
        }
        return now.format(formatter);
    }

    private String tsFormat(LocalDateTime now, String op, Long opNumber) {
        long nowTime = now.toLocalDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long diff = opNumber * HOUR_MILIS;
        return String.valueOf(Objects.equals(op, OP_ADD) ? nowTime + diff : nowTime - diff);
    }

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        now = now.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        System.out.println(now);
        // 获取当前日期
        LocalDate today = now.toLocalDate();

        // 获取当月的第一天
        LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());

        LocalDateTime dateTime = firstDayOfMonth.atStartOfDay();
        DateTimeFormatter MON = DateTimeFormatter.ofPattern("yyyyMM");
        DateTimeFormatter WEEK = DateTimeFormatter.ofPattern("yyyyMMdd");

        // 打印结果
        System.out.println("当月第一天是: " + firstDayOfMonth);
        String fiMon = dateTime.format(WEEK);
        System.out.println(fiMon);
    }
}
