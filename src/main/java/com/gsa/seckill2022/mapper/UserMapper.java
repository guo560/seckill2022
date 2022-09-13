package com.gsa.seckill2022.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gsa.seckill2022.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gsa
 * @since 2022-09-08
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
