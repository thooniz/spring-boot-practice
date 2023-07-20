package com.spring.broker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootPracticeApplication {

    public static void main(String[] args) {
        log.info("Slf4j 테스트");
        SpringApplication.run(SpringBootPracticeApplication.class, args);
    }

}
