package com.davih.tst.common.test.grep;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DavTest {

    private static final Pattern PARAM_PATTERN = Pattern.compile("\\$\\{([^}]*)\\}");

    public static void main(String[] args) {
        String paramStr = "${dt-1} ${dt}";
        LocalDateTime now = LocalDateTime.now();

        System.out.println(parseParams(paramStr, now));

    }

    public static String parseParams(String paramStr, LocalDateTime time) {

        Matcher matcher = PARAM_PATTERN.matcher(paramStr);
        while (matcher.find()) {
            String paramName = matcher.group(1);
            System.out.println(paramName);
        }
        return paramStr;
    }
}
