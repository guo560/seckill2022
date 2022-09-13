package com.gsa.seckill2022.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gsa.seckill2022.mapper.UserMapper;
import com.gsa.seckill2022.pojo.User;
import com.gsa.seckill2022.service.IUserService;
import com.gsa.seckill2022.utils.MD5Util;
import com.gsa.seckill2022.utils.ValidationUtil;
import com.gsa.seckill2022.vo.LoginVo;
import com.gsa.seckill2022.vo.ResponseBean;
import com.gsa.seckill2022.vo.ResponseBeanEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gsa
 * @since 2022-09-08
 */
@Service("userService")
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResponseBean doLogin(LoginVo loginVo) {
        if(null == loginVo)
            return ResponseBean.error(ResponseBeanEnum.ERROR);
        if(null == loginVo.getId())
            return ResponseBean.error(ResponseBeanEnum.MOBILE_EMPTY);
        if(!ValidationUtil.isValidMobile(loginVo.getId()))
            return ResponseBean.error(ResponseBeanEnum.MOBILE_ERROR);
        if(null == loginVo.getPassword())
            return ResponseBean.error(ResponseBeanEnum.CODE_EMPTY);
        if(!ValidationUtil.isMD5code(loginVo.getPassword()))
            return ResponseBean.error(ResponseBeanEnum.CODE_ERROR);
        User user = userMapper.selectById(loginVo.getId());
        if(null == user)
            return ResponseBean.error(ResponseBeanEnum.MOBILE_NOT_EXIST);
        if(!user.getPassword().equals(MD5Util.dbPassFromNetPass(loginVo.getPassword(), user.getSlat())))
            return ResponseBean.error(ResponseBeanEnum.MOBILE_PASSWORD_ERROR);
        return ResponseBean.success();
    }
}
