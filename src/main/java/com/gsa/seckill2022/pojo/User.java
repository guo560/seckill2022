package com.gsa.seckill2022.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author gsa
 * @since 2022-09-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id，手机号码
     */
    private String id;

    private String nickname;

    private String password;

    private String slat;

    /**
     * 头像
     */
    private String head;

    private Date registerDate;

    private Integer loginCount;


}
