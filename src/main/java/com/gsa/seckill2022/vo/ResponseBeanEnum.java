package com.gsa.seckill2022.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum ResponseBeanEnum {
    SUCCESS(200, "SUCCESS"),
    ERROR(500, "服务端异常");

    private final long code;
    private final String message;
}
