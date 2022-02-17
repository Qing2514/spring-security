package com.springsecurity.repository;

import com.springsecurity.bean.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserInfoRepository
 *
 * @author Qing2514
 * @since 0.0.1
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    public UserInfo findByUsername(String username);
}
