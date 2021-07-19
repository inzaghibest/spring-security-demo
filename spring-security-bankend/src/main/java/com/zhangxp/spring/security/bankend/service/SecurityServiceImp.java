package com.zhangxp.spring.security.bankend.service;

import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImp implements SecurityService{
    @Override
    public String anonMehtod() {
        return "This is a 匿名方法";
    }

    @Override
    public String tellerMethod() {
        return "这是一个需要角色teller的方法";
    }
}
