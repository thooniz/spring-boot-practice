package com.spring.broker.userInfo.repository;

import com.spring.broker.userInfo.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Integer> {
}
