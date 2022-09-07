package com.gsa.seckill2022.utils;


import org.apache.commons.codec.digest.DigestUtils;

public class MD5Util {
    public static final String salt="1a2b3c";

    public static String md5(String src){
        return DigestUtils.md5Hex(src);
    }

    public static String netPassFromInputPass(String inputPass){
        String str = salt.charAt(0)+salt.charAt(2)+inputPass+salt.charAt(5)+salt.charAt(4);
        return md5(str);
    }

    public static String dbPassFromNetPass(String netPass, String salt){
        String str = salt.charAt(0)+salt.charAt(2)+netPass+salt.charAt(5)+salt.charAt(4);
        return md5(str);
    }

    public static String dbPassFromInputPass(String inputPass, String salt){
        String netPass = netPassFromInputPass(inputPass);
        String dbPass = dbPassFromNetPass(netPass, salt);
        return dbPass;
    }

    public static void main(String[] args) {
        System.out.println(netPassFromInputPass("123456"));
        System.out.println(dbPassFromNetPass("ce21b747de5af71ab5c2e20ff0a60eea", "1a2b3c4d"));
        System.out.println(dbPassFromInputPass("123456", "1a2b3c4d"));
    }
}
