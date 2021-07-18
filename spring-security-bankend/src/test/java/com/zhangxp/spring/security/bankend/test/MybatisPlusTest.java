package com.zhangxp.spring.security.bankend.test;

import com.zhangxp.spring.security.bankend.entity.User;
import com.zhangxp.spring.security.bankend.mapper.UserMapper;
import com.zhangxp.spring.security.bankend.vo.MyUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootTest
public class MybatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void findUserByName() {
        List<MyUser> myUserList = userMapper.findUserByName("zhangxp");
        for (MyUser user: myUserList) {
            System.out.println(user);
        }
    }

    @Test
    public void testBCrypt() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String pass = bCryptPasswordEncoder.encode("111111");
        System.out.println(pass);
    }
}
