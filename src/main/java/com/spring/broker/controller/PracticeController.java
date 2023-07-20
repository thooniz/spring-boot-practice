package com.spring.broker.controller;

import com.spring.broker.service.PracticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PracticeController {

    private final PracticeService practiceService;

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> getTest() {

        log.info("================== 2. test Controller Start : {} ==================", "OK");

        Map<String, Object> response = practiceService.getTest();

        log.info("================== 3. test Controller End : {} ==================", response);

        return response;
    }

}