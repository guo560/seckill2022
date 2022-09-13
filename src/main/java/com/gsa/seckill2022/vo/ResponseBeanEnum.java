package com.gsa.seckill2022.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum ResponseBeanEnum {
    SUCCESS(200, "SUCCESS"),
    ERROR(500, "服务端异常"),

    MOBILE_EMPTY(500200, "手机号不能为空"),
    CODE_EMPTY(500201, "密码不能为空"),
    MOBILE_ERROR(500202, "手机号格式错误"),
    CODE_ERROR(500203, "MD5错误"),
    MOBILE_NOT_EXIST(500204, "用户不存在"),
    MOBILE_PASSWORD_ERROR(500205, "用户名或密码错误"),
    SESSION_ERROR(500206, "身份验证失败，请重新登录");

    private final long code;
    private final String message;
}
