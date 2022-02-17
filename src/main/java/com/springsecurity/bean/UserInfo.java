package com.springsecurity.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * UserInfo
 *
 * @author Qing2514
 * @since 0.0.1
 */
@Entity
@Data
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;
    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    public enum Role {
        // 管理员
        admin,
        // 普通用户
        user
    }
}
