package com.spring.broker.userInfo.controller;


import com.spring.broker.userInfo.entity.UserInfoEntity;
import com.spring.broker.userInfo.repository.UserInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    UserInfoRepository userInfoRepository;

    @GetMapping(value = "/{userId}")
    List<UserInfoEntity> getUser(@PathVariable String userId) {

        log.info("================== 1. controller getUser Start : {} ==================", userId);

        return userInfoRepository.findAll();
    }
}