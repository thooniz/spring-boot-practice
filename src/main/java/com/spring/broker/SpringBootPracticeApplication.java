package com.spring.broker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootPracticeApplication {

    public static void main(String[] args) {

        log.info("================== 1. main Start : {} ==================", "OK");

        /*
        @Value("${server.port}")
        String value;
        log.debug("================== 2. Slf4j Test : {}", );
        */

        SpringApplication.run(SpringBootPracticeApplication.class, args);
    }

}
