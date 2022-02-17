package com.springsecurity.service.impl;

import com.springsecurity.bean.UserInfo;
import com.springsecurity.repository.UserInfoRepository;
import com.springsecurity.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserInfoServiceImpl
 *
 * @author Qing2514
 * @since 0.0.1
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByUsername(String username) {
        return userInfoRepository.findByUsername(username);
    }
}
