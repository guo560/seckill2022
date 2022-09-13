package com.gsa.seckill2022.service;

import com.gsa.seckill2022.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gsa.seckill2022.vo.LoginVo;
import com.gsa.seckill2022.vo.ResponseBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gsa
 * @since 2022-09-08
 */
public interface IUserService extends IService<User> {

    ResponseBean doLogin(LoginVo loginVo);
}
