package com.spring.broker.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface PracticeService {

    /**
     *
     * @return ResponseEntity
     */
    Map<String, Object> getTest();
}