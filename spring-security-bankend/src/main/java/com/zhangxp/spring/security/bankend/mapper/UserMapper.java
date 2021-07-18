package com.zhangxp.spring.security.bankend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhangxp.spring.security.bankend.entity.User;
import com.zhangxp.spring.security.bankend.vo.MyUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhangxp
 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * 通过用户名查找用户
     * @param name 用户名
     * @return 该用户名查到的用户list
     */
    List<MyUser> findUserByName(@Param("username") String username);
}
