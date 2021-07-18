package com.zhangxp.spring.security.bankend.vo;

import com.zhangxp.spring.security.bankend.entity.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class MyUser implements UserDetails {
    private String username;

    public MyUser(String username, String password, List<Role> authorities) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    public MyUser() {
    }

    private String password;
//    private boolean isAccountNonExpired;
//    private boolean isAccountNonLocked;
//    private boolean isCredentialsNonExpired;
//    private boolean isEnabled;
    private List<Role> authorities;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public void setAccountNonExpired(boolean accountNonExpired) {
//        isAccountNonExpired = accountNonExpired;
//    }
//
//    public void setAccountNonLocked(boolean accountNonLocked) {
//        isAccountNonLocked = accountNonLocked;
//    }
//
//    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
//        isCredentialsNonExpired = credentialsNonExpired;
//    }
//
//    public void setEnabled(boolean enabled) {
//        isEnabled = enabled;
//    }

    public void setAuthorities(List<Role> authorities) {
        this.authorities = authorities;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", authorities=" + authorities +
                '}';
    }
}
