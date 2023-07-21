package com.spring.broker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootPracticeApplication {

    public static void main(String[] args) {
        log.info("================== 1. main Start : {} ==================", "OK");

        SpringApplication.run(SpringBootPracticeApplication.class, args);
    }

}