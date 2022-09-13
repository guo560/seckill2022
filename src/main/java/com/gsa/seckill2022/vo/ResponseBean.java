package com.gsa.seckill2022.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class ResponseBean {
    private long code;
    private String message;
    private Object obj;

    public static ResponseBean success(){
        return new ResponseBean(ResponseBeanEnum.SUCCESS.getCode(), ResponseBeanEnum.SUCCESS.getMessage(), null);
    }

    public static ResponseBean success(Object obj){
        return new ResponseBean(ResponseBeanEnum.SUCCESS.getCode(), ResponseBeanEnum.SUCCESS.getMessage(), obj);
    }

    public static ResponseBean error(ResponseBeanEnum responseBeanEnum){
        return new ResponseBean(responseBeanEnum.getCode(), responseBeanEnum.getMessage(), null);
    }

    public static ResponseBean error(ResponseBeanEnum responseBeanEnum, Object obj){
        return new ResponseBean(responseBeanEnum.getCode(), responseBeanEnum.getMessage(), obj);
    }
}
