package com.springsecurity.service;

import com.springsecurity.bean.UserInfo;

/**
 * UserInfoService
 *
 * @author Qing2514
 * @since 0.0.1
 */
public interface UserInfoService {
    public UserInfo findByUsername(String username);
}
