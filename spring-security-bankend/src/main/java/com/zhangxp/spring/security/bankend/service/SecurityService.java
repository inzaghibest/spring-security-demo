package com.zhangxp.spring.security.bankend.service;

import org.springframework.security.access.annotation.Secured;

public interface SecurityService {
    @Secured("IS_AUTHENTICATED_ANONYMOUSLY")
    public String anonMehtod();


    @Secured("ROLE_TELLER")
    public String tellerMethod();
}
