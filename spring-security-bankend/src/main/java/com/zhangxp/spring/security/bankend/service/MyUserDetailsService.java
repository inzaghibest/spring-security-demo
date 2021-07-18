package com.zhangxp.spring.security.bankend.service;

import com.zhangxp.spring.security.bankend.mapper.UserMapper;
import com.zhangxp.spring.security.bankend.vo.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        List<User> userList = userMapper.selectOne();
        List<MyUser> userList = userMapper.findUserByName(s);
        if (userList.size()> 0)
        {
            return userList.get(0);
        }
        return null;
    }
}
