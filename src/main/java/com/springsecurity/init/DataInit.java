package com.springsecurity.init;

import com.springsecurity.bean.UserInfo;
import com.springsecurity.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * DataInit
 *
 * @author Qing2514
 * @since 0.0.1
 */
@Service
public class DataInit {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @PostConstruct
    // 自动执行该方法
    public void dataInit() {
        UserInfo admin = new UserInfo();
        admin.setUsername("admin");
        admin.setPassword("123");
        admin.setRole(UserInfo.Role.admin);
        userInfoRepository.save(admin);

        UserInfo user = new UserInfo();
        user.setUsername("user");
        user.setPassword("123");
        user.setRole(UserInfo.Role.user);
        userInfoRepository.save(user);
    }
}
