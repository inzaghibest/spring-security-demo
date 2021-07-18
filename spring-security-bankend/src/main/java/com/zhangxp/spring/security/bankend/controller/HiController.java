package com.zhangxp.spring.security.bankend.controller;

import com.zhangxp.spring.security.bankend.vo.MyUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HiController {
    @GetMapping("/r1")
    public String r1() {
        return getPricapl()+"资源r1";
    }

    @GetMapping("/r2")
    public String r2() {
        return getPricapl() + "资源r2";
    }

    /**
     * 获取用户信息
     * @return 当前登录用户名
     */
    public String getPricapl(){
       String username = "匿名用户";
       Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
       Object principal = authentication.getPrincipal();
       if (principal == null) {
           return username;
       }
       if (principal instanceof MyUser) {
           username =((MyUser)principal).getUsername();
       }
       return username;
    }
}
