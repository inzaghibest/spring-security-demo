package com.zhangxp.spring.security.bankend.controller;

import com.zhangxp.spring.security.bankend.service.SecurityServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sec")
public class SecurityController {
    @Autowired
    private  SecurityServiceImp securityServiceImp;

    @GetMapping("/ano")
    public String ano() {
        return securityServiceImp.anonMehtod();
    }

    @GetMapping("/tel")
    public String tel() {
        return securityServiceImp.tellerMethod();
    }

    @GetMapping("/Ano")
    @PreAuthorize("isAnonymous()")
    public String ano2() {
        return "This is a 匿名访问的方法";
    }

    @GetMapping("/p1")
    @PreAuthorize("hasAnyAuthority('p1')")
    public String p1() {
        return "这是一个拥有p1权限才能访问的方法!";
    }
}
