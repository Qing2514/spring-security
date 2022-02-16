package com.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author Qing2514
 * @since 0.0.1
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "hello spring security";
    }

    @GetMapping("/admin")
    // 只有管理员可以访问，普通用户访问会403
    @PreAuthorize("hasAnyRole('admin')")
    public String helloAdmin() {
        return "hello admin";
    }

    @GetMapping("/user")
    // 管理员和普通用户都可以访问
    @PreAuthorize("hasAnyRole('admin', 'user')")
    public String helloUser() {
        return "hello user";
    }
}
