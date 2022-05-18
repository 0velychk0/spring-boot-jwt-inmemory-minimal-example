package com.ovelychko.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JwtUserDetailService extends InMemoryUserDetailsManager {
    JwtUserDetailService() {
        List<UserDetails> users = new ArrayList<>();
        createUser(User.withDefaultPasswordEncoder().username("admin").password("test").roles("USER", "ADMIN").build());
        createUser(User.withDefaultPasswordEncoder().username("user").password("test").roles("USER").build());
    }
}
