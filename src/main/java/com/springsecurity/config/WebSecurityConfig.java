package com.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * WebSecurityConfig
 *
 * @author Qing2514
 * @since 0.0.1
 */
@Configuration
// 启用 spring security
@EnableWebSecurity
// 会拦截注释了
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 基于内存方式，构建两个账号，一个管理员，一个普通用户
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password(bCryptPasswordEncoder().encode("123456"))
                .roles("admin");

        auth.inMemoryAuthentication()
                .withUser("user")
                .password(bCryptPasswordEncoder().encode("123456"))
                .roles("user");
    }
}
