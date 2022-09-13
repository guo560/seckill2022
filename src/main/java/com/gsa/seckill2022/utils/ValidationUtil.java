package com.gsa.seckill2022.utils;

import java.util.regex.Pattern;

public class ValidationUtil {
    private static final Pattern MOBILE_PATTERN = Pattern.compile("^1[3-9]{2}\\d{8}$");
    private static final Pattern MD5_PATTERN = Pattern.compile("[\\da-f]{32}");
    public static boolean isValidMobile(String mobile){
        return MOBILE_PATTERN.matcher(mobile).matches();
    }

    public static boolean isMD5code(String password){
        return MD5_PATTERN.matcher(password).matches();
    }
}
